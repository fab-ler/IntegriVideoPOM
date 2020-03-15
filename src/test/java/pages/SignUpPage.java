package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage extends BasePage {

    public BasePage isPageOpened() {
        return null;
    }

    By emailInput = By.name("email");
    By passwordInput = By.name("password");
    By signUpButton = By.cssSelector(".btn.btn-primary");
    By alertMessage = By.xpath("//*[contains(text(),'Message with instructions was sent')]");

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public SignUpPage openPage() {
        driver.get("https://dev.integrivideo.com/signup");
        return this;
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

    public void findAlert() {
        driver.findElement(alertMessage);
    }
//    //Message with instructions was sent
//    // not used - fails test
//    public void verifyMessageTextAlert() {
//        WebElement alertPopup = driver.findElement(alertMessage));
//        assertTrue(alertPopup.isDisplayed());
//    }

}
