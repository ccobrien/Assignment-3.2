import java.util.Scanner;
/**
 * @author Chris O'Brien
 * This program takes 5 user inputed numbers and outputs the sum, average, maximum and minimum 
 * of the five numbers.1
 * 
 *
 */
public class FiveNumbers
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int num1, num2, num3, num4, num5;
		int sum, average, max, min;

		//prompts for and inputs the five user numbers
		System.out.println("Please input the first number.");
		num1 = keyboard.nextInt();
		System.out.println("Please input the second number.");
		num2 = keyboard.nextInt();
		System.out.println("Please input the third number.");
		num3= keyboard.nextInt();
		System.out.println("Please input the fourth number.");
		num4= keyboard.nextInt();
		System.out.println("Please input the fifth number.");
		num5= keyboard.nextInt();
		keyboard.close();
		
		//determines and outputs the sum of the five numbers
		sum = num1 + num2 +num3 + num4+ num5;
		System.out.println("The sum of the numbers is " + sum + ".");
		
		//determines and outputs the average of the five numbers
		average = sum / 5;
		System.out.println("The average of the numbers is " + average + ".");
		
		
		max = num1;
		min = num1;
		//The next set of if else statements determines the which number between the first and second number is the largest.
		if(num1 - num2 > 0){
			max = num1;
			min = num2;	
		}
		else if(num1 - num2 < 0){
			min = num1;
			max = num2; 
		}
		//The next 3 if statements determine which number of the 5 inputed numbers is the largest
		if(max - num3 < 0){
			max = num3;
		}
		if(max - num4 < 0){
			max = num4;
		}
		if(max - num5 < 0){
			max = num5;
		}
		//Output the largest number
		System.out.println("The maximum number of the five inputed numbers is " + max + ".");
		//The next 3 if statements determines which number of the 5 inputed numbers is the smallest
		if(min - num3 > 0){
			min = num3;
		}
		if(min - num4 > 0){
			min = num4;
		}
		if(min - num5 > 0){
			min = num5;
		}
		//Output the smallest number
		System.out.println("The minimum number of the five inputed numbers is " + min + ".");
			
		
	}
}
