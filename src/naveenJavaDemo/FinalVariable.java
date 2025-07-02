package naveenJavaDemo;

public class FinalVariable {
	/*
	 * If any class has final Variable and also has static block then static block never executed 
	 * Because it is never been loaded
	 * if you remove a final keyword then only static block will be executed
	 * 
	 */

	public static void main(String[] args) {
		System.out.println(Test.x);

	}

}

class Test{
	/*
	 *We know property of static block always loaded before the main method  
	 * But in this class we don't have any main method so it is not loading
	 */
	public static final  int x =10;
	  static  {
		System.out.println("--Main class has static block");
	}

	}
