/**
 * Class used to create game objects. This class allows for HighLowApp.java to access each constructor, method, etc,
 * without it having to be included in the HighLowApp and could just be called.
 * @author lindllgrn
 * @author brennenkel
 * GitHub URL: https://github.com/lindllgrn/HighLowGame
 **/
public class Player {
	
	/**
	 * gives the player id based on the last id numbers
	 */
	private static int LastNumber = 0;
	
	/**
	 * a unique id to each player
	 */
	private int id;
	
	/**
	 * the number of attempts each user has
	 */
	private int attempts;
	
	/**
	 * the lowest number of attempts the user made
	 */
	private int lowestAttempts;
	
	/** 
	 * the highest number of attempts the user made
	 */
	private int highestAttempts;
	
	/**
	 * the number of wins the users have
	 */
	private int wins;
	
	/**
	 * the users names
	 */
	private String name;
	
	/**
	 * creates the base of the player and their starting stats before playing tha game
	 */
	public Player() {
		this.id = ++Player.LastNumber;
		this.name = "Unknown";
		this.wins = 0;
		this.lowestAttempts = 0;
		this.highestAttempts = 0;
	}
	 
	/**
	 * generates the users names so the program is able to use them for greeting, asking a specific player the question
	 * and to help the display stats to easier to read
	 * @param name The user's first name
	 */
	public Player(String name) {
		this();
		this.name = name;
	}
	
	/**
	 * generates wins for each guess that is correct
	 */
	public void addWin() {
		this.wins++;
	}

	/**
	 * creates the number of attempts for displaying the stats
	 * @param attempts The number of attempts the user used
	 */
	public void setAttempts(int attempts) {
		if (attempts > this.highestAttempts)
			this.highestAttempts = attempts;
		
		if (attempts < this.lowestAttempts)
					this.lowestAttempts = attempts;
		else if (this.lowestAttempts == 0)
			this.lowestAttempts = attempts;
	}

	/**
	 * this is to get the number of attempts
	 * @return This returns the number of attempts
	 */
	public int getAttempts() {
		return attempts;
	}

	/**
	 * this is to get the lowest number of attempts
	 * @return The lowest number of attempts the user used
	 */
	public int getLowestAttempts() {
		return lowestAttempts;
	}

	/**
	 * this gets the highest amount of attempts that the use used
	 * @return The highest amount of attempts the user used
	 */
	public int getHighestAttempts() {
		return highestAttempts;
	}

	/**
	 * this gets the users first names
	 * @return The users names
	 */
	public String getName() {
		return name;
	}

	/**
	 * this sets the name to itself
	 * @param name The user's first name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * this gets the user's id's
	 * @return The user id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * this gets the number of wins
	 * @return Number of wins
	 */
	public int getWins() {
		return wins;
	}
}
