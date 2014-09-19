package Auto.MProj;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.thoughtworks.selenium.SeleneseTestBase;

public class Compare extends SeleneseTestBase {

	private static Logger Log = Logger.getLogger(Compare.class);
	
	public static void main(String[] args) {
		
		DOMConfigurator.configure("log4j.xml");
		
		WebDriver driver = new FirefoxDriver();
	
		Log.info("Webdriver has been initaiated");
		
			driver.get("https://selpsl23.wordpress.com/wp-admin/");
			
			String logEvent = "URL loading";
			Log.info("URL is loaded successfully" + logEvent);
			Log.debug("Debug logs");
			
		driver.findElement(By.cssSelector("input#user_login")).sendKeys("ulkaasati");
		  driver.findElement(By.cssSelector("input#user_pass")).sendKeys("passw0rd");
		  driver.findElement(By.id("wp-submit")).click();
		  
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  
		  Actions action = new Actions(driver);
		  WebElement mouseHoverElement = driver.findElement(By.linkText("Posts"));
		  mouseHoverElement.click();
		  
		  WebElement title_text = driver.findElement(By.xpath("//*[text()='Add New']"));
		  action.moveToElement(mouseHoverElement)
		  .click(driver.findElement(By.xpath("/*[text()='Add New'")))
		  .sendKeys(title_text, "Post Title");
		  
		  action.build().perform();
		  
		  String Expected="Post Title";
			String Actual = driver.findElement(By.id("")).getText();
			assertEquals(Expected,Actual);

	}

}
