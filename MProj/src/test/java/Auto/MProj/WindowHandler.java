package Auto.MProj;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandler {

	public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();
		
		driver.get("https://wordpress.com/sites");
		  driver.findElement(By.cssSelector("input#user_login")).sendKeys("ulkaasati");
		  driver.findElement(By.cssSelector("input#user_pass")).sendKeys("passw0rd");
		  driver.findElement(By.id("wp-submit")).click();
		  
		  Set<String> handles = driver.getWindowHandles();
		  
		  for(String s:handles){
			  System.out.println(s);
		  }
		  
		  

	}

}
