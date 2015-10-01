import java.util.Scanner;
/*
 * @ author Christopher O'Brien
 * This program takes the input of the user's role at a school and welcomes them
 * It is purely an academic exercise to learn how to use switch case
 */
import javax.swing.JOptionPane;
public class SwitchCase {
	public static void main(String [] args)
	{
		//The user enters their role

		String role = JOptionPane.showInputDialog(null, "Please specify your role from the following list: Administrator, Faculty, Staff, Student or Guest.");


		
		
		//The program welcomes the user based off of the inputed role
		switch(role)
		{
			case "Administrator":
				JOptionPane.showMessageDialog(null,"Welcome " + role +"!");
				break;
			case "Faculty":
				JOptionPane.showMessageDialog(null,"Welcome " + role +"!");
				break;
			case "Staff":
				JOptionPane.showMessageDialog(null,"Welcome " + role +"!");
				break;
			case "Student":
				JOptionPane.showMessageDialog(null, "Welcome " + role +"!");
				break;
			case "Guest":
				JOptionPane.showMessageDialog(null, "Welcome " + role +"!");
				break;
		}
	}
}
