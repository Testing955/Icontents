package IcontentsPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Professional_Projectcreate extends Login
{
WebDriver driver;
public Professional_Projectcreate(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//div[normalize-space()='Project']")
WebElement projects;
@FindBy(xpath="//option[normalize-space()='Select Insured']")
WebElement Selectinsured;
@FindBy(xpath="//option[normalize-space()='Guru Jiiii']")
WebElement Selectoptions;
@FindBy(xpath="//input[@placeholder='Claim number']")
WebElement claimnumber;
@FindBy(xpath="//option[normalize-space()='Type of loss']")
WebElement losstype;
@FindBy(xpath="//option[normalize-space()='Flood']")
WebElement losstypeoption;
@FindBy(xpath="//input[@placeholder='Type Insurance provider']")
WebElement insurancecompany;
@FindBy(xpath="(//div[normalize-space()='Add Project'])[3]")
WebElement addproject;
public void projectfield()
{
projects.click();
}
public void Selectinsuredfield()
{
Selectinsured.click();
}
public void Selectinsuredoption()
{
Selectoptions.click();
}
public void claimnumberfield(String number)
{
claimnumber.sendKeys(number);
}
public void lossoption()
{
losstype.click();
}
public void losstypeoptions()
{
losstypeoption.click();
}
public void insurancecompanyfield(String companyname)
{
insurancecompany.sendKeys(companyname);
}
public void addprojectoptions()
{
addproject.click();
}
}
