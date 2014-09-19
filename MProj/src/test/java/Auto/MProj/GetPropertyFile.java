package Auto.MProj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.internal.ExtraOutput;

public class GetPropertyFile {
  @Test
  public void f() throws FileNotFoundException, IOException {
	  
	  Properties prop = new Properties();
	  prop.load(new FileInputStream(new File("./src/test/ObjectRepository.properties"))); 
	  
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.get("https://selpsl23.wordpress.com/wp-admin/");
	  String userLogin = prop.getProperty("userLogin_txt.css");
	  driver.findElement(By.cssSelector(userLogin)).sendKeys("ulkaasati");
	  String userPass = prop.getProperty("userPass_txt.css");
	  driver.findElement(By.cssSelector(userPass)).sendKeys("passw0rd");
	  
	  /*public String getElementLocator(String elementType){
		  int i = element.Type.substring(i+1);
		extractPath = elementType.substring(i+1); */
		

  }
}
