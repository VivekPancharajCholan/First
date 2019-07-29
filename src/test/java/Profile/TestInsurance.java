package Profile;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestInsurance {

	@Test
	public static void test() throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://wallethub.com/profile/test-insurance-company-13732055i");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		((JavascriptExecutor)d).executeScript("scroll(0,400)");
	    d.findElement(By.xpath("//div[@class='review-action ng-enter-element']//review-star//div")).click();
		Thread.sleep(5000);
        WebElement dropdown = d.findElement(By.xpath("//div[@class='dropdown second']//span"));
		dropdown.click();
		d.findElement(By.xpath("//div[@class='dropdown second']//span//following::ul//li[2]")).click();
		String review = "You can check the profile page of each professional or company to determine whether they are a paying advertiser. Regardless of advertiser status, none of the listings, reviews, or other information on Wallet Hub constitutes, in any way, a referral or endorsement by us of the respective financial company or professional, or vice versa.";
		d.findElement(By.xpath("//div[@class='android']//textarea")).sendKeys(review);
	    d.findElement(By.xpath("//div[@class='sbn-action semi-bold-font btn fixed-w-c tall']")).click();
	    WebElement login = d.findElement(By.xpath("//nav[@class='ng-animate-enabled basic-trans enter join']//ul//li[2]"));
	    login.click();
	    d.findElement(By.xpath("//input[@name='em']")).sendKeys("vivekraj.pr@gmail.com");
	    d.findElement(By.xpath("//input[@name='pw1']")).sendKeys("Vivek@123");
	    d.findElement(By.xpath("//button[@type='button']")).click();;
	    Actions act = new Actions(d);
	     WebElement userName = d.findElement(By.xpath("//div[@class='brgm-button brgm-user brgm-list-box']//span[@class='brgm-list-title']"));
	    act.moveToElement(userName).click().build().perform();
	 WebElement pro = d.findElement(By.xpath("//div[@class='brgm-list brgm-user-list']//a[1]"));
	 act.moveToElement(pro).click().build().perform();
	  WebDriverWait wait = new WebDriverWait(d,40);
	 WebElement profile  = d.findElement(By.xpath("//div[@class='profilenav']//ul//li[3]"));
	 wait.until(ExpectedConditions.elementToBeClickable(profile));
	 profile.click();
	 d.navigate().refresh();
     d.findElement(By.xpath("//div[@class='profilenav']//ul//li[2]")).click();
     d.findElement(By.xpath("//div[@class='profilenav']//ul//li[3]")).click();
     String text = d.findElement(By.xpath("//div[starts-with(@id,'review')]//p")).getText();
     Assert.assertTrue(review.equalsIgnoreCase(text), "Verified");
     System.out.println("Verified");
     }

}
