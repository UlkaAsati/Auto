package Auto.MProj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class Mclass2 {
  public void addPost() {
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.get("https://selpsl23.wordpress.com/wp-admin/");
	  driver.findElement(By.id("user_login")).sendKeys("ulkaasati");
	  driver.findElement(By.id("user_pass")).sendKeys("passw0rd");
	  driver.findElement(By.id("wp-submit")).click();
	  
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.xpath("//*[text()='Posts']")).click();
	  //driver.findElement(By.xpath("//a[@href='/wp-admin/post-new.php']"));
	  //driver.findElement(By.className("wp-menu-name")).click();
	  driver.findElement(By.xpath("//*[text()='Add New']")).click();
	  //driver.findElement(By.xpath("//a[@href='edit.php']")).click();
	  driver.findElement(By.id("title")).sendKeys("TestMsg");
	  //driver.findElement(By.xpath("//*[text()='Aside']")).click();
	  
	  driver.switchTo().frame("content_ifr");
	  driver.findElement(By.id("tinymce")).sendKeys("Hello!");
	  driver.switchTo().defaultContent();
	  driver.findElement(By.id("Publish")).click();
	  driver.quit();
	    
  }
}
