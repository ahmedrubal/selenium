package naveenJavaDemo;

public class PrivateConstructor {
	
	/* 
	 * How can we  create an object if constructor declared as private ? 
	 * Two ways we can do it 
	 * 1 .  Creating  a static block we can create an object
	 * 2 . Also we can create an static method create an object
	 * 
	 */
	
	int x; 
	private PrivateConstructor() {
		x=10;
	}
	
	static {
		PrivateConstructor obj1 = new PrivateConstructor();
		
	}
	public static int createObject() {
		PrivateConstructor obj1 = new PrivateConstructor();
				obj1.x=40;
				return obj1.x;
	}
	
	

	public static void main(String[] args) {
		PrivateConstructor obj = new PrivateConstructor();
		System.out.println(obj.x);

	}

}
