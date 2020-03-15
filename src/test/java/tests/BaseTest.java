package tests;

import models.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import pages.ProjectPage;
import pages.SignUpPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    ProjectPage projectPage;
    SignUpPage signUpPage;
    LoginPage loginPage;
    User user;
    private WebDriver driver;

    @BeforeMethod
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        signUpPage = new SignUpPage(driver);
        loginPage = new LoginPage(driver);
        projectPage = new ProjectPage(driver);
        user = new User("hkj@mailinator.com", "0123456789");
        ;
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
        driver.quit();
    }

}
