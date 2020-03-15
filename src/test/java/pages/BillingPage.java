//package pages;
//
//import models.Card;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//
//public class BillingPage extends BasePage {
//
//    By billingButton = By.xpath("//a[contains(text(), 'Billing')]");
//    By addNewCardButton = By.xpath("//a[text()='Add new']");
//    By payPalIcon = By.cssSelector(".paypal-button-label-container");
//    By AddInputCardButton =
//
//
//    public BillingPage(WebDriver driver) {
//        super(driver);
//    }
//
//    public BillingPage openPage() {
//        driver.findElement(billingButton).click();
//        isPageOpened();
//        return this;
//    }
//    public BillingPage isPageOpened() {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(payPalIcon));
//        return this;
//    }
//
//    public BillingPage clickAddNewPaymentButton() {
//        addNewCardButton.click();
//        isPageOpened(By.xpath("//button[text()='Add']"));
//        wait.until(ExpectedConditions.elementToBeClickable(payPalIcon));
//        PageFactory.initElements(driver, BillingPage.this);
//        return this;
//    }
//
//    public BillingPage cardDetailsInput(Card card) {
//        getCardNumber.sendKeys(card.getCartNumber());
//        cardDateMontInput.sendKeys(card.getValidThroughMonth());
//        cardDateYearInput.sendKeys(card.getDateYear());
//        cardHolderNameInput.sendKeys(card.getCardHolderName());
//        return this;
//    }
//
//    public BillingPage clickAddNewCardButton() {
//        addCardButton.submit();
//        return this;
//    }
//}
