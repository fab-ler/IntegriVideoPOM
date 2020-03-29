package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;

public class SignUpPage extends BasePage {

    By emailInput = By.name("email");
    By passwordInput = By.name("password");
    By signUpButton = By.cssSelector(".btn.btn-primary");
    By alertMessage = By.xpath("//*[contains(text(),'Message with instructions was sent')]");

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get("https://dev.integrivideo.com/signup");
    }

    public void loginInput(String emailValue) {
        WebElement loginField = driver.findElement(emailInput);
        loginField.click();
        loginField.sendKeys(emailValue);
    }

    public void passwordInput(String passwordValue) {
        WebElement passwordField = driver.findElement(passwordInput);
        passwordField.click();
        passwordField.sendKeys(passwordValue);
    }

    public void clickSubmit() {
        driver.findElement(signUpButton).click();
    }

    public void find() {
        driver.findElement(alertMessage);
    }

    public void verifyMessageTextAlert(String expectedMessage) {
        assertEquals(driver.findElement(alertMessage), expectedMessage);
    }
}
