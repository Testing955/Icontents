package IcontentsPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homeownersignup extends BaseClass
{
WebDriver driver;
public Homeownersignup(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="(//span[normalize-space()='Sign Up!'])")
WebElement signup;
@FindBy(xpath="(//div[normalize-space()='Homeowners'])[4]")
WebElement Homeowner;
@FindBy(xpath="(//input[@placeholder='Enter your first name'])")
WebElement firstname;
@FindBy(xpath="(//input[@placeholder='Enter your last name'])")
WebElement lastname;
@FindBy(xpath="(//input[@placeholder='Enter your email address'])")
WebElement email;
@FindBy(xpath="(//input[@placeholder='Enter your mobile number'])")
WebElement mobilenumber;
@FindBy(xpath="(//div[normalize-space()='Continue'])[3]")
WebElement continuebutton;
@FindBy(xpath="(//input[@placeholder='Enter password'])")
WebElement Enterpassword;
@FindBy(xpath="(//div[@class='css-146c3p1 r-lrvibr'])[1]")
WebElement enterpasswordeye;
@FindBy(xpath="(//input[@placeholder='Confirm password'])")
WebElement confirmpassword;
@FindBy(xpath="(//div[@class='css-146c3p1 r-lrvibr'])[3]")
WebElement enterconfirmpasswordeye;
@FindBy(xpath="(//div[@class='css-146c3p1 r-lrvibr'])[4]")
WebElement termsandcondition;
@FindBy(xpath="(//div[normalize-space()='Register'])[4]")
WebElement register;
@FindBy(xpath="(//a[normalize-space()='Log in!'])")
WebElement login;
@FindBy(xpath="(//div[normalize-space()='BACK'])")
WebElement back;
public void signupbutton()
{
signup.click();
}
public void Homeownerfield()
{
Homeowner.click();
}
public void firstnamefield(String first)
{
firstname.sendKeys(first);
}
public void lastnamefield(String last)
{
lastname.sendKeys(last);
}
public void emailfield(String efield)
{
email.sendKeys(efield);
}
public void mobilenumberfield(String mnumber)
{
mobilenumber.sendKeys(mnumber);
}
public void continuebuttons()
{
continuebutton.click();
}
public void Enterpasswordfield(String epwd)
{
Enterpassword.sendKeys(epwd);
}
public void enterpwdeye()
{
enterpasswordeye.click();
}
public void confirmpasswordfield(String cpwd)
{
confirmpassword.sendKeys(cpwd);
}
public void enterconfirmpwdeye()
{
enterconfirmpasswordeye.click();
}
public void tandc()
{
termsandcondition.click();
}
public void registerbutton()
{
register.click();
}
}
