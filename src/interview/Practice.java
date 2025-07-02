package interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Practice {
	
	public static void main(String []args) {
		
	String[] duplicate = {"java","Selenium","java","Python"};
	for (int i=0; i<duplicate.length; i++) {
		for (int j=i+1; j<duplicate.length; j++) {
			if (duplicate[i].equals(duplicate[j])) {
				System.out.println(duplicate[i]);

			}
		}
	}
	
	String str[] = {"Amazon", "Nepal", "India", "India","Nepal" };
	Set<String> st = new HashSet<String>();
	for(String dup :str) {
		if(st.add(dup)==false){
			System.out.println(dup);
			
		}
	}
	// Find number of times repeat a word
	HashMap<String,Integer> ma = new HashMap<String ,Integer>();
	
	for(String s :str) {
		if(ma.containsKey(s)) {
			ma.put(s, ma.get(s)+1);
		}else {
			ma.put(s, 1);
		}
}
	System.out.println(ma);
	
		
	}
	
	
	
	
			
	


		
	}


