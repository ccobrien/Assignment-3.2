import javax.swing.JOptionPane;
/**
 * 
 * @author cco207
 * This program outputs the group and team size based off of the inputed number of people and number of players
 */

public class IfElseBoolean {
	public static void main(String [] args)
	{
		String peopleNum, playersNum;
		//Input number of people
		peopleNum = JOptionPane.showInputDialog(null, "Please input the number of people.");
		int numPeople = Integer.parseInt(peopleNum);
		
		//input number of players
		playersNum = JOptionPane.showInputDialog(null, "Please input the number of players.");
		int numPlayers = Integer.parseInt(playersNum);
		
		
		int groupSize, teamSize;
		//determine the group size based off of number of people, and output group size
		if(numPeople > 10)
		{
			groupSize = numPeople/2;
			JOptionPane.showMessageDialog(null, "The group size is " + groupSize + ".");
		}
		else if(numPeople > 3)
		{
			groupSize = numPeople/3;
			JOptionPane.showMessageDialog(null, "The group size is " + groupSize + ".");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "The number of people has to be at least 3.");
		}
		
		//determine the team size based off of the number of players, and output the team size
		if(numPlayers >= 11 && numPlayers <= 55)
		{
			teamSize = numPlayers/11;
			JOptionPane.showMessageDialog(null, "The team size is " + teamSize + ".");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "The team size is 1.");
		}
		
	}

}
