package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.ChatPage;
import pages.SettingsPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    ChatPage chatPage;
    SettingsPage settingsPage;
    private WebDriver driver;


    @BeforeMethod
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        chatPage = new ChatPage(driver);
        settingsPage = new SettingsPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
        driver.quit();
    }

}
