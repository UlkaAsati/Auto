package Auto.MProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MavenClass {
  @Test
  public void firstRun() {
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.get("https://selpsl23.wordpress.com/wp-admin/");
	  driver.findElement(By.id("user_login")).sendKeys("ulkaasati");
	  driver.findElement(By.id("user_pass")).sendKeys("passw0rd");
	  driver.findElement(By.id("wp-submit")).click();
	  
  }
}
