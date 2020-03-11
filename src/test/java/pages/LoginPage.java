package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    By userEmail = By.name("email");
    By userPassword = By.name("password");
    By loginButton = By.xpath("//*[text()='Log in']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get("https://dev.integrivideo.com/login");
    }

    public void userLoginInput(String userEmailValue) {
        WebElement loginField = driver.findElement(userEmail);
        loginField.click();
        loginField.sendKeys(userEmailValue);
    }

    public void userPasswordInput(String userPasswordValue) {
        WebElement passwordField = driver.findElement(userPassword);
        passwordField.click();
        passwordField.sendKeys(userPasswordValue);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
}
