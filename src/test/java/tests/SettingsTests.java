package tests;

import org.testng.annotations.Test;

public class SettingsTests extends BaseTest {

    @Test

    public void sendMessage() {
        /*
        0 openpage (get)
        1 click settings icon
        2 set user name
        3 set user email
        4 set user pic (upload a png file)
        5 save changes
        6 verify that the input user data is displayed
         */


        settingsPage.openPage();
        settingsPage.clickSettings();
        settingsPage.setNameValue("Peter Pan");
        settingsPage.setEmailValue("peter.pan@gmail.com");
        settingsPage.setPhotoURLValue("http://bit.ly/38rIcVA");
        settingsPage.clickSaveButton();
        settingsPage.verifyNameValue("Peter Pan");
        settingsPage.verifyEmailValue("peter.pan@gmail.com");
        settingsPage.verifyPhotoURLValue("http://bit.ly/38rIcVA");
    }
}
