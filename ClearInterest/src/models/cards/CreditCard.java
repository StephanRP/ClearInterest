package models.cards;

public interface CreditCard {

    public double getInterestRate();

    public double getInterest();

    public void setInterest();

    public double getBalance();

    public void setBalance(double balance);

}