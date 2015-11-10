
/*
 * This program is made by Christopher O'Brien
 * It converts height from centimeters to feet and inches
 * Class Exercise 2.3
 */
import javax.swing.JOptionPane;

public class Conversion {
	public static void main(String [] args){
		//program takes input for centimeters
		String centi = JOptionPane.showInputDialog(null, "Please enter a height in centimeters.");
	
		double metric = Double.parseDouble(centi);
		//converts the input into english units
		double inch = metric * 0.394;
		double feet = inch / 12;
		//splits the height into feet and inches
		int feets = (int)Math.floor(feet);
		double inches = (inch) - (12*feets);
				
		//outputs the height in english units(feet and inches)
		JOptionPane.showMessageDialog(null, String.format("The height in English units is " + feets + " feet, and %.3f inches.", inches));
		
	}
}
