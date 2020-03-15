package tests;

import org.testng.annotations.Test;

public class ProjectTests extends BaseTest {

    @Test
    public void createTests() {
        projectPage.login("hkj@mailinator.com", "0123456789");
        projectPage.clickAddProjectButton();
    }
}

