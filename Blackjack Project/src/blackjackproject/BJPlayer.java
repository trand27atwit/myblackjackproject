package blackjackproject;
import java.util.Scanner;
public class BJPlayer extends BJPerson {
	Scanner input = new Scanner(System.in);
	
	public BJPlayer() {
		super.setName("Player");
	}
	public void makeChoice(BJDeck deck, BJDeck trash) {
		
		int choice = 0;
		
		boolean getNumber = true;
		
		while(getNumber) {
			try {System.out.println("What do you want to do: 1. Hit or 2. Stand?");
			choice = input.nextInt();
			getNumber = false;
			}
			catch(Exception e) {
				System.out.println("Invalid input");
				input.next();
			}
		}
		System.out.println("You chose to: " + choice);
	}
}
