package naveenJavaDemo;

import java.text.DecimalFormat;
import java.util.Arrays;

public class FindPercentageFromString {
	
	// Please find a Percentage of Letter from Given String
	
	public static void makeArray(int []arr) {
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void getCharPercentage(String str){
		
		int len = str.length(); 
		
		int  upperCaseCount =0 ;
		int lowerCaseCount =0 ;
		int isDigitCount = 0;
		int specialCharacterCount = 0 ; 
		
		for(int i =0; i<len; i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				upperCaseCount++;
			}else if (Character.isLowerCase(ch)) {
				lowerCaseCount++;
			}else if(Character.isDigit(ch)) {
				
				isDigitCount++;
				
			}else {
				specialCharacterCount++;
			}
		}
		System.out.println("******----------------**********");
		
		System.out.println(upperCaseCount);
		System.out.println(lowerCaseCount);
		System.out.println(isDigitCount);
		System.out.println(specialCharacterCount);
		
		
		double upperCaseCountPercentage = (upperCaseCount*100)/len;
		double lowerCaseCountPercentage = (lowerCaseCount*100)/len;
		double isDigitCountPercentage = (isDigitCount*100)/len;
		double specialCharacterCountPercentage = (specialCharacterCount*100)/len;
		
		System.out.println("-------***-------");
		DecimalFormat formatter = new DecimalFormat("#0.0000");
		
		
		
		
		System.out.println("upper Case %---:" + formatter.format(upperCaseCountPercentage));
		System.out.println("lower Case %----:" + formatter.format(lowerCaseCountPercentage));
		System.out.println("digit Case %----: "+ formatter.format(isDigitCountPercentage));
		System.out.println("Special Case %---:"+ formatter.format(specialCharacterCountPercentage));
		
		
		
		
		
			
			
			
		}
	
		
	
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6};
		makeArray(arr);
		System.out.println("*****Executin First Result******");
		getCharPercentage("Naveen Automation Labs 123 #@$%");
		System.out.println("*****Executin Second Result******");
		getCharPercentage("Naveen 123");
		System.out.println("*****Executin Third Result******");
		getCharPercentage("123 $%^");
		System.out.println("*****Executin Fourth Result******");
		getCharPercentage("@!#$%^^&&****");
	

	}

}
