package tests;

import org.testng.annotations.Test;

public class AddProjectsTest extends BaseTest {

    @Test
    public void addProjectsTest() {
        addProjectsPage.login("hkj@mailinator.com", "0123456789");
        addProjectsPage.clickAddProjectButton();
    }
}

