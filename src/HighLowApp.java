import java.util.Random;
import java.util.Scanner;

/**
 * Class used to generate playable game for the users
 * @author brkell07
 *
 */
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
	/**
	 * opening header and rules for the apps
	 */
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
	
	/**
	 * asks the users for their names and welcomes them to the game
	 */
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
	
	/**
	 * asks the users if they can guess the random number and handles for non-numeric input
	 * @param player
	 * @return
	 */
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
	    
	    //if the user guesses correctly, gives them a correct message
		if (playerGuess == this.correctAnswer) {
			System.out.println("Yay! Good job! You got the answer correct");
			System.out.println();
			player.addWin();
			player.setAttempts(this.attempts);
			return true;
		} 
			
		distance = Math.abs(playerGuess - this.correctAnswer);
		
		//gives the users hints to how close they are to the random number
		if (distance > 50) {
			System.out.println("Freezing!");
		}
		else if (distance <= 50 && distance > 21) {
			System.out.println("Cold!");
		}
		else if (distance <= 20 && distance > 11) {
			System.out.println("Warm!");
		}
		else if (distance <= 10 && distance > 6) {
			System.out.println("Red hot!");
		}
		else if (distance <= 5) {
			System.out.println("Boiling!!");
		}
		
		System.out.println();
		
		return false;
	}
	
	/**
	 * displays the the stats of each round like name, wins, highest attempts, and lowest attempts
	 */
	public void displayStats() {
        System.out.println("       Name     Wins      Highest Attempts     Lowest Attempts");
        System.out.printf("%10s   %5d           %5d               %5d\n", this.player1.getName(), this.player1.getWins(), this.player1.getHighestAttempts(), this.player1.getLowestAttempts()); 
        System.out.printf("%10s   %5d           %5d               %5d\n", this.player2.getName(), this.player2.getWins(), this.player2.getHighestAttempts(), this.player2.getLowestAttempts()); 
        System.out.println();
	}
	
	/**
	 * generates the random number and loops while the user wants to keep playing
	 */
	public void playGame() {
		Random random = new Random();
		
		String cont = "yes";
		boolean correct = false;

		while (cont.equals("y") || cont.equals("yes")) {
			
			this.attempts = 0;
		    this.correctAnswer = random.nextInt(100) + 1;
		    //System.out.println("****ONLY for Testing - Correct Answer is  " + this.correctAnswer + " ****");
		    
		    correct = false;

		    while (!correct) {
		    	
			    if (attempts % 2 == 0) 
			    	correct = this.guess(this.player1);
			    else
			    	correct = this.guess(this.player2);
		    }
		    
		    //asks the user to press enter to display the stats
		    sc.nextLine(); // clear input buffer, leftover from nextInt
		    System.out.println("Press the Enter key to display the game stats...");
		    System.out.println();
		    System.out.println("=============================================================");
		    
		    sc.nextLine();
		    
		    this.displayStats();
		    
		    //asks the user if they want to play again
		    while (true) {
		    	System.out.println("=============================================================");
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
	
	/**
	 * gives the users a goodbye  message
	 */
	public void displayClosing() {
		System.out.println();
		System.out.println("It was fun while it lasted! Please come back soon!");
		System.out.println();
		System.out.println("Good bye " + player1.getName() + " and " + player2.getName() + "!");
	}
	/**
	 * main calls each function and displays them
	 * @param args
	 */
	public static void main(String[] args) {

		HighLowApp app = new HighLowApp();
		
		app.displayHeader();

		app.setupPlayers();

		app.playGame();
		
		app.displayClosing();

		sc.close();

	}

}
