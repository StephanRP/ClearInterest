package models.cards;


public class Discover implements CreditCard {

    private static final double INTEREST_RATE = 0.01;
    private double balance;
    private double interest;


    public Discover(double balance) {
        setBalance(balance);
        setInterest();
    }

    @Override
    public double getInterestRate() {
        return INTEREST_RATE;
    }
    @Override
    public double getInterest() {
        return interest;
    }
    @Override
    public void setInterest() {
        this.interest = balance * INTEREST_RATE;
    }
    @Override
    public double getBalance() {
        return balance;
    }
    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

}