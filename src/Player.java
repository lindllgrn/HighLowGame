/**
 * Class used to create Account objects
 * @author lindllgre
 *
 */
public class Player {
	
	/**
	 * gives the player id based on the last id number
	 */
	private static int LastNumber = 0;
	/**
	 * generates a unique id to each player
	 */
	private int id;
	/**
	 * generates the number of attempts each user has
	 */
	private int attempts;
	/**
	 * generates the lowest number of attempts the user made
	 */
	private int lowestAttempts;
	/** 
	 * generates the highest number of attempts the user made
	 */
	private int highestAttempts;
	/**
	 * generates the number of wins the users have
	 */
	private int wins;
	
	/**
	 * generates the users names
	 */
	private String name;
	
	/**
	 * creates the base of the player
	 */
	public Player() {
		this.id = ++Player.LastNumber;
		this.name = "Unknown";
		this.wins = 0;
		this.lowestAttempts = 0;
		this.highestAttempts = 0;
	}
	 
	/**
	 * generates the users names
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
	 * this sets the lowest number of attempts to the number of attempts the user used
	 * @param lowestAttempts The lowest number of attempts that the user used
	 */
	public void setLowestAttempts(int lowestAttempts) {
		this.lowestAttempts = lowestAttempts;
	}

	/**
	 * this gets the highest amount of attempts that the use used
	 * @return The highest amount of attempts the user used
	 */
	public int getHighestAttempts() {
		return highestAttempts;
	}

	/**
	 * this sets the highest number of attempts to the highest attempts
	 * @param highestAttempts this creates the highest attempts for the display stats
	 */
	public void setHighestAttempts(int highestAttempts) {
		this.highestAttempts = highestAttempts;
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
