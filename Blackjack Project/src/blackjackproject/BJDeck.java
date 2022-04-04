package blackjackproject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/**
 * 
 * @author Denley Tran
 *
 */
public class BJDeck {
	private ArrayList<BJCard> deck;
	
	public BJDeck() {
		deck = new ArrayList<BJCard>();
	}
	
	public void addCard(BJCard card) {
		deck.add(card);
	}
	
	public String toString() {
		String out = "";
		
		for (BJCard card: deck) {
			
			out += card;
			out += "\n";
		}
		return out;
	}
	
	public BJDeck(boolean createDeck) {
		deck = new ArrayList<BJCard>();
		if(createDeck) {
			for (BJSuit suit : BJSuit.values()) {
				for(BJRank rank : BJRank.values()) {
					deck.add(new BJCard(suit, rank));
				}
			}
		}	
	}	
	public void shuffle() {
		Collections.shuffle(deck, new Random());
	}
	public BJCard takeBJCard() {
		BJCard takenCard = new BJCard(deck.get(0));
		deck.remove(0);
		return takenCard;
	}
}

