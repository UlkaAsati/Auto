package PageObject;

import org.apache.maven.model.Build;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Dashboard {
	
	WebDriver driver;
	public Dashboard(WebDriver driver){
		this.driver=driver;
		
	}
	
	public void addNewPost(){
						
		driver.findElement(By.id("title")).sendKeys("Content");
		driver.findElement(By.id("save-post")).click();
		  

	}

}
