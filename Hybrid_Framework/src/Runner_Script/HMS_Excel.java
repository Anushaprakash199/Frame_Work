package Runner_Script;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import Generic_Script.Base_Test;
import Generic_Script.DDT_Excel;
import Generic_Script.Extent_Report_Generic;
import Generic_Script.Screenshot;
import POM_Script.Login_to_HMS;

public class HMS_Excel extends Base_Test 
{
	@Test
	public void valid_login() throws InterruptedException, IOException
	{
		Login_to_HMS l=new Login_to_HMS(driver);
		String un = DDT_Excel.getData("Sheet1", 1, 0);
		l.passun(un);
		String pwd1=DDT_Excel.getData("Sheet1", 1, 1);
		l.passpwd(pwd1);
		Thread.sleep(2000);
		l.btn();
		Thread.sleep(5000);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Doctor Dashboard - e-health management system");
		Screenshot.getphoto(driver);
	    Extent_Report_Generic.report();		
	}
	@Test
	public void valid_login2() throws InterruptedException, IOException 
	{
		Login_to_HMS l=new Login_to_HMS(driver);
		String un = DDT_Excel.getData("Sheet1", 2, 0);
		l.passun(un);
		String pwd1=DDT_Excel.getData("Sheet1", 2, 1);
		l.passpwd(pwd1);
		Thread.sleep(2000);
		l.btn();
		Thread.sleep(5000);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Patient Dashboard - e-health management system");
		Screenshot.getphoto(driver);
	    Extent_Report_Generic.report();		
	}	
}
