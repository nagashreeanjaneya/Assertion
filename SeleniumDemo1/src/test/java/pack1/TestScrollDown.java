package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestScrollDown {
	@Test
	public void testScrollDown() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/admin/Desktop/html%20files/multiplemanyfield.html");
		RemoteWebDriver r =(RemoteWebDriver) driver;
		String c="window.scrollTo(0,document.body.scrollHeight)";
		Thread.sleep(2000);
		r.executeScript(c);
	}
}
