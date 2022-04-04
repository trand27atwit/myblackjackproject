package blackjackproject;
/**
 * 
 * @author Denley Tran
 *
 */
public class BJCard {
	
	private BJSuit suit;
	private BJRank rank;
	
	public BJCard(BJSuit suit, BJRank rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	public int getValue() {
		return rank.BJrankValue;
	}
	
	public BJSuit getBJSuit() {
		return suit;
	}
	
	public BJRank getBJRank() {
		return rank;
	}
	
	public String toString() {
		return ("["+rank+" of " + suit +"] ("+this.getValue()+")");
	}
	
	public BJCard(BJCard card) {
		this.suit = card.getBJSuit();
		this.rank = card.getBJRank();
	}
}
