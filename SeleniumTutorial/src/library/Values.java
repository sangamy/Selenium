package library;

public class Values {


	/**
	 * assignvalues: declare few variables, assign them values, and print them to console
	 */
	public static void assignValues(){

		//Variable Delcaration
		int  age;
		double income;
		long zipcode;

		// Variable Initialization		
		age = 25;
		income = 4000.25;
		zipcode = 50075;

		System.out.println("Age = "+age+"\n"+"Income = "+income +"\n"+"Zipcode = "+zipcode);//  \n=new line character, + =concatenation operator
	}


	//	Static cannot access non-static members (Function, Variable)
	//	Static can only access static members
	//	Non-static can access static members	

	/*public static void staticFunction1(){

		nonStaticFunction();//error
	}*/

	public static void staticFunction(){

		assignValues();
	}

	public void nonStaticFunction(){

		assignValues();
	}

}