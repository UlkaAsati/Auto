package Auto.MProj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://selpsl23.wordpress.com/wp-admin/");
		  driver.findElement(By.cssSelector("input#user_login")).sendKeys("ulkaasati");
		  driver.findElement(By.cssSelector("input#user_pass")).sendKeys("passw0rd");
		  driver.findElement(By.id("wp-submit")).click();
		  
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  
		driver.findElement(By.id("title")).sendKeys("Content");
		driver.findElement(By.id("save-post")).click();
		  
	/*WebDriverWait wait = new WebDriverWait(driver, 30);
	WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("")));
	System.out.println(element.getText()); */
	driver.quit();

	}

}
