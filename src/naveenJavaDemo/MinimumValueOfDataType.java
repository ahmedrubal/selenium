package naveenJavaDemo;

public class MinimumValueOfDataType {

	/* What is the value of double MIN_VALUE ?
	 * Which one is bigger ->Double.MIN_VALUE OR 0.0d ?
	 * Which one is bigger ->Double.MIN_VALUE OR NEGATIVE_INFINITY
	 * 
	 */
	public static void main(String[] args) {

	System.out.println(Integer.MIN_VALUE); // Negative Number -2147483648
	System.out.println(Long.MIN_VALUE); // Negative Number -9223372036854775808
	
	System.out.println(Double.MIN_VALUE); // Positive Number 4.9E-324
	System.out.println(Float.MIN_VALUE);  //Positive Number 1.4E-45
	
	System.out.println(Math.min(Double.MIN_VALUE, 0.0d));  //0.0
	System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY)); //-Infinity
	System.out.println(Double.NEGATIVE_INFINITY); //-Infinity
	

	

	}

}
