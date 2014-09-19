package Auto.MProj;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.xalan.xsltc.DOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.Dashboard;
import PageObject.Login;

public class DesiredCap{
	
	@Test
		public void f () {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		WebDriver driver = new RemoteWebDriver(new URL(""), dc);
		driver.get("https://selpsl23.wordpress.com/wp-admin/");
		
		driver.quit();
	}
	
	
	
}

public class NewTest {
	
	private static Logger Log = Logger.getLogger(Compare.class);
		
	
	
	  WebDriver driver;
	  Dashboard d;
	  Login l;
	  
	 @BeforeTest
	 public void setUp() {
		 
	 DOMConfigurator.configure("log4j.xml");
	 //driver = new FirefoxDriver();
	 //driver.get("https://selpsl23.wordpress.com/wp-admin/");
	 
	 Log.info("Webdriver has been initaiated");
	 
	 }
	 
  @Test
  public void f() {
	  //l = new Login(driver);
	  l = PageFactory.initElements(driver, Login.class);
	  d = l.login("ulkaasati", "passw0rd");
	  
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  d.addNewPost();
	 
  }
  
  @AfterTest
  public void teardown(){
	  driver.quit();
  }
}
