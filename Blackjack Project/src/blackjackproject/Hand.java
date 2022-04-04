package blackjackproject;
import java.util.ArrayList;

public class Hand {
	private ArrayList<BJCard> hand;
	public Hand() {
		hand = new ArrayList<BJCard>();
	}
	public void takeBJCardfromDeck(BJDeck deck) {
		hand.add(deck.takeBJCard());
	}
	public String toString() {
		String out = "";
		for(BJCard card: hand) {
			out += card + " - ";
		}
		return out;
		}
	public int totalValue() {
		int value = 0;
		int aceAmount = 0;
		
		for(BJCard card: hand) {
			value += card.getValue();
			
			if (card.getValue() == 11) {
				aceAmount ++;
			}
		}
		if (aceAmount > 0 && value > 21) {
			while (value > 21 && aceAmount > 0) {
				value -= 10;
				aceAmount --;
			}
		}
		return value;
			}
	public BJCard getCard(int index) {
		return hand.get(index);
	}
	
	}
	

