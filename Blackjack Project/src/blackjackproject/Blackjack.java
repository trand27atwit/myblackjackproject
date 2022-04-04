package blackjackproject;
/**
 * 
 * @author Denley Tran
 *
 */
public class Blackjack {
	private int w, l, p;
	private BJDeck deck, discardpile;
	private BJDealer dealer;
	private BJPlayer player;
	
	public Blackjack() {
		w = 0;
		l = 0;
		p = 0;		
		
		deck = new BJDeck(true);
		
		discardpile = new BJDeck();
		
		dealer = new BJDealer();
		player = new BJPlayer();
		
		deck.shuffle();
		beginRound();
	}

	private void beginRound() {
		dealer.getHand().takeBJCardfromDeck(deck);
		dealer.getHand().takeBJCardfromDeck(deck);
		
		player.getHand().takeBJCardfromDeck(deck);
		player.getHand().takeBJCardfromDeck(deck);
		
		dealer.printFirstHand();
		player.printHand();
		
		if(dealer.hasBJ()) {
			dealer.printHand();
			
			if (player.hasBJ()) {
				System.out.println("Stalemate: you both have 21 - Push.");
				p++;
				beginRound();
			}
			else {
				System.out.println("Dang. Dealer got Blackjack. You lost. :((");
				dealer.printHand();
				l++;
				beginRound();
			}
		}
		if(player.hasBJ()) {
			System.out.println("WOOOOOOOO! YOU GOT BLACKJACK! VICTORY IS YOURS! :DD");
			w++;
			beginRound();
		}
		player.makeChoice(deck ,discardpile);
			}
		}
		
	

