package pages;
/*
переписать под PageFactory
 */

import models.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    @FindBy(name = "email")
    WebElement emailField;
    @FindBy(name = "password")
    WebElement passwordField;
    @FindBy(xpath = "//*[text()='Log in']")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOf(loginButton));
        return this;
    }

    public LoginPage openPage() {
        driver.get("https://dev.integrivideo.com/login");
        isPageOpened();
        return this;
    }

    public LoginPage writeEmail(String email) {
        emailField.sendKeys(email);
        return this;
    }

    public LoginPage writePassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public ProjectPage clickLogin() {
        loginButton.click();
        ProjectPage projects = new ProjectPage(driver);
        projects.isPageOpened();
        return projects;
    }

    public void login(User user) {
        writeEmail(user.getEmail());
        writePassword(user.getPassword());
        clickLogin();
    }
}
