package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 * 	We can Specify ArrayList data type is an Object 
    Object allow to add any type of data
    When we don't know what type of data is returning 
    ArrayList<Object> originalList = new ArrayList<Object>();
    ArrayList<Object> tempList = new ArrayList<Object>();
 * 
 */

public class CheckDropDownSorted {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.linkText("REGISTER")).click();
		List<WebElement> drpElement = driver.findElements(By.xpath("//select[@name='country']/option"));
//		Select drpselect = new Select(drpElement);
//		List<WebElement>options = drpselect.getOptions();
//		System.out.println(options.size());
		System.out.println(drpElement.size());
		

		ArrayList<Object> originalList = new ArrayList<Object>();
		ArrayList<Object> tempList = new ArrayList<Object>();
			
				for(WebElement item:drpElement) {
					originalList.add(item.getText());
					tempList.add(item.getText());
				}

				System.out.println("original list: "+originalList);
						
				System.out.println("****seperation*****");
				System.out.println("tempList:"+ tempList);
				
				
				Collections.reverse(tempList); //Temp list reversed manually to demonstrate
				System.out.println("This value after reversing:"+tempList);
				if(originalList.equals(tempList)) {
					System.out.println("DropDown Sorted");
				}else {
					System.out.println("Dropdown Unsorted");
				}
				driver.close();
						

	}

}
