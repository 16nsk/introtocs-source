package introtocs.creditcard;

import java.util.ArrayList;

public class CreditCardTester {

	public static void main(String[] args) {

		// Colection of CreditCards
		ArrayList<CreditCard> cards = new ArrayList<CreditCard>();

		// Our CreditCard objects
		CreditCard card1 = new CreditCard("Madalin Ignisca", 2500);
		CreditCard card2 = new CreditCard("John Doe", 1400);
		CreditCard card3 = new CreditCard("Jane Doe", 750);

		// CreditCards purchases
		card1.makePurchase(1000);
		card1.makePurchase(1500);

		card2.makePurchase(200);
		card2.makePurchase(400);
		card2.makePurchase(150);

		card3.makePurchase(950);

		// CreditCard payments
		card1.makePayment(50);
		card2.makePayment(25);
		card3.makePayment(75);

		// Add CreditCards to cards ArrayList
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);

		// Printing out CreditCard information
		for (CreditCard card : cards) {
			System.out.println("The cardholder is: " + card.getCardHolder());
			System.out.println("Total credit limit: " + card.getCreditLimit());
			System.out.println("Total balance: " + card.getBalance());
			System.out.println("Total reward points: "
					+ card.calculateRewardPoints());
			System.out.println("--------------------------------------------");
		}

		/*
		 * System.out.println(card.getCardHolder());
		 * System.out.println(card.getCreditLimit()); card.makePurchase(1500);
		 * card.makePayment(200); card.makePurchase(1000);
		 * System.out.println(card.getBalance());
		 * System.out.println(card.calculateRewardPoints());
		 * card.makePurchase(300); System.out.println(card.getBalance());
		 * System.out.println(card.calculateRewardPoints());
		 */
	}

}
