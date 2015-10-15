import java.util.Arrays;
import javax.swing.JOptionPane;

public class AssignmentThree
{
	enum AccountType {Student, Administrator, Staff}
	public static void main(String [] args)
	{
		String[] userNames = {"Katie", "Kevin", "Diane"};
		String[] passwords = {"eitak", "nivek", "enaid"};
		String[] accountType = {"Student", "Administrator", "Staff"};
		int count = 0;
		int local = 0;		
		String passwordIn;
		String userNameIn =(String) JOptionPane.showInputDialog(null, "Please enter your Username.");
			
		
			while(!Arrays.asList(userNames).contains(userNameIn) && count <2)
			{
				userNameIn = (String) JOptionPane.showInputDialog(null, "Invalid Username. /n Please enter the correct username.");
				count ++;	
			}
			
			//determining the location of password in the passwords array
			if(userNameIn.equals("Kevin"))
			{
				local = 1;
			}
			if(userNameIn.equals("Diane"))
			{
				local = 2;
			}
			//check to see if username is correct before asking for password
			if(Arrays.asList(userNames).contains(userNameIn))  
			{
				passwordIn = (String) JOptionPane.showInputDialog(null, "Please enter your password");
			
			//initialize count for number of trials until you get locked out
				if(!passwordIn.equals(passwords[local]))
				{
					while(count<2 && !passwordIn.equals(passwords[local])) 
					{
					
						passwordIn = (String) JOptionPane.showInputDialog(null, "Wrong Password, please enter the correct password");
					
						count ++;
					}
				}
				
				if(passwordIn.equals(passwords[local]))
				{
					count--;
				}
			}
				//If the user has submitted to many submissions they will be prompted with this
				if(count >= 2)
				{
					JOptionPane.showMessageDialog(null,  "You have been locked out due to too many wrong submissions \n Please contact and Administrator");
				}
				//If the user has submitted the correct username and password they will be welcomed into the program
				else
				{
					JOptionPane.showMessageDialog(null, "Welcome, " + userNameIn + "!");
					
				
				
						AccountType [] choices = {AccountType.Student, AccountType.Administrator, AccountType.Staff};
						AccountType input = (AccountType)JOptionPane.showInputDialog(null,"Choose account type, ", "Account Type", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
					
				
					
						switch(input)
						{
											
							case Administrator:
								JOptionPane.showMessageDialog(null, "Welcome Admin, you can update and the read files.");
								break;
							
						
							case Student: 
								JOptionPane.showMessageDialog(null, "Welcome Student, you can only read files.");
								break;
							
							
							case Staff:
								JOptionPane.showMessageDialog(null, "Welcome Staff, you can update, read, and and delete files.");
								break;
							
						
					}
				}
	}
}
