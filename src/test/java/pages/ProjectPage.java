package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectPage extends BasePage {
    By addProjectButton = By.cssSelector(".project.new");

    public ProjectPage(WebDriver driver) {
        super(driver);
    }

    public void login(String email, String password) {
        driver.get("https://dev.integrivideo.com/login");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//*[text()='Log in']")).click();
    }

    public BasePage isPageOpened() {
        return null;
    }

    public BasePage openPage() {
        return null;
    }

    public void clickAddProjectButton() {
        driver.findElement(addProjectButton).click();
    }

}
