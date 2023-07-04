package Runner_Script;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Generic_Script.Base_Test;
import POM_Script.Login_to_HMS;

public class HMS extends Base_Test
{
	@Test(dataProvider ="testdata" )
	public void valid_login(String email,String pwd) throws InterruptedException
	{
		Login_to_HMS l=new Login_to_HMS(driver);
		l.passun(email);
		l.passpwd(pwd);
		Thread.sleep(2000);
		l.btn();
		Assert.fail();
	}
	@DataProvider(name="testdata")
	public Object[][] createData1()
	{
	 return new Object[][]
	{
		 {"dr.bro@gmail.com","dr.bro@1234"},
		 {"nimmi@gmail.com","nimmi@123"},
	};
	}				
}
