import java.util.Scanner;
public class Rectangle{ 
	public static void main(String [] args)
	{
		System.out.println("Enter the width.");
		Scanner keyboard = new Scanner(System.in);
		double width = keyboard.nextDouble();

		System.out.println("Enter the height.");
		double height = keyboard.nextDouble();

		double perimeter = width * 2 + height *2;
		double area = height * width;
	
		System.out.println("The perimeter of the rectangle is " + perimeter + ".");
		System.out.println("The area of the rectangle is " + area + ".");
		keyboard.close();
	}
}
