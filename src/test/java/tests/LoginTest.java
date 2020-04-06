package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void logIn() {
        loginPage.openPage();
        loginPage.userLoginInput("hkj@mailinator.com");
        loginPage.userPasswordInput("0123456789");
        loginPage.clickLoginButton();
    }
}
