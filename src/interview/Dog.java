package interview;
public  class Dog extends Animal{
	 String color = "Black";
	 Dog(){
		 super();
		 System.out.println("This is dog constructor");
		 
	 }
	 void eating() {
		 System.out.println("Dog eating bread");
		 super.eating();
	 }
	 void display() {
		 System.out.println(color);
		 System.out.println(super.color);
		 
	 }
	 }
	 
	
 
		
		
	
 
 

	
	

	


