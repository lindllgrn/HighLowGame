import java.util.Random;
import java.util.Scanner;

public class HighLowApp {

	private static Scanner sc;

	private Player player1;
	private Player player2;

	private int attempts = 0;
	private int correctAnswer= 0;
	
	public HighLowApp() {
		this.sc = new Scanner(System.in);

		this.player1 = new Player();
		this.player2 = new Player(); 

		this.attempts = 0;
		this.correctAnswer = 0;
		
	}
	
	public void displayHeader() {
		System.out.println("High/Low Game");
	}

	public void setupPlayers() {
		String userInput = "?";
		
		System.out.print("Player1 name: ");
		userInput = sc.nextLine();
		this.player1.setName(userInput);

		System.out.print("Player2  name: ");
		userInput = sc.nextLine();
		this.player2.setName(userInput);
	}


	public boolean guess(Player player) {
		int playerGuess = 0;
		int distance = 0;
		String playerName = player.getName();
		
	    attempts++;
		
		System.out.print("What's your guess, " + playerName + ": ");
		
	    while (!sc.hasNextInt()) { // check if the input is a number before retrieving the data
	        System.out.println("That's not a number! Please try again: ");
	        sc.next(); // clear the invalid data
	    }

	    playerGuess = sc.nextInt();

		if (playerGuess == this.correctAnswer) {
			System.out.println("Correct");
			player.addWin();
			player.setAttempts(this.attempts);
			return true;
		} 
			
		distance = Math.abs(playerGuess - this.correctAnswer);

		System.out.println("Invalid"); // TODO !!! Add multi-branch if-else message based on distance
		
		return false;
	}
	
	public void displayStats() {
		// TODO: use a printf to align report in columns
		System.out.printf("%20s: %,10.2f\n", "Discount percent", discountPercent);
        System.out.printf(this.player1.getName(), ); 
        System.out.printf(this.player2.getName()); 
	}
	
	public void playGame() {
		Random random = new Random();
		
		String cont = "yes";
		boolean correct = false;

		while (cont.equals("y") || cont.equals("yes")) {
			
			this.attempts = 0;
		    this.correctAnswer = random.nextInt(100) + 1;
		    System.out.println("****ONLY for Testing - Correct Answer is  " + this.correctAnswer + " ****");
		    
		    correct = false;

		    while (!correct) {
		    	
			    if (attempts % 2 == 0) 
			    	correct = this.guess(this.player1);
			    else
			    	correct = this.guess(this.player2);
		    }
		    
		    sc.nextLine(); // clear input buffer, leftover from nextInt
		    System.out.print("Press the Enter key to display the game stats...");
		    sc.nextLine();
		    
		    this.displayStats();
		    
		    while (true) {
		    	System.out.print("Do you want to play again (y=yes, n=no): ");
		    	cont = sc.nextLine();
		    	
		    	if (cont.equals("y") || cont.equals("yes") || cont.equals("n") || cont.equals("no"))
		    		break;
		    	else
		    		System.out.println("Invalid input! Please try again..");
		    	
		    } // end of y/n data validation while
		    
		} // end of outer while loop to keep the game running
		
	} // end of playGame method
	
	public void displayClosing() {
		System.out.println("Good bye " + player1.getName() + " and " + player2.getName());
	}

	public static void main(String[] args) {

		HighLowApp app = new HighLowApp();
		
		app.displayHeader();

		app.setupPlayers();

		app.playGame();
		
		app.displayClosing();

		sc.close();

	}

}
