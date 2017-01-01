package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		WebDriver driver = null;
		try {
 			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
 			System.setProperty("webdriver.firefox.driver", "D:\\Selenium\\drivers\\geckodriver.exe");

 				driver = new ChromeDriver(); //Chrome
		//	driver = new FirefoxDriver(); //Firefox
		//	driver = new MarionetteDriver();
 		//	driver = new InternetExplorerDriver(); //IE
					
			driver.manage().window().maximize();
			Thread.sleep(1000);
			//driver.get("https://www.google.com");
			driver.navigate().to("http://www.kayak.com");
			driver.quit();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally{
			//driver.close();
			System.out.println("Entered finally block!");
		}
	}

}
