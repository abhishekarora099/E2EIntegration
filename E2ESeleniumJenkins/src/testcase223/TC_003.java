package testcase223;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC_003
{
@Test
	public void testcase1()
	{
	System.setProperty("webdriver.chrome.driver","F:/chromedriver_win32/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElementById("email").sendKeys("Hello");
		driver.findElementById("pass").sendKeys("Hello");
		driver.quit();
		}
	}
	

