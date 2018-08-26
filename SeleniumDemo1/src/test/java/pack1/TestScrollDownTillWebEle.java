package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestScrollDownTillWebEle {
	@Test
	public void testScrollDownTill() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/admin/Desktop/html%20files/multiplemanyfield.html");
		RemoteWebDriver r =(RemoteWebDriver) driver;
		WebElement t1 = driver.findElement(By.id("r5"));
		Point p = t1.getLocation();
		int y = p.getY();
		String c="window.scrollTo(0,"+y+")";
		Thread.sleep(2000);
		r.executeScript(c);
	}
}
