package IcontentsPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgetPassword extends BaseClass
{
WebDriver driver;
public ForgetPassword(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//span[normalize-space()='Forgot password']")
WebElement fpbutton;
@FindBy(xpath="//input[@placeholder='Enter your email']")
WebElement email;
@FindBy(xpath="(//div[normalize-space()='Verify Email'])[3]")
WebElement verifyemail;
@FindBy(xpath="(//span[normalize-space()='BACK'])")
WebElement back;
@FindBy(xpath="(//div[normalize-space()='Verify OTP'])[3]")
WebElement verifyotp;
@FindBy(xpath="(//div[normalize-space()='Click to resend'])[2]")
WebElement resendotp;
public void fpwd()
{
fpbutton.click();
}
public void emailfield()
{
email.sendKeys("sfjwb@yopmail.com");
}
public void verify()
{
verifyemail.click();
}
public void backbutton()
{
back.click();
}
public void verifyo()
{
verifyotp.click();
}
public void resend()
{
resendotp.click();
}
}