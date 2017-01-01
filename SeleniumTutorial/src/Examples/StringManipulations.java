package Examples;

public class StringManipulations {

	public static void main(String[] args) {


		try {
			String name = "Shah Rukh 12345 Khan ";

			System.out.println("Length of name = "+ name.length());

			System.out.println("Character at position 5 = "+ name.charAt(4));

			String nameWithOutSpaces = name.replace(" ", "");
			System.out.println(nameWithOutSpaces);
			
			String subSt = name.substring(5);
			System.out.println(subSt);
			
			String replaceNumb = name.replaceAll("[0-9]", "");
			System.out.println(replaceNumb);
			
		//	Character particularchar = name.charAt(10);
		 	String numberOnly = name.substring(name.indexOf("1"),name.indexOf("5")+1);
			System.out.println(numberOnly);

			
			String x = "abcdef";
			System.out.println(x.toUpperCase());
			
			
			
			StringBuffer sb = new StringBuffer("Selenium");
			System.out.println(sb.reverse());

			sb.replace(1, 3, "Training");
			System.out.println(sb);
	 		
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("The method is executed!");
		}

	}

}
