package Examples;

public class Boolean {

// Always initialize the returning variable before try block and return it's value after catch block
	public static boolean compareTwoNames(String name1, String name2){

		boolean flag=false;
		try {
			if(name1.equals(name2))
				flag=true;
			else
				flag=false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static void main(String[] args) {

		// Call function which returns true
		String name1 = "vijay";
		String name2 = "vijay";
		
	boolean namescomp=	compareTwoNames(name1, name2);
		
		System.out.println("The two names are equal: "+ namescomp);
		
		
		// Call function which returns false

		

	}

}