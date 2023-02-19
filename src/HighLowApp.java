import java.util.Random;
import java.util.Scanner;

public class HighLowApp {

	private static Scanner sc;

	private Player player1;
	private Player player2; 

	private int attempts;
	private int correctAnswer;
	
	public HighLowApp() {
		this.sc = new Scanner(System.in);

		this.player1 = new Player();
		this.player2 = new Player(); 

		this.attempts = 0;
		this.correctAnswer = 0;
		
	}
	
	public void displayHeader() {
		System.out.println("=======================================================");
		System.out.println("||           Welcome to the High/Low Game            ||");
		System.out.println("=======================================================");
		System.out.println("Game rules: ");
		System.out.println();
		System.out.println("1) Both players will take turns guessing a number 1-100");
		System.out.println();
		System.out.println("2) At the beginning of each round, players will take ");
		System.out.println("turns on going first.");
		System.out.println();
		System.out.println("3) After guessing, players will get a hint if they are ");
		System.out.println("getting warmer or colder.");
		System.out.println();
		System.out.println("4) The game will track each player's lowest and highest ");
		System.out.println("attempts plus the number of wins.");
		System.out.println();
		System.out.println("5) After each round, the players get to decide if they ");
		System.out.println("want to continue or quit the game.");
		System.out.println();
		System.out.println("=======================================================");
		
		
	}

	public void setupPlayers() {
		String userInput = "?";
		
		System.out.println();
		
		System.out.print("Please enter the first player's name: ");
		userInput = sc.nextLine();
		this.player1.setName(userInput);

		System.out.print("Please enter the second player's name: ");
		userInput = sc.nextLine();
		this.player2.setName(userInput);
		
		System.out.println();
	
		System.out.println("Welcome " + this.player1.getName() + " and " + this.player2.getName() + "! Let's get this game started!" );
		
		System.out.println();
		
		System.out.println("=======================================================");
	}


	public boolean guess(Player player) {
		int playerGuess = 0;
		int distance = 0;
		String playerName = player.getName();
		
	    attempts++;
	    
	    System.out.println();
	    
	    System.out.println("Can you guess the number I am thinking of between 1-100?");
	    
	    System.out.println();
		
		System.out.print("What's your guess, " + playerName + ": ");
		
	    while (!sc.hasNextInt()) { // check if the input is a number before retrieving the data
	        System.out.println("That's not a number! Please try again: ");
	        sc.next(); // clear the invalid data
	    }

	    playerGuess = sc.nextInt();

		if (playerGuess == this.correctAnswer) {
			System.out.println("Correct");
			System.out.println();
			player.addWin();
			player.setAttempts(this.attempts);
			return true;
		} 
			
		distance = Math.abs(playerGuess - this.correctAnswer);

		System.out.println("Invalid"); // TODO !!! Add multi-branch if-else message based on distance
		
		System.out.println();
		
		return false;
	}
	
	public void displayStats() {
		// TODO: use a printf to align report in columns
        System.out.println(this.player1.getName()); 
        System.out.println(this.player2.getName());
        System.out.println();
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
		    System.out.println("Press the Enter key to display the game stats...");
		    System.out.println();
		    System.out.println("=======================================================");
		    
		    sc.nextLine();
		    
		    this.displayStats();
		    
		    while (true) {
		    	System.out.println("=======================================================");
		    	System.out.println();
		    	System.out.print("Do you want to play again (y=yes, n=no): ");
		    	cont = sc.nextLine();
		    	System.out.println();
		    	System.out.println("=======================================================");
		    	
		    	
		    	if (cont.equals("y") || cont.equals("yes") || cont.equals("n") || cont.equals("no"))
		    		break;
		    	else
		    		System.out.println("Invalid input! Please try again..");
		    	
		    } // end of y/n data validation while
		    
		} // end of outer while loop to keep the game running
		
	} // end of playGame method
	
	public void displayClosing() {
		System.out.println();
		System.out.println("It was fun while it lasted! Please come back soon!");
		System.out.println();
		System.out.println("Good bye " + player1.getName() + " and " + player2.getName() + "!");
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
