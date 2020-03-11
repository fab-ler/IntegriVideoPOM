package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.AddProjectsPage;
import pages.LoginPage;
import pages.SignUpPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    SignUpPage signUpPage;
    LoginPage loginPage;
    AddProjectsPage addProjectsPage;
    private WebDriver driver;

    @BeforeMethod
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        signUpPage = new SignUpPage(driver);
        loginPage = new LoginPage(driver);
        addProjectsPage = new AddProjectsPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
        driver.quit();
    }

}
