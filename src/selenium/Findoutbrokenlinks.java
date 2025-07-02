package selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

//import NewPackage.SimpleBaseClass;

public class Findoutbrokenlinks  {
	public static WebDriver driver;
	public static String pageUrl = "https://www.spicejet.com/";
	static HttpURLConnection conn;
	public static int responseCode;

	//@Test
	public static void brokenLinks() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(pageUrl);
		System.out.println("This is the actual page url" + " "+pageUrl);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		Iterator<WebElement> it = links.iterator();
		while (it.hasNext()) {
			String url = it.next().getAttribute("href");
			//System.out.println(url);
			
			if (url == null || url.isEmpty()) {
				System.out.println("url is not configured to webpage or it is empty");
			}
			if (!url.startsWith(pageUrl)) {
				System.out.println("This link not related to this page");
			}
			try {
				conn = (HttpURLConnection) new URL(pageUrl).openConnection();
				conn.setRequestMethod("HEAD");
				conn.connect();
				conn.getResponseCode();
			} catch (Exception e) {

				e.printStackTrace();
			}
			try {
				if (responseCode >= 400) {
					System.out.println("This is the broken link" + url + "with resposeCode" + responseCode);

				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}

		}
		driver.close();
	}
	public static void main(String[]args) {
		Findoutbrokenlinks.brokenLinks();
	}
}
