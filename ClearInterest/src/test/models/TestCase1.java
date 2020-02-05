package test.models;

import models.cards.CreditCard;
import models.cards.Discover;
import models.cards.MC;
import models.cards.Visa;
import models.person.Person;
import models.wallet.Wallet;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCase1 {

    private CreditCard[] cards = {new Visa(100), new MC(100), new Discover(100)};
    private Wallet[] wallet = {new Wallet(cards)};
    private Person person = new Person(wallet);

    @Test
    public void calcSimpleInterest() {
        assertEquals(16.0, person.getInterest(), 0);
    }

    @Test
    public void calcVisaInterest() {
        assertEquals(10.0, cards[0].getInterest(), 0);
    }

    @Test
    public void calcMCInterest() {
        assertEquals(5.0, cards[1].getInterest(), 0);
    }

    @Test
    public void calcDiscoverInterest() {
        assertEquals(1.0, cards[2].getInterest(), 0);
    }

}