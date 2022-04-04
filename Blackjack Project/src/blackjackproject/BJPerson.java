package blackjackproject;

public abstract class BJPerson {
private Hand hand;
private String name;

public BJPerson() {
	this.hand = new Hand();
	this.name = "";
}
	public Hand getHand() {
		return this.hand;
	}
	public void setHand (Hand hand) {
		this.hand = hand;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean hasBJ() {
			if(this.getHand().totalValue() == 21) {
				return true;
			}
			else {
			return false;
		}
	}
	public void printHand() {
		System.out.println("This is what " + this.name + "'s hand looks like:");
		System.out.println(this.hand + " Value is: " + this.hand.totalValue());
	}
	
}



