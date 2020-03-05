package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;

public class SettingsPage extends BasePage {

    By userName = By.name("userName");
    By userEmail = By.name("userEmail");
    By userPhotoURL = By.name("userPic");
    By closeIcon = By.xpath(("//*[contains(text(),'Settings')]//*[contains(@class,'close-integri-modal')]"));
    By saveButton = By.cssSelector(".integri-user-settings-save.integri-button-blue");

    public SettingsPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get("https://dev.integrivideo.com/demo/chat/new");
    }

    public void clickSettings() {
        driver.findElement(By.cssSelector(".integri-chat-settings")).click();
    }

    public void setNameValue(String nameValue) {
        WebElement nameField = driver.findElement(userName);
        nameField.click();
        nameField.clear();
        nameField.sendKeys(nameValue);
    }

    public void setEmailValue(String emailValue) {
        WebElement nameField = driver.findElement(userEmail);
        nameField.clear();
        nameField.sendKeys(emailValue);
    }

    public void setPhotoURLValue(String photoURLValue) {
        WebElement nameField = driver.findElement(userPhotoURL);
        nameField.clear();
        nameField.sendKeys(photoURLValue);
    }

    public void clickSaveButton() {
        WebElement saveButtonElement = driver.findElement(saveButton);
        saveButtonElement.click();
    }

    // закрыть модальное окно для выхода без сохранения изменений
    public void clickCloseFormButton() {
        driver.findElement(closeIcon).click();
    }

    public void verifyNameValue(String name) {
        assertEquals(driver.findElement(userName).getAttribute("value"), name);
    }

    public void verifyEmailValue(String email) {
        assertEquals(driver.findElement(userEmail).getAttribute("value"), email);
    }

    public void verifyPhotoURLValue(String photoURL) {
        assertEquals(driver.findElement(userPhotoURL).getAttribute("value"), photoURL);
    }
}

