package card;

public class Card {
	private static int Number = 10001;
	public int cardId;
	
	public Card() {
		cardId = Number++;
	}
	public int getCardNumber() {
		return this.cardId;
	}
}
