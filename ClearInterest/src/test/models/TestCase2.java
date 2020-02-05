package test.models;

import models.cards.CreditCard;
import models.cards.Discover;
import models.cards.MC;
import models.cards.Visa;
import models.person.Person;
import models.wallet.Wallet;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCase2 {

    private CreditCard[] walletOneCards = {new Visa(100), new Discover(100)};
    private CreditCard[] walletTwoCards = {new MC(100)};
    private Wallet[] wallets = {new Wallet(walletOneCards), new Wallet(walletTwoCards)};
    private Person person = new Person(wallets);


    @Test
    public void calcSimpleInterest() {
        assertEquals(16.0, person.getInterest(), 0);
    }

    @Test
    public void calcWalletOne() {
        assertEquals(11.0, wallets[0].getInterest(), 0);
    }

    @Test
    public void calcWalletTwo() {
        assertEquals(5.0, wallets[1].getInterest(), 0);
    }

}