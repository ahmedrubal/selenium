package naveenJavaDemo;

public class TestingStaticRules {
	
	/* ** Which of the Program will execute first
	 * 
	 * Instance Initialization block has no keyword front of {} braces
	 * Constructor and Instance Initialization block will execute only if Object created for class . 
	 * main method is must be exist to execute static block but it will execute before main method
	 * 
	 * We cant't call non static variable inside the static method directly But we can call them 
	 * making object of the class
	 *  
	 */
	
	int x = 20 ; 
	public TestingStaticRules() {
		System.out.println("This is Constructor");
	}
	{
		System.out.println("Instance Initialization Block");
	}
	
	
	static {
		System.out.println("Static Block will execute before main method loaded");
	}
	
	
	public static void test() {
		
		System.out.println("Coming from static method");
		
	}
	public static void var() {
		TestingStaticRules t = new TestingStaticRules();
		System.out.println("Calling non static variable inside staic method :" + " "+ t.x);
	}

	public static void main(String[] args) {
		TestingStaticRules t = new TestingStaticRules(); // Object Created just to call constructor
		TestingStaticRules.test(); //This is only to run static method 
		TestingStaticRules.var();

	}

}
