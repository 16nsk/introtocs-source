package introtocs.inheritanceandpoly;

public class GiftCard extends MoneyCard {

	public GiftCard(int amount) {
		this.acceptability = new AcceptedSelectLocation();
		this.balance = amount;
	}
}
