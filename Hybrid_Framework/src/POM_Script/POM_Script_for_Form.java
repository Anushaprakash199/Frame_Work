package POM_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class POM_Script_for_Form 
{
  @FindBy(id="firstName")
  private WebElement FNfiled;
  @FindBy(id="lastName")
  private WebElement LNfiled;
  @FindBy(id="userEmail")
  private WebElement Emailfiled;
  @FindBy(xpath="//label[text()='Female']")
  private WebElement genderbtn;
  @FindBy(id="userNumber")
  private WebElement Numfield;
  @FindBy(id="dateOfBirthInput")
  private WebElement DOBfield;
  @FindBy(xpath="//input[@id='subjectsInput']")
  private WebElement Subfield;
  @FindBy(xpath="//label[text()='Music']")
  private WebElement checkbox;
  @FindBy(id="uploadPicture")
  private WebElement uppicbtn;
  @FindBy(id="currentAddress")
  private WebElement adressfield;
  @FindBy(xpath="//div[@id='state']")
  private WebElement statedd;
  @FindBy(xpath="//[@id='city']")
  private WebElement citydd;
  @FindBy(xpath="//button[@id='Submit']")
  private WebElement Submitbtn;
  
  
  public POM_Script_for_Form(WebDriver driver)
  {
	 PageFactory.initElements(driver, this);
  }
  public void FNname(String FN)
  {
	  FNfiled.sendKeys(FN);
  }
  public void LNname(String LN)
  {
	  LNfiled.sendKeys(LN);
  }
  public void Email(String email)
  {
	  Emailfiled.sendKeys(email);
  }
  public void Gbtn()
  {
	  genderbtn.click();
  }
  public void NoField(String no)
  {
	  Numfield.sendKeys(no);
  }
  public void DOBfield()
  {
	  DOBfield.click();
  }
  public void Subfield(String sub)
  {
	  Subfield.sendKeys(sub);
  }
  public void checkbox()
  {
	  checkbox.click();
  }
  public void uppicbtn(String path)
  {
	  uppicbtn.sendKeys(path);
  }
  public void adressfield(String add)
  {
	  adressfield.sendKeys(add);
  }
  public void statedd()
  {
	  statedd.click();
  }
  public void citydd()
  {
	  citydd.click();
  }
  public void Submitbtn()
  {
	  Submitbtn.click();
  }
  
}
