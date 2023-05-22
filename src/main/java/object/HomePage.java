package object;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonAction.*;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//select[@id=\"popDropdown\"]")
	WebElement ProductBtn;
	
	@FindBy(xpath="//select[@id=\"popDropdown\"]")
	WebElement AutoBtn;
	
	@FindBy(xpath="//*[@id=\"quote-main-state-select\"]")
	WebElement SelectStateBtn;
	
	@FindBy(id = "quote-main-zip-btn")
	WebElement StrtAQuoteBtn;
	
	public void clickAutoBtn() {
		AutoBtn.click();
	}
	public void selectProductBtn(String value) {
		dropdown(ProductBtn,value);
	}
	public void selectStateBtn(String value) {
		dropdown(SelectStateBtn,value);
	}
	public void clickStrtAQuoteBtn(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", StrtAQuoteBtn);
		
	}

}
