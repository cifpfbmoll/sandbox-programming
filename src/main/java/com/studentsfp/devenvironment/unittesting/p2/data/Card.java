package com.studentsfp.devenvironment.unittesting.p2.data;

/**
 * com.studentsfp.devenvironment.unittesting.p2.data
 * Class Card
 * 18/12/2020
 *
 * @author berto (alberto.soto@gmail.com)
 */
public class Card {
    private Integer pinCode;
    private Client client;
    private Integer expiringMonth;
    private Integer expiringYear;
    private Integer cvc;
    private CardType cardType;
    private String cardNumber;
    private Account account;

    public Integer getPinCode() {
        return pinCode;
    }

    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Integer getExpiringMonth() {
        return expiringMonth;
    }

    public void setExpiringMonth(Integer expiringMonth) {
        this.expiringMonth = expiringMonth;
    }

    public Integer getExpiringYear() {
        return expiringYear;
    }

    public void setExpiringYear(Integer expiringYear) {
        this.expiringYear = expiringYear;
    }

    public Integer getCvc() {
        return cvc;
    }

    public void setCvc(Integer cvc) {
        this.cvc = cvc;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
