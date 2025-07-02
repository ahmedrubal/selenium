package seleniumByPavan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {
	public static WebDriver driver;
	
	public static void dropDownUsingSelectMethods() throws InterruptedException
	{
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		WebElement drpEle = driver.findElement(By.xpath("//select[@name='country_id']"));
		
		Select drpSelect = new Select(drpEle);
		
		drpSelect.selectByIndex(5);
		Thread.sleep(3000);
		
		drpSelect.selectByValue("10");
		Thread.sleep(3000);
		
		drpSelect.selectByVisibleText("Aruba");
		Thread.sleep(3000);
	}
	
	public static void drpDownWithoutSelectMethods() {
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		WebElement drpEle = driver.findElement(By.xpath("//select[@name='country_id']"));
		
		Select drpSelect = new Select(drpEle);
		List<WebElement>allOptions = drpSelect.getOptions();
		for(WebElement option:allOptions) {
			String item = option.getText();
			if(item.equalsIgnoreCase("Bangladesh")) {
				option.click();
				break;
			}
		}
		
	}
	


	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	//HandleDropDown.dropDownUsingSelectMethods();
	HandleDropDown.drpDownWithoutSelectMethods();
	}

}
