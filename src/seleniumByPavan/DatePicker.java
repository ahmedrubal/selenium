package seleniumByPavan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {
	
	
	public  static void datePickerDesignOne() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("onward_cal")).click();
		
		
		String year = "2022";
		String month = "Oct";
		String day = "19";
		// Month and Year Selection
		while(true) {
			String text= driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			String []arr= text.split(" ");
			String mn = arr[0];
			String yr = arr[1];
			if(mn.equals(month) && yr.equals(year))
				break;
			else {
				driver.findElement(By.xpath("//td[@class='next']")).click();
			}
		} 
		// Date Selection
		List<WebElement>dates= driver.findElements(By.xpath("//tbody//td"));
		for(WebElement date:dates) {
			String selectDate = date.getText();
			if(selectDate.equals(day))
				date.click();
			
		}
		driver.close();
		
		
	}
	
	public static void datePickerDesignPatternTwo() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");   
	    WebElement dobField = driver.findElement(By.id("dob"));
	    dobField.click();
	    
	    // Month and Year Selection
	    Select monthSelection = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
	    monthSelection.selectByVisibleText("Nov");
	    Select yearSelection = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
	    yearSelection.selectByVisibleText("1990");
	    Thread.sleep(7000);
	    
	    //Date Selection 
	   List<WebElement>datesOption =  driver.findElements(By.xpath("//tbody//tr//td//a"));
	   String day = "25";
	   for(WebElement date:datesOption) {
		  String text = date.getText();
		  if(text.equals(day))
			  date.click();
	   }
	   driver.close();
	}
	   
	   
	public static void main(String[] args) throws InterruptedException  {
	
		DatePicker.datePickerDesignOne();
		DatePicker.datePickerDesignPatternTwo();

	}

}
