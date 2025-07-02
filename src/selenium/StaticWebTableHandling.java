package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/* 
   1 . How many rows in a table 
   2 . How many columns in a table 
   3 . Retrieve specific row/column data from a table 
   4 . Retrieve all table data from a table 
   5 . Print position and city of person name jack
*/

public class StaticWebTableHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		// How many rows in a table 
		int rows = driver.findElements(By.xpath("(//table)[2]//tbody//tr")).size();
		System.out.println("Number of rows present int the table is:" + " "+rows);
		// Find out how many columns in a table
		int colums = driver.findElements(By.xpath("(//table)[2]//thead//tr//th")).size();
		System.out.println("Nubmer of columns present in the table is :" + " "+colums);
		
		// Retrieve specific row/columns data value
		
		String value = driver.findElement(By.xpath("(//table)[2]//tbody//tr[2]//td[1]")).getText();
		System.out.println("This is specific data value: "+" " +value);
		
		// Retrieve all table data from a table
		
		System.out.println("Data from the table");
		for(int r =1; r<=rows;r++) {
			for(int c =1; c<=colums; c++) {
				//Here in xpath dynamically passing the row and column variable to get every row and column value
				
				String data = driver.findElement(By.xpath("(//table)[2]//tbody//tr["+r+"]//td["+c+"]")).getText();
				System.out.println(data);
			}
			System.out.println();
		}
		
		//   5 . Print position and city of person name jack
		for(int r =1; r<=rows;r++) {
			
				String person = driver.findElement(By.xpath("(//table)[2]//tbody//tr["+r+"]//td[1]")).getText();
			if(person.equals("Jack")) {
				String position = driver.findElement(By.xpath("(//table)[2]//tbody//tr["+r+"]//td[2]")).getText();
				String city = driver.findElement(By.xpath("(//table)[2]//tbody//tr["+r+"]//td[3]")).getText();
				System.out.println("Here is the specific person selected column data :"+ " " +person+ " "+position+"  "+city);
			}
			
			}
		
	
		
		driver.quit();

	}

}
