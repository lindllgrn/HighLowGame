public class Player {
	
	private static int LastNumber = 0;

	private int id;
	private int attempts;
	private int lowestAttempts;
	private int highestAttempts;
	private int wins;
	
	private String name;
	
	public Player() {
		this.id = ++Player.LastNumber;
		this.name = "Unknown";
		this.wins = 0;
		this.lowestAttempts = 0;
		this.highestAttempts = 0;
	}
	 
	public Player(String name) {
		this();
		this.name = name;
	}
	
	public void addWin() {
		this.wins++;
	}

	public void setAttempts(int attempts) {
		if (attempts > this.highestAttempts)
			this.highestAttempts = attempts;
		
		if (attempts < this.lowestAttempts)
					this.lowestAttempts = attempts;
		else if (this.lowestAttempts == 0)
			this.lowestAttempts = attempts;
	}

	public int getAttempts() {
		return attempts;
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
	
	public int getId() {
		return id;
	}
	
	public int getWins() {
		return wins;
	}
}
