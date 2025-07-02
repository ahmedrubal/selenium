package naveenJavaDemo;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 10, 9, 2 };

		Arrays.sort(arr);
		for (int a : arr) {
			System.out.println("For each loop " + a);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
