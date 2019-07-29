package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageFac {
	
	public WebDriver d;
	
	@FindBy(id ="1")
	public WebElement der;
	
	@FindBy(xpath = "tes")
	public WebElement ser;
	@FindBy(how = How.ID, id = "test")
	public WebElement tesr;
	
	
	public PageFac(WebDriver driver)
	{
		this.d = driver;
		PageFactory.initElements(d, this);
	}

	public void test()
	{
		ser.click();
	}
}
