package blackjackproject;

public class BJDealer extends BJPerson {
	public BJDealer() {
		super.setName("Dealer");
	}
	public void printFirstHand() {
		System.out.println("This is what the dealer's hand looks like:");
		System.out.println(super.getHand().getCard(0));
		System.out.println("The second card's face down...");
	}
}
