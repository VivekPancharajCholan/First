package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import ru.sbtqa.tag.pagefactory.PageFactory;

public class PageFactoryRefresh {
	WebDriver d;
	
	@FindBy(id = "we")
	WebElement search;
	
	@FindBy(how = How.ID, id = "dd")
	WebElement sear;
	
	public PageFactoryRefresh (WebDriver driver)
	{
		this.d = driver;
		PageFactory.initElements(d, this);
	}

}
