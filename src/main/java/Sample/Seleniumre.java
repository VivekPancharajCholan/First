package Sample;

import java.io.File;
import java.io.FileInputStream;

import java.net.URL;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import javax.net.ssl.HttpsURLConnection;
import javax.swing.text.Document;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bouncycastle.asn1.x509.AuthorityInformationAccess;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class Seleniumre {
	
	@Test
	public void testRun() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		WebDriver d = new ChromeDriver();
		//d.get("https://www.flipkart.com/");
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
	List<WebElement> swq = d.findElements(By.tagName("a"));
	
	    
	    
	   for(WebElement v : swq)
		
	   {
		System.out.println(v.getAttribute("href"));
	   }
		
	   
	   Wait<WebDriver> wait = new FluentWait<WebDriver>(d).withTimeout(100,TimeUnit.SECONDS).pollingEvery(1,TimeUnit.SECONDS).ignoring(ElementNotVisibleException.class);
		
		wait.until(new Function<WebDriver,WebElement>(){
			
			public WebElement apply(WebDriver driver)
			{
				return driver.findElement(By.id("1"));
			}
		});
		
		
		
		
		
		
		
		d.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("vivekraj.pr@gmail.com");
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("ViPa57(*");
		System.out.println(d.getTitle());
		WebElement ele = d.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));

		Select ss = new Select(ele);
		
	    ele.click();
	    Actions act = new Actions(d);
	  
	   Thread.sleep(3000);
	    WebDriverWait wait1 = new WebDriverWait(d,60);
	    
	    wait.until(ExpectedConditions.elementToBeClickable(d.findElement(By.xpath("//div[@class='_3pNZKl']//div[4]"))));
	    act.notify();
		
		act.moveToElement(d.findElement(By.xpath("//div[@class='_3pNZKl']//div[4]"))).build().perform();
		WebElement tar = d.findElement(By.xpath("//*[contains(text(), 'Notification Preferences')]"));
		act.moveToElement(tar).click().build().perform();
		((JavascriptExecutor)d).executeScript("document.getElementByID()", "tes");
	Set<String> des	 = d.getWindowHandles();
	Iterator<String> dd = des.iterator();
	
	while(dd.hasNext())
	{
		String dqq = dd.next();
		
	}
	List<WebElement> test = d.findElements(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
	Iterator<WebElement> xs = test.iterator();
String a = "Vivek";
String b = "Vivek";
d.switchTo().frame("1");
	Assert.assertTrue(a.equalsIgnoreCase(b));
	
	File file = new File("path");
	FileInputStream in = new FileInputStream(file);
		
	Workbook book = null;
	
		book = new XSSFWorkbook(in);
		Sheet sd = book.getSheet("vv");
		
		ExtentReports nwr = new ExtentReports("path", true, DisplayOrder.NEWEST_FIRST);
		
		URL url = new URL("String");
		
		HttpsURLConnection deasr	 = (HttpsURLConnection)url.openConnection();
		deasr.setRequestMethod("Head");
		deasr.connect();
		deasr.getResponseCode();
		
		
	}

}
