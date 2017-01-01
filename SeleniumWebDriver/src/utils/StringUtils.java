/**
 * Date: Dec 31, 2016
 * Author: Sangam
 * TestCase: StringUtils.java
 * Description: Reusable String Utility Functions
 */
package utils;

public class StringUtils {
	
	
	public static boolean compare(String expectedValue, String actualValue){
		boolean flag;
		 if(expectedValue.equalsIgnoreCase(actualValue)){
			flag=true;
			System.out.println("PASS :: expectedValue :"+ expectedValue + " = "+ "actualValue :"+ actualValue );
		 }
		else{
			flag=false; 
			System.out.println("FAIL :: expectedValue :"+ expectedValue + " != "+ "actualValue :"+ actualValue);

		}
	//	flag=expectedValue.equalsIgnoreCase(actualValue)?true:false;
  		
		
		return flag;
		
	}
	

}
