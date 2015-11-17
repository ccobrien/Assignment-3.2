
import javax.swing.JOptionPane;
public class JavaConstants {
	public static final int QUARTERS = 25, DIMES = 10, NICKELS = 5, PENNIES = 1;
	public static void main(String args [])
	{
		JOptionPane.showMessageDialog(null, "You will be asked for the amount of dollars you want change for.");
		int ones =Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of one dollar bills."));
		int fives =Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of five dollar bills."));
		int tens =Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of ten dollar bills."));

		int money =(ones + fives * 5 + tens* 10) * 100;
		
		JOptionPane.showMessageDialog(null, "The total amount of money your want change for is, " + money/100 + "dollars");

		int numQuart = money / QUARTERS;
		int numDimes = money / DIMES;
		int numNick = money / NICKELS;
		int numPen = money / PENNIES;
		
		JOptionPane.showMessageDialog(null, "The change in quarters is, " + numQuart);
		JOptionPane.showMessageDialog(null, "The change in dimes is, " + numDimes);
		JOptionPane.showMessageDialog(null,  "The change in nickels is, " + numNick);
		JOptionPane.showMessageDialog(null, "The change in pennies is, " + numPen);
	}
}
