package Auto.MProj;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CSSClass {
  @Test
  
	  public void addPost() throws IOException {
		WebDriver driver = new FirefoxDriver();
	  	//System.setProperty("webdriver.ie.driver", "C:/IEDriverServer_x64_2.43.0/IEDriverServer.exe");
	  	//WebDriver driver = new InternetExplorerDriver();
		  
		  driver.get("https://selpsl23.wordpress.com/wp-admin/");
		  //driver.findElement(By.cssSelector("input#user_login")).sendKeys("ulkaasati");
		  driver.findElement(By.cssSelector("input#user_login")).sendKeys("ulkaasati");
		  driver.findElement(By.cssSelector("input#user_pass")).sendKeys("passw0rd");
		  driver.findElement(By.id("wp-submit")).click();
		  
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  
		  /* created object called alert. switching it to "alert" pop up window. in next line it is clicking on "no" i.e. dismiss.
		  and switching back again to main webpage */
		  
		  /*Alert alert =driver.switchTo().alert();
		  alert.dismiss();
		  driver.switchTo().defaultContent(); */
		  
		  /*  taking screenshot of the webpage. As we have clicked on submit above, it will capture screenshot of next page i.e. of dashboard and not og login webpage.
		  
		  File screenShot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(screenShot, new File("./screenshot/03.png")); */
	      
		  Actions action = new Actions(driver);
		  
		  //WebElement mouseHoverElement = driver.findElement(By.xpath("//*[text()="Appearance"]"));
		  //WebElement mouseHoverElement = driver.findElement(By.linkText("Appearance"));
		  WebElement mouseHoverElement = driver.findElement(By.linkText("Posts"));
		  mouseHoverElement.click();
		  
		  WebElement title_text = driver.findElement(By.xpath("//*[text()='Add New']"));
		  action.moveToElement(mouseHoverElement)
		  .click(driver.findElement(By.xpath("/*[text()='Add New'")))
		  .sendKeys(title_text, "Post Titile");
		  
		  action.build().perform();
		  
		  //WebElement dropdownId = driver.findElement(By.linkText("Widgets"));	
		  //dropdownId.click();
		  
		  
		  /* drag and drop 
		  WebElement dragElement = driver.findElement(By.xpath("//*[text()='Archives']"));
		  WebElement dropElement = driver.findElement(By.id("sidebar-2"));
		  
		  action.dragAndDrop(dragElement, dropElement).build().perform();
		  action.moveToElement(mouseHoverElement).build().perform();                */
		  
		  driver.findElement(By.xpath("//*[text()= 'Tags']")).click();
		  
				  		
	  
		  driver.findElement(By.cssSelector("a.wp-has-submenu.wp-not-current-submenu.menu-top.menu-icon-settings.menu-top-last div.wp-menu-name")).click();
		  driver.findElement(By.cssSelector("input#blogname")).clear();
		  driver.findElement(By.cssSelector("input#blogname")).sendKeys("Text has been cleared");
		  driver.findElement(By.cssSelector("input#blogdescription")).sendKeys("Tag Line");
		  
		  //WebElement dropdownId = driver.findElement(By.id("start_of_week"));
		  
		 /* Select dropdown = new Select(dropdownId);
		  dropdown.selectByValue("3");
		  //dropdown.selectByVisibleText("Wednesday");
		  //dropdown.selectByIndex(arg0);
		  
		  driver.findElement(By.cssSelector("input#submit")).click(); */
		  
		  
		  
		  driver.quit();
		  
		    }

private Actions click(WebElement findElement) {
	// TODO Auto-generated method stub
	return null;
}
}
