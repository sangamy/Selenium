package Examples;

public class While {

	public static void main(String[] args) {
		int i = 1;

		// While Loop
		while(i<=30){
			System.out.println(i);		
			i++;
		}

		// Do-While Loop ( when the first condition needs to be skipped )	
		
		int j =6;
		do{
			System.out.println(j);		
			j--; 
		} while (j>2);

	}

}
