package NewPackage;


import java.util.Arrays;

import com.google.common.primitives.Ints;

public class MergeTwoArray {
	
	// Merge Two Array Together
	// Print them in Ascending Order

	public static void main(String[] args) {
		int [] arr = {6,2,9,1};
		int []arr2 = {5,4,1,8};
		int alen = arr.length;
		int alen2 = arr2.length;
		int []result = new int[alen+alen2];
		System.arraycopy(arr, 0, result, 0, alen);
		System.arraycopy(arr2, 0, result, alen, alen2);
		System.out.println(Arrays.toString(result));
		Arrays.sort(result);
		//System.out.println(result);
		for(int c:result) {
			System.out.println(c);
		}
		
		System.out.println("******New Way to do it******");
		
		int []p3= Ints.concat(arr, arr2);
		Arrays.sort(p3);
		for(int a :p3) {
			System.out.println(a);
		}
	
		
		
		
	

	}

}
