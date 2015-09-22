
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * 
 * @author cco207, Christopher O'Brien
 * 
 * This Program is made to input and compare a username and password.
 * This program is only for a class exercise.
 *
 */

public class AuthenticateUsername {
	public static void main(String[] args){
		String correctUsername = "Chris";
		String correctPassword = "csc200";
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your username");
		String username = keyboard.nextLine();
		
		System.out.println("Please enter your password.");
		String password = keyboard.nextLine();
		keyboard.close();
		if(username.equals(correctUsername) && password.equals(correctPassword)){
			JOptionPane.showMessageDialog(null, "Welcome " + username+ ".");
		}
		else{
			JOptionPane.showMessageDialog(null, "You entered an incorrect username or password.");
		}
			
				
	}
}
