package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
	
	@FindBy(id="user_login")
	@CacheLookup
	WebElement user;
	
	@FindBy(id="user_pass")
	WebElement userPass;
	
	@FindBy(id="wp-submit")
	WebElement submit;
	
	public Login(WebDriver driver){
		this.driver = driver;
	}

	public Dashboard login(String userID, String usePass){
		/* user = driver.findElement(By.id("user_login"));
		userPass = driver.findElement(By.id("user_pass"));
		submit = driver.findElement(By.id("wp-submit")); */
		
		user.sendKeys(userID);
		userPass.sendKeys(usePass);
		submit.click();
		
		return PageFactory.initElements(driver, Dashboard.class);
		//return new Dashboard(driver);
		
		
	}
}
