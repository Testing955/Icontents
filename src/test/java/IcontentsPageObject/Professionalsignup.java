package IcontentsPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Professionalsignup extends BaseClass
{
WebDriver driver;
public Professionalsignup(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//span[normalize-space()='Sign Up!']")
WebElement signup;
@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div/div/div[2]/div/div[3]/div/div[1]/div[2]/div")
WebElement professional;
@FindBy(xpath="//input[@placeholder='Enter your first name']")
WebElement firstname;
@FindBy(xpath="//input[@placeholder='Enter your last name']")
WebElement lastname;
@FindBy(xpath="//input[@placeholder='Enter your email address']")
WebElement email;
@FindBy(xpath="//input[@placeholder='Enter your mobile number']")
WebElement mobile;
@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div/div/div[2]/div/div/div[6]/div/div")
WebElement cont;
public void signupbutton()
{
signup.click();
}
public void professionaloption()
{
professional.click();
}
public void fname(String first)
{
firstname.sendKeys(first);
}
public void lname(String last)
{
lastname.sendKeys(last);
}
public void efield(String emailf)
{
email.sendKeys(emailf);
}
public void mobilenumber(String mnumber)
{
mobile.sendKeys(mnumber);
}
public void contfield()
{
cont.click();
}
}
