package tests;

import org.testng.annotations.Test;

public class ChatTests extends BaseTest {

    @Test
    public void sendMessage() {
        /*
        0. openpage (get)
        1. find text area
        2. find button & click
        3. validate that the message exists
         */
        chatPage.openPage();
        chatPage.writeText("radom text");
        chatPage.clickSend();
        chatPage.messageShouldExist(1, "radom text");
    }
}
