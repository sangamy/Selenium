package library;

public class Constructors {

	
	// Variables/Fields
	int age;
	String name;
	double income;
	
	
	// Default Constructor (If we do not set any values, then these values will be initialized)
	public Constructors(){
		age = 1;
		name = "ABC";
		income= 30.265;
		
	}
	
	 
	// Parameterized Constructor (is used to set the values to all variables)

 
	public Constructors(int a, String b, double c){
 		this.age = a;
		this.name = b;
		this.income = c;
		System.out.println("a = "+this.age);
		System.out.println("b = "+this.name);
		System.out.println("c = "+this.income);

	}
	
	
	public void printSomething(){

		System.out.println("a = "+this.age);
		System.out.println("b = "+this.name);

	}
	
	public void printsomething1(){
		
		System.out.println("a = "+this.age);
		System.out.println("b = "+this.name);
		System.out.println("c = "+this.income);
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		System.out.println("Age is "+age);
 		
 		return age;

	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		System.out.println("Name is "+name);
 		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the income
	 */
	public double getIncome() {
		System.out.println("Income is "+income);
		return income;
	}


	/**
	 * @param income the income to set
	 */
	public void setIncome(double income) {
		this.income = income;
	}


	
	
	
}
