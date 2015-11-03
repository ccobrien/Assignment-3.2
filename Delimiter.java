
/**
 * This program is class exercise 2.1 for class CSC 200
 * @author cco207
 *
 */
import java.util.Scanner;
public class Delimiter{ 
	public static void main(String [] args){
		
		int first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, avg;

		Scanner keyboard1 = new Scanner(System.in);
		keyboard1.useDelimiter(",");
		
		System.out.println("Please enter a list of ten numbers that you want to find the average of : (Use comma \",\" as a delimiter) ");
		first = keyboard1.nextInt();
		second = keyboard1.nextInt();
		third = keyboard1.nextInt();
		fourth = keyboard1.nextInt();
		fifth = keyboard1.nextInt();
		sixth = keyboard1.nextInt();
		seventh = keyboard1.nextInt();
		eighth = keyboard1.nextInt();
		ninth = keyboard1.nextInt();
		tenth = keyboard1.nextInt();
		
		
		System.out.println("The numbers are \"" + first + "\", \"" + second + "\", " + third+ "\", \"" + fourth  + "\", \"" + fifth  + "\", \"" + sixth  + "\", \"" + seventh  + "\", \"" + eighth  + "\", \"" + ninth  + "\", \"" + tenth + "\"." );

		avg = (first + second + third + fourth + fifth + sixth + seventh + eighth + ninth + tenth)/10;
		
		System.out.println("The average of the 10 numbers is " + avg + ".");
		keyboard1.close();
	}
}
