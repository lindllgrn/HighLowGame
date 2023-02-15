
public class Player {

	public String firstName;
	public String lastName;
	int playerGuess = 0;

	String choice = "y";

	
	public Player() {
		//this.number = ++Account.lastNumber;
		//this.balance = 0;
		this.firstName = "";
		this.lastName = "";
	}
		
		public Player(String firstName, String lastName) {
			this(); // call the default constructor
		}
		
			public String getFirstName() {
				return firstName;
			}

			public void setFirstName(String firstName) {
				if (firstName == "")
					System.out.println("first name can not be blank");
				else 
					this.firstName = firstName;
			}

			public String getLastName() {
				return lastName;
			}

			public void setLastName(String lastName) {
				if (lastName == "")
					System.out.println("last name can not be blank");
				else 
					this.lastName = lastName;
				this.lastName = lastName;
			}
}
