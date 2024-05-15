package IcontentsPageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfessionalInviteCancel extends Professionalcreate
{
WebDriver driver;
public ProfessionalInviteCancel(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="(//div[normalize-space()='Cancel Invite'])[2]")
WebElement cancelfunction;
public void cancel()
{
cancelfunction.click();
//WebDriverWait wait = new WebDriverWait(driver, 10);   (explicit wait)
// Alert alert = wait.until(ExpectedConditions.alertIsPresent()); 
Alert alert = driver.switchTo().alert();
alert.accept();
}
}



