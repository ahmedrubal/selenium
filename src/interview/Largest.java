package interview;

import java.io.PrintStream;
import java.util.Arrays;

public class Largest {

	public static void main(String[] args) {
//		int num1 = 800;
//		int num2 = 700;
//		int num3 = 800;
//
//		if (num1 > num2 && num1 > num3)
//			System.out.println("Number" + " " + num1 + " one is largest");
//		if (num2 > num1 && num2 > num3 )
//			System.out.println("Number" + " " + num2 + " Two is largest");
//		if (num3 > num1 & num3 > num2 )
//			System.out.println("Number" + " " + num3 + "  Three is largest");
//    How to generate fibonaci series of 27
		// 0+1= 1 1+1 = 2 
		// 0 1 1 2 3 5 8,13 21 34
//		int n1 = 0; 
//		int n2 = 1; 
//		int sum =0;
//		System.out.print( n1+" "+n2);
//		for(int i =1; i<=5; i++) {
//			sum = n1+n2; 
//			System.out.print(" " +sum);
//			n1=n2; 
//			n2=sum; 
//			
//		}
		
//		Reverse a number
//		int number = 1234; 
//		int rev = 0; 
//		while (number!=0) {
//			rev=rev*10 +number%10;
//			number=number/10;
//		}
//		System.out.println(rev);
		
//		int no = 12346; 
//		int n = 100; 
//		int div = 10; 
//		System.out.println(200/20);
//		System.out.println(n/div);
//		System.out.println(no%10);
//		System.out.println(no/10);
	// Find largest using Tarnery Operator 
//		int one = 15; 
//		int two = 100; 
//		int three =90;
//		
//		
//		int max = (one>two)? one : two;
//		
//		int highestmax = (three >max) ? three : max ; 
//		System.out.println(highestmax);

		
		
//		String ar  = st.split(" ")[1];
//		String up = ar.toUpperCase();
//		System.out.println(up);
	
	
	
	
	//	String s = st.split(mid);
	//	System.out.println(s);
//		for(String sr:arr) {
//			System.out.println(sr);
//		}
		
		
		
//		String upper = "";
//		String lower = "";
//		System.out.println(st.length());
//		int mid = st.length()/2;
//		System.out.println(mid);
//		for(int i =0; i<st.length(); i++) {
//			if(i<mid) {
//				lower = lower+Character.toLowerCase(st.charAt(i));
//			}else {
//				upper =upper+Character.toUpperCase(st.charAt(i));
//			}
//		}
//		System.out.print(upper);
//		System.out.print(" "+lower);
		
		String st ="Welcome**$$%%";
		int len = st.length();
		System.out.println("Length Before remove: "+" "+len);
		String removed = st.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(removed);
		int lenAfter = removed.length();
		System.out.println("Length After removed "+" "+lenAfter);
		System.out.println(len -lenAfter);
	
		
		

	}

}
