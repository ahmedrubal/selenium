package naveenJavaDemo;

import java.util.Arrays;
import java.util.stream.Stream;

import com.google.common.primitives.Ints;

public class CombineTwoArrays {
	/* Question : How to combine arrays in java ? 
	 * 
	 */

	public static void main(String[] args) {
		
		//String Data Type array combining using java Stream
		
		String [] batsman = {"Rohit","Imran","Sahin","Rubal","Nahid","Fahim" };
		
		String [] bowler = {"Nandu", "Sani", "Sakib", "Jony","Lulu"};
		
		Stream<String>sBat = Arrays.stream(batsman);
		Stream<String>sBow = Arrays.stream(bowler);
	    String []fullTeam = Stream.concat(sBat, sBow).toArray(size -> new String[size]);
	   
		for(String team: fullTeam) {
         
			System.out.println("Player Name  : "+ "  "+ team);
		}

		
		
		
		// Combine Primitive data types array

		int[] array = { 3, 5, 6, 9, 1, 10 };
		int[] arr = { 1, 4, 5, 10, 9, 2 };
		int[] a3 = Ints.concat(array, arr);
		for (int a : a3) {
			System.out.println(a);

		}
	}
}
