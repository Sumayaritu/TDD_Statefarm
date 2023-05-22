package base;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import object.HomePage;
import util.Configuration;
import static util.Browser.*;



public class BaseClass {
	protected WebDriver driver;
	protected HomePage homePage;
	Configuration config=new Configuration();
	@BeforeMethod
	public void beforeEachTest() {
		String browserName=config.getProp("browser");
		initiatDriver(browserName);
		initObject();
		int pageLoad=config.getPropNum("pageLoad");
		int implicitLoad=config.getPropNum("implicitLoad");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoad));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitLoad));
		String url=config.getProp("url");
		driver.get(url);
	}
	public void initiatDriver(String browser) {
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":	
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		default:
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		}
		
	}
	public void initObject() {
		homePage=new HomePage(driver);
	}
	@AfterMethod
	public void closingBrowser() {
		driver.quit();
	}
	
	

}
