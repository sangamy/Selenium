package Examples;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, String> h = new HashMap();

		h.put("FirstName1", "Barack");
		h.put("MiddleName1", "Hussein");
		h.put("LastName1", "Obama");
		
		h.put("FirstName2", "Hillary");
		h.put("MiddleName2", "H");
		h.put("LastName2", "Clinton");
		
		h.put("FirstName3", "Donald");
		h.put("MiddleName3", "J");
		h.put("LastName3", "Trump");
	
		for (int i = 1; i <= 3; i++) {
			System.out.println(h.get("FirstName"+i)+ " "+ h.get("MiddleName"+i)+ " "+h.get("LastName"+i));

		}
		


	}

}
