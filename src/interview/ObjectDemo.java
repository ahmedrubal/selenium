package interview;

import java.lang.reflect.Method;

public class ObjectDemo {
    // We can use Class class object to find method present in specific class
	public static void main(String[] args) throws ClassNotFoundException {
    int count =0; 
    Class c =Class.forName("java.lang.Object");
     Method[]cls = c.getDeclaredMethods();
       for(Method m:cls) {
    System.out.println(m);
    count++;
    }
    System.out.println("Number of Packages"+ count);
    
    
  
	}

}
