package test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;

public class AutoTest extends BaseClass {
	@Test(enabled=false)
	public void testStartAQuote() {
		WebElement element=driver.findElement(By.xpath("//*[@id=\"quote-main-zip-btn\"]"));
		String title=element.getAttribute("innerHTML");
		System.out.println(title);
	}
	@Test
	public void selectProductBtnTest() {
		homePage.selectProductBtn("Life");
		homePage.selectStateBtn("AL");
		homePage.clickStrtAQuoteBtn(driver);
	}
	@Test(enabled=false)
	public void clickProductBtnTest() {
		homePage.clickAutoBtn();
	}
	
	

}
