import java.util.Scanner;

/********************************************************************************************
 Description: This takes the user's number of invoices and the prices and calculates them
 into discounts, amounts, and averages.
 Programmer: Lindsay Green
 Date Written: 2023.01.27
 GitHub: https://github.com/lindllgrn/JavaIndividualProjects/tree/main/section1-invoiceapp
 ********************************************************************************************/

public class HighLowApp {
	
	
	public static void printPlayer(Player player) {
		System.out.println("Name:    " + player.getFirstName() + " " + player.getLastName()); 
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// initialize variables for use in calculating averages
		System.out.println("What is player one's first name?");
		String player.firstName = sc.nextLine();
		
		Player player1 = new Player();
		HighLowApp.printPlayer(player1);
 
		// Change the instance's field values
		player1.setFirstName("Lindsay");
		player1.setLastName("Green");
		HighLowApp.printPlayer(player1);

		// Instantiate another new Account object using the overload constructor
		Player player2 = new Player("Sam", "Smith");
		HighLowApp.printPlayer(player2);

		// Displaying class level field's value

		// create a Scanner object named sc

		// welcome the user to the program
		System.out.println(); //print blank line
		System.out.println("==========================================");
		System.out.println("	  Welcome to the High Low Game");
		System.out.println("==========================================");
		
		// perform invoice calculations until choice is "n" or "N"
		//while (!choice.equalsIgnoreCase("n")) {

			/*
			System.out.println();
			System.out.print("What is your name? ");
			playerOne = sc.nextLine();

			System.out.println();
			System.out.println("Hello" + " " + playerOne);
			
			System.out.println();
			System.out.println("==========================================");
			System.out.println();

			System.out.println();
			
			System.out.println();
			System.out.print("What is your name? ");
			playerTwo = sc.nextLine();

			System.out.println();
			System.out.println("Hello" + " " + playerTwo);
			
			System.out.println();
			System.out.println("==========================================");
			System.out.println();

			System.out.println();
			*/
			
			//user enters the invoice amounts
			//System.out.println(playerOne + " guess a number between 1-100.");

	sc.close();
		
	}
}

			/*choice = sc.nextLine(); //clear the return char still in the input buffer

			System.out.println();

			//asks the user if they would like to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.nextLine();
			System.out.println();
		}*/

		//caluculates and displays invoice count, average invoice, and average discount

		//sends a goodbye message to the user when they are finished using the program
		/*System.out.println("==========================================");
		System.out.println();
		System.out.println("Goodbye");
		System.out.println();
		System.out.println("==========================================");
		*/

		//sc.close();
	 //end of main
 //end of invoiceapp class
