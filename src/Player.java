import java.util.Scanner;

public class Player {
	
	private static Scanner sc;

	private Player player1;
	private Player player2; 

	private int attempts;
	private int correctAnswer;

	public static void setSc(Scanner sc) {
		HighLowApp.sc = sc;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}

	public void setCorrectAnswer(int correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	
	public static Scanner getSc() {
		return sc;
	}

	public Player getPlayer1() {
		return player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public int getAttempts() {
		return attempts;
	}

	public int getCorrectAnswer() {
		return correctAnswer;
	}
}
