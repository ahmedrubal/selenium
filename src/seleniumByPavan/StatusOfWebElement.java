package seleniumByPavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusOfWebElement {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register");
		
		WebElement searchBox = driver.findElement(By.id("small-searchterms"));
		
		// isDisplayed(); Or isEnabled();
		System.out.println("Display Status : "+searchBox.isDisplayed()); //True
		System.out.println("Enabled Status : "+searchBox.isEnabled()); //True
		
		//isSelected();
		WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@id='gender-male']"));
		
		System.out.println("IsSelected Status Before select: "+maleRadioBtn.isSelected()); //False
		maleRadioBtn.click();
	
		System.out.println("IsSelectd status after select:  "+maleRadioBtn.isSelected()); //True
		
		
		driver.close();
		

	}

}
