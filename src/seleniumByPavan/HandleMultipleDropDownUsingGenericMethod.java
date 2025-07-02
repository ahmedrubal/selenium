package seleniumByPavan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleDropDownUsingGenericMethod {
	public static WebDriver driver;
   
	
	// Handle multiple drop down using user define/generic  method without using select class method
	public static void multipleDrpHandle(WebElement ele, String value) throws InterruptedException {
		Select drpSelect = new Select(ele);
		List<WebElement> allOptions = drpSelect.getOptions();
		for (WebElement option : allOptions) {
			String item = option.getText();
			if (item.equalsIgnoreCase(value)) {
				option.click();
				Thread.sleep(3000);
				break;
			}
		}
	}
	public static void launchApp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement userFiled = driver.findElement(By.id("txtUsername"));
		userFiled.sendKeys("Admin");
		Thread.sleep(3000);
		WebElement passField = driver.findElement(By.id("txtPassword"));
		passField.sendKeys("admin123");
		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		loginBtn.click();
		Thread.sleep(3000);
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		HandleMultipleDropDownUsingGenericMethod.launchApp();
		
		// user Type drop down field
		WebElement userType = driver.findElement(By.xpath("//select[@id='searchSystemUser_userType']"));
		
		//Status drop down field
		WebElement systemStaus = driver.findElement(By.xpath("//select[@id='searchSystemUser_status']"));
		
		HandleMultipleDropDownUsingGenericMethod.multipleDrpHandle(userType, "Admin");
		HandleMultipleDropDownUsingGenericMethod.multipleDrpHandle(systemStaus, "Disabled");
	}

}
