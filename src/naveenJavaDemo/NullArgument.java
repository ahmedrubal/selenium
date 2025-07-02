package naveenJavaDemo;

public class NullArgument {
	/*
	 * Pass null argument with method overloading with String and Object types
	 * Which method will execute 
	 * Answer: it will execute String argument Because string is a most common data type
	 * Default Value of Both  Object and String is Null
	 */

	public static void test(Object o) {
	System.out.println("Object Argument");
}
	public static void test(String s) {
		System.out.println("String Argument");
		
	}

	public static void main(String[] args) {
		test(null);
	
	

	}

}
