package Sample;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SeleniumRefresh {
	
	@Test
	public void run() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver////chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        /*List<WebElement>   sw   = d.findElements(By.tagName("a"));
	        
	        for(WebElement dq : sw){
	        	dq.click();
	        	
	        }*/
		
	String parent	 = d.getWindowHandle();
	   Set<String> wq	 = d.getWindowHandles();
		Iterator<String> wd = wq.iterator() ;
		String dx[] = new String[wq.size()];
		int x =0;
		while(wd.hasNext()){
		 dx[x]	 = wd.next();
		
		x++;
			}
		
		
		
		
		
		
		
		
		
		Actions act = new Actions(d);
		WebElement source = d.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		WebElement locator = d.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		act.moveToElement(locator).build().perform();
		act.contextClick().build().perform();
		
		
		
		Wait wa = new WebDriverWait(d,40);
		wa.until(ExpectedConditions.alertIsPresent());
		
		
		act.dragAndDrop(source, locator).clickAndHold().build().perform();
		
	List<WebElement> dee	 = d.findElements(By.id("test"));
	      Iterator< WebElement> or=  dee.iterator();
	      d.getWindowHandle() ;
	      
	   Set<String> dsw    = d.getWindowHandles();
	 Iterator<String> fr   = dsw.iterator();
	while( fr.hasNext())
	{
	String cf =	fr.next() ;
	d.switchTo().window(cf);
	}
	
	
	
	  List<WebElement> qw    = d.findElements(By.tagName("a"));
	
	
		String url = qw.get(0).getAttribute("href");
		
		URL dd = new URL(url);
		HttpURLConnection con = (HttpURLConnection)dd.openConnection();
		con.setRequestMethod("Head");
		con.connect();
		con.getResponseCode();
		
		File file = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("vivek.jpg"));
		
		
		File fi = new File("path");
		
		FileReader re = new FileReader(fi);
		
		BufferedReader be = new BufferedReader(re);
		while(be.readLine() != null)

		{
			be.readLine();
		}
	Class.forName("jdbc driver");
	Connection cons = DriverManager.getConnection("d", "f", " d");
	Statement sed = 	cons.createStatement() ;
ResultSet des	 = sed.executeQuery("cc");
 while(des.next())
 {
	 des.getString(1);
 }
 
 Proxy dp = new Proxy();
 
		((JavascriptExecutor)d).executeScript("document.getElementByClass('Test'),value = Test");
		d.findElement(By.xpath("//*[contains(text(), 'vivek')]"));
		d.findElement(By.xpath("//*[start-with(text(), 'vivek')]"));
		d.findElement(By.xpath("//*[start-with(text(), 'vivek')]//following::intput"));
		d.findElement(By.xpath("//*[start-with(text(), 'vivek')]//following-sibling::intput"));
		
		
		WebDriverWait wait  = new WebDriverWait(d,20);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		
		
		Wait<WebDriver> waww = new FluentWait<WebDriver>(d).withTimeout(20,TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS).ignoring(NoSuchWindowException.class);
		
		waww.until(new Function<WebDriver, WebElement>(){
			
			public WebElement apply(WebDriver driver)
			{
				return driver.findElement(By.id("ww"));
			}
		});
		
		
		
		
		
		
		
		
		
		
		
	}

}
