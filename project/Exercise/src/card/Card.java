package card;

public class Card {
	private static int Number = 10001;
	private int cardId;
	
	public Card() {
		this.cardId = Number++;
	}
	public int getCardNumber() {
		return this.cardId;
	}
}
