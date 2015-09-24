/**
 * 
 * @author Chris O'Brien
 * This program outputs the solution to various problems having to do with order of operations 
 * and different data types
 *
 */
public class TypesOfVariables {
	public static void main(String[] args)
	{
		int a = 1/2;
		System.out.println("The answer to 1/2 = " + a);	

		int b = 1%2;
		System.out.println("The answer to 1%2 = " + b);

		double c = 1.0/2;
		System.out.println("The answer to 1.0/2 = " + c);
		
		int d = 5 + 7/2;
		System.out.println("The answer to 5 + 7/2 = " + d);
	
		String e = "Beat" + " " + "Army";
		System.out.println("The answer to \"Beat \" + \" \" + \"Army\" is \"" + e + "\".");
		
		int f = 6 + 13/5 - 35%3;
		System.out.println("The answer to 6 + 13/5 - 35%3 = " + f);
		
		double g = 3.5 * (5/4);
		System.out.println("The answer to 3.5 * (5/4) = " + g);
		
		double h = (3.5*5)/4; 
		System.out.println("The answer to (3.5 * 5) /4 = " + h);
	}
}
