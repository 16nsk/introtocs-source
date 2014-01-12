package introtocs.creditcard;

public class CreditCard {

	private int creditLimit;
	private int balance;
	private String cardHolder;
	private int purchases;

	/**
	 * Constructs a credit card with a predetermined credit limit and the
	 * provided cardholder name.
	 * 
	 * @param name
	 *            the cardHolders name
	 */
	public CreditCard(String name) {

		this.creditLimit = 500;
		this.balance = 0;
		this.cardHolder = name;
		this.purchases = 0;
	}

	/**
	 * Constructs a credit card with the provided name and credit limit.
	 * 
	 * @param name
	 *            cardHolder's name
	 * @param amount
	 *            the amount of the credit limit
	 */
	public CreditCard(String name, int amount) {

		this.creditLimit = amount;
		this.balance = 0;
		this.cardHolder = name;
		this.purchases = 0;
	}

	/**
	 * Gets the credit limit of the credit card
	 * 
	 * @return the credit limit
	 */
	public int getCreditLimit() {

		return this.creditLimit;
	}

	/**
	 * Gets the balance of the credit card
	 * 
	 * @return the balance
	 */
	public int getBalance() {

		return this.balance;
	}

	/**
	 * Gets the cardHolder
	 * 
	 * @return the cardHolder
	 */
	public String getCardHolder() {

		return this.cardHolder;
	}

	/**
	 * Makes a purchase increasing the balance of the credit card.
	 * 
	 * @param amount
	 *            the amount of the purchase
	 */
	public void makePurchase(int amount) {

		int availableCredit = this.creditLimit - balance;
		if (amount > availableCredit) {
			balance = balance + amount + 50;
		} else {
			balance = balance + amount;
			this.purchases++;
		}
	}

	/**
	 * Makes a payment to the credit card decreasing the balance.
	 * 
	 * @param amount
	 *            the amount of the payment
	 */
	public void makePayment(int amount) {

		this.balance = this.balance - amount;
	}

	/**
	 * Calculates the number of reward points earned.
	 * 
	 * @return the number of reward points
	 */
	public int calculateRewardPoints() {

		int points = 0;

		for (int i = 0; i < purchases; i++) {
			points = points + 100;
		}

		return points;
	}
}