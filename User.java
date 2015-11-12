
public class User {
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private String password;
	private AccountType accountType;

	public User() {
		firstName = "Chris";
		lastName = "O'Brien";
		email = "rogerroger@gmail.com";
		username = "rover";
		password = "guest";
		accountType = AccountType.Student;
	}
	public User(String firstName, String lastName, String email, String username, String password, AccountType accountType){
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email= email;
		accountType = AccountType.Student;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	public void setFirstName(String firstName){
		this.firstName =firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getUserName(){
		return this.username;
	}
	public void setUserName(String username){
		this.username = username;
	}
	
	
	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password = password;
	}
	
	public String toString() {
		return "First Name: " + this.firstName + "\tLastName: " + this.lastName + "\tUsername: " + this.username + "\tPassword: " + this.password + "\tAccountType: " + this.accountType; 
	}
}
	
	
