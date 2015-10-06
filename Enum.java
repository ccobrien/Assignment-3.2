import javax.swing.JOptionPane;

public class Enum {
	enum Months {January, February, March, April, May, June, July, August, September, October, November, December}
	public static void main(String [] args)
	{
		Months [] choices = {Months.January, Months.February, Months.March, Months.April, Months.May, Months.June, Months.July, Months.August, Months.September, Months.October, Months.November, Months.December};
			
		Months select= (Months)JOptionPane.showInputDialog(null, "Specify the month.", "Month", JOptionPane.CANCEL_OPTION, null, choices, choices[0]);			 

		
		 while (select!=null) 
		 { 
			
			switch(select) 
             {
             	case January:
             	case February:
             	case December:
             		JOptionPane.showMessageDialog(null, "Do you want to build a snowman.");
             		break;
             		
             	case March:
             	case April:
             	case May:
             		JOptionPane.showMessageDialog(null, "Happy Spring Days!");
             		break;
             		
             	case June:
             	case July:
             	case August:
             		JOptionPane.showMessageDialog(null, "It's a summer time.");
             		break;
             		
             	case September:
             	case October:
             	case November:
             		JOptionPane.showMessageDialog(null, "Welcome to the foiliage season.");
             		break;
             }
			 select = (Months)JOptionPane.showInputDialog(null, "Specify the month.", "Month", JOptionPane.CANCEL_OPTION, null, choices, choices[0]);			 
             
		}
		
	}
}
