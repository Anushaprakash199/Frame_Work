package Runner_Script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic_Script.Base_Test_form;
import POM_Script.POM_Script_for_Form;

public class Form_Runner_Script extends Base_Test_form
{
	@Test
	public void register() throws InterruptedException
	{
		
		POM_Script_for_Form p=new POM_Script_for_Form(driver);
		p.FNname("Anusha");
		Thread.sleep(1000);
		p.LNname("P");
		Thread.sleep(1000);
	    p.Email("anusha@gmail.com");
	    Thread.sleep(1000); 
	    p.Gbtn();
	    Thread.sleep(1000);
	    p.NoField("8529637485");
	    Thread.sleep(1000);
	    WebElement s = driver.findElement(By.xpath("//div[@id='city']"));
	    Point loc = s.getLocation();
	    int x = loc.getX();
	    int y = loc.getY();
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy("+x+","+y+")");
	    p.DOBfield();
	    driver.findElement(By.xpath("//div[text()='21']")).click();
	    Thread.sleep(2000);
	    p.Subfield("English");
	    Thread.sleep(2000);
	    p.uppicbtn("C:\\Users\\admin\\Pictures\\Saved Pictures\\Anusha.jpg");
	    Thread.sleep(2000);
	    p.adressfield("95, ground floor, 20th main, Chord Rd, next to city hospital, 2nd Block, Rajajinagar, Bengaluru, Karnataka 560010");
		List<WebElement> allopt = driver.findElements(By.xpath("//div[@id='state']"));
		int count = allopt.size();
		for(int i=0;i<count;i++)
		{
		  if(allopt.get(i).equals("NCR"))
		{
		 allopt.get(i).click();
		}
		List<WebElement> allopt1 = driver.findElements(By.xpath("//div[@id='city']"));
		int count1 = allopt.size();
		for(int j=0;j<count1;j++)
		 {
		  if(allopt1.get(j).equals("Delhi"))
			{
			 allopt1.get(j).click();
			}
		 }
		p.Submitbtn();
		}   		
	}

}
