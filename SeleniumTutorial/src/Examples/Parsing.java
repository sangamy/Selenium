package Examples;

public class Parsing {

	public static void main(String[] args) {
 
		
String str1 = "$1234";
String str2 = "$1235";

str1=str1.replace("$", "");
str2=str2.replace("$", "");

if(Integer.parseInt(str1) == Integer.parseInt(str2))
 System.out.println("Both numbers are equal!");
else
	 System.out.println("Both numbers are NOT equal!");


	}

}
