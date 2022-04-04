package blackjackproject;
/**
 * 
 * @author Denley Tran
 *
 */
public enum BJSuit {
		CLUB("Clubs"),
		DIAMOND("Diamonds"),
		HEART("Hearts"),
		SPADE("Spades");

		String suitName;
	
		BJSuit(String suitName) {
			this.suitName = suitName;
		}
		
		public String toString() {
			return suitName;
		}
}
