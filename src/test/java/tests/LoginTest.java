package tests;

import models.User;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        User user = new User("hkj@mailinator.com", "0123456789");
        loginPage
                .openPage()
                .login(user);
    }
}
