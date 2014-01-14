package introtocs.inheritanceandpoly;

public class DebitCard extends MoneyCard {

	public DebitCard(int amount) {
		this.acceptability = new AcceptedEverywhere();
		this.balance = amount;
	}
	
	public void deposit(int amount) {
		this.balance = this.balance + amount;
	}
}
