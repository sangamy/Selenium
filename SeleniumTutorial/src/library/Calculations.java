package library;

// Reusable methods for arithmetic calculations
public class Calculations {

	// Adding numbers

	public int add(int a, int b){

		int sum;

		sum = a+b;

		return sum;

	}

	// Difference of numbers

	public static double subtract(double x, double y){
		return x-y;
	}

	//Product of numbers
	public static int multi(int x, int y)
	{
		return x*y;
	}

	// Division of two numbers that returns the quotient
	public static int div(double x,double y)
	{
		return  (int) (x/y); // Type Casting
	}

	// Remainder when an integer is divided by another integer

	public static int rem(int x, int y)
	{
		return x%y; 
	}
	
	
	public static int min(int x, int y){
		
		if(x<y)
			return x;
		else
			return y;
		
	}

}
