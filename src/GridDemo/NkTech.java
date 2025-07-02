package GridDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;



public class NkTech {

	@Test()
	public void amzonLogin() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setBrowserName("chrome");
		cap.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.38:4444"), cap);
		driver.get("https://nktechsolutions.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='First']")).sendKeys("Rubal");
		driver.findElement(By.xpath("//input[@placeholder='Last']")).sendKeys("Ahmed");
		driver.close();

	}

}
