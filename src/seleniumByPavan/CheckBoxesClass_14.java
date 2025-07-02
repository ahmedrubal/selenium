package seleniumByPavan;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxesClass_14 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// 1. Select Specific CheckBox
		//driver.findElement(By.xpath("//input[@id='tuesday']")).click();
		
		// 2. Select all the element from CheckBoxes
		/*List<WebElement> items =driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		for(WebElement item:items) {
			item.click();
		}*/
		
		// 3. Select multiple CheckBoxes by user choice
		
		/*List<WebElement> items =driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		for(WebElement item:items) {
			String itemsName =item.getAttribute("id");
			//id attribute has small character for every day name 
			if(itemsName.equals("monday") || itemsName.equals("thursday")||itemsName.equals("sunday")){
				item.click();
			}
		}
          System.out.println("Test Completed");*/
		
		// 4 . Select last 2 items from choice list
		/*List<WebElement> items =driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		 int num = items.size();
		 System.out.println(num);
		for(int i=num-4; i<num; i++) {
			items.get(i).click();
			Thread.sleep(300);*/
		
		// 5. Select First 2 choices from list
		// 5. Approach One : >>>>  Using if block
		/*List<WebElement> items =driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		 int num = items.size();
		 System.out.println(num);
		for(int i=0; i<num; i++) {
			if(i<=3) {
				items.get(i).click();
				
			}*/
		
		// 5. Approach Two: >>>> Changing condition value inside for loop 
			List<WebElement> items =driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
			 int num = items.size();
			 System.out.println(num);
			for(int i=0; i<num-4; i++) {
                items.get(i).click();
					
		}
		
	}

}
