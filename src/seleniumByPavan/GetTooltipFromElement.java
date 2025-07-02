package seleniumByPavan;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTooltipFromElement {
	/*
	 *  ToolTip is a message that displayed when we mouse hover to pacific element
	 * It is always posted on title attribute 
	 * Get toolTip message we have to use getAttribute method and pass title on parameters
	 */

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/sortable/");
		driver.findElement(By.xpath("//a[text()='Tooltip']")).click();
		Thread.sleep(4000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement textBox = driver.findElement(By.xpath("//input[@id='age']"));
		String value = textBox.getAttribute("title");
		System.out.println(value);
		driver.close();

	}

}
