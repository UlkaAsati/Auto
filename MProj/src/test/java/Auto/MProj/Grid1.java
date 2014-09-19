package Auto.MProj;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid1 {
  @Test
  public void f() throws MalformedURLException {
	  
	  DesiredCapabilities dc = new DesiredCapabilities();
	  dc.setBrowserName("firefox");
	  WebDriver driver = new RemoteWebDriver(new URL("http://10.44.204.226:4444/wd/hub"), dc);
		driver.get("https://selpsl23.wordpress.com/wp-admin/");
		
		driver.quit();
	}
  }
