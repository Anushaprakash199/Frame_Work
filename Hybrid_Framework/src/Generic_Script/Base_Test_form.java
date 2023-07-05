package Generic_Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test_form implements Framework_constant 
{
	public WebDriver driver;
	  @BeforeMethod
	  public void openAppln()
	  {
	    System.setProperty(gecko_key, gecko_value);
	    driver=new FirefoxDriver();
	    //to launch the browser
	    driver.get(base_url1);
	    //to enter the URL
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
	  @AfterMethod
	  public void closeAppln()
	  {
		driver.close();
	  }
}
