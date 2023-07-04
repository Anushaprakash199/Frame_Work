   package Runner_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution 
{
	public WebDriver driver;
	@Test
	@Parameters("browser")
	public void exec(String browser)
	{
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	  System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	  if(browser.equals("firefox"))
	  {
		  driver=new FirefoxDriver();
		  driver.get("http://106.51.87.42:9007/");
		  driver.findElement(By.id("email")).sendKeys("dr.bro@gmail.com");
		  driver.findElement(By.id("password")).sendKeys("dr.bro@1234");
		  driver.findElement(By.xpath("//button[@type='text']"));
		  WebElement ele = driver.findElement(By.xpath("//span[tex()='Dashboard']"));
		  boolean b = ele.isDisplayed();
		  if(b)
		  {
			System.out.println("Home page is Displayed");  
		  }
	  }
	  else
	  {
		  driver=new ChromeDriver();
		  driver.get("http://106.51.87.42:9007/");
		  driver.findElement(By.id("email")).sendKeys("dr.bro@gmail.com");
		  driver.findElement(By.id("password")).sendKeys("dr.bro@1234");
		  driver.findElement(By.xpath("//button[@type='text']"));
		  WebElement ele = driver.findElement(By.xpath("//span[tex()='Dashboard']"));
		  boolean b = ele.isDisplayed();
		  if(b)
		  {
			System.out.println("Home page is Displayed");  
		  }
	  }
	  
	}
	

}
