package Examples;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
 
		
	float temp;
	Scanner in = new Scanner(System.in);
 	System.out.println("Please enter temperature in fahrenheit");
	temp= in.nextInt();
	temp=(temp-32)*5/9;// Calculation
	System.out.println("Temperature in Celsius = "+ temp);
	
	}

}
