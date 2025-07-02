package naveenJavaDemo;

public class PropertyOfStaticBlock {
	/* Question : How to run java program without making an object 
	 * 
	 * Property of static block will be executed
	 * We don't have to call it in main method  or make object of the class 
	 * it will execute automatically
	 */
	
	 static  {
		System.out.println("Property of static block loaded before the main method");
	}

	public static void main(String[] args) {
		

	}

}
