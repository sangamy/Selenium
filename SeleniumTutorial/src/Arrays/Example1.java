package Arrays;

public class Example1 {
	public static void main(String[] args) {

		String[]	names = {"x","y","z"};

		String[] cities = new String[4] ;
		cities[0] = "a";
		cities[1] = "b";
		cities[2] = "c";
		cities[3] = "d";

		Integer[]	age;
		Double[]	income;
		//names[0]="x"
		//names[1]="y"
		//names[2]="z"
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);

		}
		for (int i = 0; i < cities.length; i++) {
			System.out.println(cities[i]);

		}
		
		

	}

}
