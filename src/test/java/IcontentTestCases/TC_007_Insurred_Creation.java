package IcontentTestCases;

import org.testng.annotations.Test;

import IcontentTestBase.BasePage;
import IcontentsPageObject.Insurred_Creation;

public class TC_007_Insurred_Creation extends BasePage
{
@Test(groups= {"master","smoke","regression"})
public void setup_Insurred_Creation() throws InterruptedException
{
Insurred_Creation ic = new Insurred_Creation(driver);
ic.Emailfield();
ic.Passwordfield();
ic.Loginbutton();
Thread.sleep(5000);
ic.insuredfield();
ic.createinsuredfield();
ic.firstnamefield(randomString());
ic.lastnamefield(randomString());
ic.emailaddressfield(randomString()+"@yopmail.com");
ic.mobilenumberfield(randomNumeric());
ic.addinsuredfield();
}
}

