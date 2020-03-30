package card;

public class CardCompany {
	private static CardCompany instance = new CardCompany();
	
	public static CardCompany getInstance() {
		return instance;
	}
	
	public Card createCard() {
		Card card = new Card();
		return card;
	}
}
