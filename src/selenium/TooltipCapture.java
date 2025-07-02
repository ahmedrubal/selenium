package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TooltipCapture {

	public static void main(String[] args) {	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/tooltip/");
	driver.switchTo().frame(0);
	WebElement inputBox = driver.findElement(By.xpath("//input[@id='age']"));
	
	// ToolTip is a message that displayed when we mouse hover to pacific element
	// It is always posted on title attribute 
	// Get toolTip message we have to use getAttribute method and pass title on parameters
	String toolTip =inputBox.getAttribute("title");	
	System.out.println(toolTip);
	driver.close();

	}

}
