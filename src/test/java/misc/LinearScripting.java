package misc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinearScripting {
	WebDriver driver;
	@BeforeMethod
	public void beforeEachTest() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	
	@Test
	
	public void testHomePageTitle() {
		driver.get("https://www.statefarm.com/");
		WebElement element=driver.findElement(By.xpath("//*[@id=\"oneX-sf-logo\"]"));
		String alt=element.getAttribute("alt");
		System.out.println(alt);
	}
	@AfterMethod
	public void closingDriver() {
		driver.quit();
	}
	

}
