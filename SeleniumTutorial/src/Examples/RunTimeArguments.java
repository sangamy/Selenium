package Examples;

public class RunTimeArguments {

	public static void main(String[] args) {
 
 		if(Integer.parseInt(args[0]) > Integer.parseInt(args[1]))
		System.out.println("Max = "+args[0] + "; "+ "Min = "+args[1]);
		else
		System.out.println("Max = "+args[1] + "; "+ "Min = "+args[0]);

	 	
		
	}

}
