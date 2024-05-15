package IcontentsPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Insurred_Creation extends Login
{
WebDriver driver;
public Insurred_Creation(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//span[normalize-space()=\"Insured\"]")
WebElement insured;
@FindBy(xpath="//div[normalize-space()=\"Add New Insured\"]")
WebElement createinsured;
@FindBy(xpath="//input[@placeholder=\"Enter your first name\"]")
WebElement firstname;
@FindBy(xpath="(//input[@placeholder=\"Enter your last name\"])")
WebElement lastname;
@FindBy(xpath="//input[@placeholder=\"Enter your email address\"]")
WebElement emailaddress;
@FindBy(xpath="//input[@placeholder=\"+1 (555) 000-0000\"]")
WebElement mobilenumber;
@FindBy(xpath="(//div[normalize-space()=\"Add Insured\"])[3]")
WebElement addinsured;
public void insuredfield()
{
insured.click();
}
public void createinsuredfield()
{
createinsured.click();
}
public void firstnamefield(String fname)
{
firstname.sendKeys(fname);
}
public void lastnamefield(String lname)
{
lastname.sendKeys(lname);
}
public void emailaddressfield(String efield)
{
emailaddress.sendKeys(efield);
}
public void mobilenumberfield(String mnfield)
{
mobilenumber.sendKeys(mnfield);
}
public void addinsuredfield()
{
addinsured.click();
}
}
