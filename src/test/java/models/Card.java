package models;

public class Card {
    String cardNumber;
    String validThroughMonth;
    String validThroughYear;
    String cardHolder;

    public Card(String cardNumber, String validThroughMonth, String validThroughYear, String cardHolder) {
        this.cardNumber = cardNumber;
        this.validThroughMonth = validThroughMonth;
        this.validThroughYear = validThroughYear;
        this.cardHolder = cardHolder;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getValidThroughMonth() {
        return validThroughMonth;
    }

    public void setValidThroughMonth(String validThroughMonth) {
        this.validThroughMonth = validThroughMonth;
    }

    public String getValidThroughYear() {
        return validThroughYear;
    }

    public void setValidThroughYear(String validThroughYear) {
        this.validThroughYear = validThroughYear;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public CharSequence getCartNumber() {
    }
}
