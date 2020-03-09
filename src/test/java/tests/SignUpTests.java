package tests;

import org.testng.annotations.Test;

public class SignUpTests extends BaseTest {

    @Test
    public void sighUp() {

        signUpPage.openPage();
        signUpPage.loginInput("test@test1.com");
        signUpPage.passwordInput("0123456789");
        signUpPage.clickSubmit();
        //      signUpPage.verifyMessageTextAlert();
    }
}
