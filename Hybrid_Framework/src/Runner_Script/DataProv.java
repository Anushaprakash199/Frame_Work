package Runner_Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProv 
{
	@Test(dataProvider ="testdata" )
	public void validTest(String un,String pwd)
	{
		 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/login");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.id("email")).sendKeys(un);
		 driver.findElement(By.id("pass")).sendKeys(pwd);
		 driver.findElement(By.name("login")).click();	  
		 driver.close();
	}
	@DataProvider(name="testdata")
	public Object[][] createData1()
	{
	 return new Object[][]
	{
		 {"anu","admin"},
		 {"usha","manager"},
	};
	}
}
