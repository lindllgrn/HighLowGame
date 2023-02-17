import java.util.Scanner;

public class Player {
	
	private static Scanner sc;

	private Player player1;
	private Player player2; 

	private int attempts;
	private int correctAnswer;
	private int lowestAttempts;
	private int highestAttempts;
	private int wins;
	
	private String name;
	
	public void addWin() {
		this.wins++;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public void setAttempts(int attempts) {
		if (attempts > this.highestAttempts)
			this.highestAttempts = attempts;
		
		if (attempts < this.lowestAttempts)
					this.lowestAttempts = attempts;
		else if (this.lowestAttempts == 0)
			this.lowestAttempts = attempts;
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

	public int getLowestAttempts() {
		return lowestAttempts;
	}

	public void setLowestAttempts(int lowestAttempts) {
		this.lowestAttempts = lowestAttempts;
	}

	public int getHighestAttempts() {
		return highestAttempts;
	}

	public void setHighestAttempts(int highestAttempts) {
		this.highestAttempts = highestAttempts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
