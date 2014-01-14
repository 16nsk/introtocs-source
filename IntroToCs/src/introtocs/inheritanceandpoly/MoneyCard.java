package introtocs.inheritanceandpoly;

public class MoneyCard {

	protected int balance;
	protected Acceptability acceptability;
	
	public int getBalance() {
		
		return this.balance;
	}
	
	public void makePurchase(int amount) {
		if (amount > balance) {
			throw new IllegalArgumentException("Amount of the purchase exceeds the balance");
			
		}
		
		this.balance = this.balance - amount;
	}
	
	public String getAcceptability() {
		return this.acceptability.location();
	}
}
