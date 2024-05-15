package IcontentsPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Professionalcreate extends Professionalsignup
{
WebDriver driver;
public Professionalcreate(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//span[normalize-space()='Professional']")
WebElement professionalfield;
@FindBy(xpath="//div[normalize-space()='Add New Professional']")
WebElement addnewfield;
@FindBy(xpath="//input[@placeholder='Enter email address']")
WebElement emailfield;
@FindBy(xpath="(//div[normalize-space()='Generate code'])[2]")
WebElement generatecodefield;
@FindBy(xpath="(//div[normalize-space()='Send Invitation'])[3]")
WebElement sendinvitationfield;
public void pf()
{
professionalfield.click();
}
public void anf()
{
addnewfield.click();
}
public void efield(String email)
{
emailfield.sendKeys(email);
}
public void gcf()
{
generatecodefield.click();
}
public void sif()
{
sendinvitationfield.click();
}
}
