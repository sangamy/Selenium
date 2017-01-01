package ExceptionHandling;
//Exception handling with Try-Catch (throws) -Finally
public class Example1 {


	public static void ex1() throws Exception{
		try {
			System.out.println("Entered Try Block");
			String[] x1 = {"a","b"}; //Size=2 [indexes: 0,1]
			//	x1[0] = "abc"; // Exception occurred because Array index started from -1 where as it should be 0
			System.out.println("Length of array = "+x1.length);

			for (int i = 0; i < x1.length+2; i++) {
				System.out.println(x1[i]);
			}
		} catch (Exception e) {
			System.out.println("Entered Catch Block");
			e.printStackTrace();
			throw e; // throws exception and aborts the execution
		}

		finally{ //Write the lines of code in finally block to execute them even if exception occurs
			System.out.println("Entered Finally block");
		}

	}

	public static void ex2(){

		System.out.println("Entered ex2");
	}
	public static void main(String[] args) throws Exception {

		ex1();
		ex2();

	}

}
