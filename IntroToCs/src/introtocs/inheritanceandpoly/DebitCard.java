package introtocs.inheritanceandpoly;

public class DebitCard extends MoneyCard {

	public DebitCard(int amount) {
		this.balance = amount;
	}
	
	public void deposit(int amount) {
		this.balance = this.balance + amount;
	}
}
