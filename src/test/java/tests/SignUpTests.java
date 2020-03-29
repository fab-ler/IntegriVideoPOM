package tests;

import org.testng.annotations.Test;

import java.util.UUID;

public class SignUpTests extends BaseTest {

    @Test(invocationCount = 1)
    public void sighUp() {
        signUpPage.openPage();
        signUpPage.loginInput(UUID.randomUUID().toString() + "@gmail.com");
        signUpPage.passwordInput("0123456789");
        signUpPage.clickSubmit();
        signUpPage.find();
        //       signUpPage.verifyMessageTextAlert("Message with instructions was sent");
    }
}