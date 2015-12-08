import java.util.Scanner;
//this program runs the class Day
//Author Christopher O'Brien
public class DayDriver {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Day day = new Day("Sunday");
		System.out.println("The day is " + day);
		System.out.println("Next day is " + day.nextDay());
		System.out.println("Previous days is " + day.previousDay());
		System.out.println("Enter number of days in the future:");
		
		int numDays = input.nextInt();
		System.out.println("The day " + numDays + " days from today is a " + day.chooseDay(numDays));
		
	}
}
 
