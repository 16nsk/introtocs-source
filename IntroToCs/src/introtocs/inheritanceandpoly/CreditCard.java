package introtocs.inheritanceandpoly;

public class CreditCard extends MoneyCard {

	private int creditLimit;
	
	public CreditCard(int amount) {
		this.acceptability = new AcceptedEverywhere();
		this.balance = 0;
		this.creditLimit = amount;
	}
	
	public void makePayment(int amount) {
		this.balance = this.balance - amount;
	}
	
	public int getAvailableCredit() {
		return this.creditLimit - this.balance;
	}
	
	public void makePurchase(int amount) {
		if (amount > getAvailableCredit()) {
			throw new IllegalArgumentException("Amount of the purchase exceeds the available credit");
		}
		
		this.balance = this.balance + amount;
	}
}
