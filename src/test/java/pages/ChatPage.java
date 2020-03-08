package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class ChatPage extends BasePage {

    By inputArea = By.xpath("//*[@placeholder='Start typing here']");
    By inviteLink = By.id("invite-users-to-chat");

    public ChatPage(WebDriver driver) {
        super(driver);
    }

    public String inviteClick() {
        driver.findElement(inviteLink).click();
        try {
            return (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        } catch (HeadlessException e) {
            e.printStackTrace();
        } catch (UnsupportedFlavorException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void openPage() {
        driver.get("https://dev.integrivideo.com/demo/chat/new");
    }

    public void writeText(String text) {
        driver.findElement(By.cssSelector("textarea")).sendKeys(text);
    }

    public void clickSend() {
        driver.findElement(By.cssSelector(".integri-chat-send-message")).click();
    }

//    public void sendMessage () {
//        driver.findElement(By.id("123")).click();
//        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(".integri-message-text"),1);
//    }

    // new
    public void sendMessageByPressingEnterButton() {
        driver.findElement(inputArea).sendKeys(Keys.ENTER);
    }

    public void messageShouldExist(int messageIndex, String text) {
        List<WebElement> messages = driver.findElements(By.cssSelector(".integri-chat-message-text"));
        boolean isExist = messages.get(messageIndex - 1).getText().equals(text);
        assertTrue(isExist, "Message does not exist");
    }
}
