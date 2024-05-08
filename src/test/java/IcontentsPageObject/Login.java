package IcontentsPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BaseClass
{
WebDriver driver;
public Login(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//input[@placeholder=\"Enter your email\"]")
WebElement Email;
@FindBy(xpath="//input[@placeholder=\"Enter your password\"]")
WebElement Password;
@FindBy(xpath="(//div[normalize-space()='Login'])[3]")
WebElement Login;
public void Emailfield()
{
Email.sendKeys("ratant@yopmail.com");
}
public void Passwordfield()
{
Password.sendKeys("Qwerty@1");
}
public void Loginbutton()
{
Login.click();
}
}
