package POM_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import Generic_Script.Base_Page;

public class Login_to_HMS extends Base_Page
{
	@FindBy(id="email")
	private WebElement unfield;
	@FindBy(id="password")
	private WebElement pwdfield;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginbtn;
	
	public Login_to_HMS(WebDriver driver)
	{
	  super(driver);
	}
	
	public void passun(String un)
	{
		unfield.sendKeys(un);
	}
	public void passpwd(String pwd)
	{
		pwdfield.sendKeys(pwd);
	}
	public void btn()
	{
		loginbtn.click();
	}	

}
