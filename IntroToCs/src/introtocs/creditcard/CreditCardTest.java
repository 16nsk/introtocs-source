package introtocs.creditcard;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CreditCardTest {

	private CreditCard card1;
	private CreditCard card2;

	@Before
	public void setUp() throws Exception {

		this.card1 = new CreditCard("Madalin Ignisca");
		this.card2 = new CreditCard("John Doe", 3000);
	}

	@Test
	public void testCreditCardString() {

		assertEquals("Madalin Ignisca", this.card1.getCardHolder());
		assertEquals(500, this.card1.getCreditLimit());
		assertEquals(0, this.card1.getBalance());
	}

	@Test
	public void testCreditCardStringInt() {

		assertEquals("John Doe", this.card2.getCardHolder());
		assertEquals(3000, this.card2.getCreditLimit());
		assertEquals(0, this.card2.getBalance());
	}

	@Test
	public void testMakePurchaseNoFee() {

		this.card1.makePurchase(300);
		assertEquals(300, this.card1.getBalance());
	}

	@Test
	public void testMakePurchaseWithFee() {

		this.card1.makePurchase(700);
		assertEquals(750, this.card1.getBalance());
	}

	@Test
	public void testMakePayment() {

		this.card2.makePurchase(100);
		this.card2.makePayment(25);
		assertEquals(75, this.card2.getBalance());
	}

	@Test
	public void testCalculateRewardPoints() {

		this.card2.makePurchase(100);
		this.card2.makePurchase(100);
		this.card2.makePurchase(100);
		this.card2.makePurchase(100);
		assertEquals(400, this.card2.calculateRewardPoints());
	}

}
