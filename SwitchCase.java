import java.util.Scanner;
/*
 * @ author Christopher O'Brien
 * This program takes the input of the user's role at a school and welcomes them
 * It is purely an academic exercise to learn how to use switch case
 */
public class SwitchCase {
	public static void main(String [] args)
	{
		//The user enters their role
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your role.");
		String role = keyboard.nextLine();
		keyboard.close();
		
		//The program welcomes the user based off of the inputed role
		switch(role)
		{
			case "Administrator":
				System.out.println("Welcome " + role +"!");
				break;
			case "Faculty":
				System.out.println("Welcome " + role +"!");
				break;
			case "Staff":
				System.out.println("Welcome " + role +"!");
				break;
			case "Student":
				System.out.println("Welcome " + role +"!");
				break;
			case "Guest":
				System.out.println("Welcome " + role +"!");
				break;
		}
	}
}
