package naveenJavaDemo;

public class HowToExecuteCommentInJava {
	/*
	 *  Question : How to execute comments in java
	 *  If you use \u000d UniCode in your comment then compiler treat is as new line
	 */

	public static void main(String[] args) {
		
		// this is my java program \u000d System.out.println("UniCode Character making new line");
		
      System.out.println("New Program");
      System.out.println("Hello Naveen");
      System.out.println(\u000d); // This one making a new line means Empty Line
      System.out.println("java is a language");
	}

}
