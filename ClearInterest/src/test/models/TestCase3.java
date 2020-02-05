package test.models;

import models.cards.CreditCard;
import models.cards.Discover;
import models.cards.MC;
import models.cards.Visa;
import models.person.Person;
import models.wallet.Wallet;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCase3 {

    private CreditCard[] pOneCards = {new MC(100), new Visa(100), new Discover(100)};
    private CreditCard[] pTwoCards = {new Visa(100), new MC(100)};
    private Wallet[] pOneWallet = {new Wallet(pOneCards)};
    private Wallet[] pTwoWallet = {new Wallet(pTwoCards)};
    private Person personOne = new Person(pOneWallet);
    private Person personTwo = new Person(pTwoWallet);


    @Test
    public void calcSimpleInterestPersonOne() {
        assertEquals(16.0, personOne.getInterest(), 0);
    }

    @Test
    public void calcSimpleInterestPersonTwo() {
        assertEquals(15.0, personTwo.getInterest(), 0);
    }

    @Test
    public void calcWalletOnePersonOne() {
        assertEquals(16.0, pOneWallet[0].getInterest(), 0);
    }

    @Test
    public void calcWalletOnePersonTwo() {
        assertEquals(15.0, pTwoWallet[0].getInterest(), 0);
    }

}