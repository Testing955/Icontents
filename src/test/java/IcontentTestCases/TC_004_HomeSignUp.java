package IcontentTestCases;

import org.testng.annotations.Test;

import IcontentTestBase.BasePage;
import IcontentsPageObject.Homeownersignup;

public class TC_004_HomeSignUp extends BasePage
{
@Test(groups= {"master","regression","smoke"})
public void setup_signuphome() throws InterruptedException
{
Homeownersignup hs = new Homeownersignup(driver);
Thread.sleep(5000);
hs.signupbutton();
hs.Homeownerfield();
hs.firstnamefield(randomString().toLowerCase());
hs.lastnamefield(randomString().toLowerCase());
hs.emailfield(randomString().toLowerCase()+"@yopmail.com");
hs.mobilenumberfield(randomNumeric());
hs.continuebuttons();
Thread.sleep(5000);
String password = randomAlphaNumeric();
Thread.sleep(10000);
hs.Enterpasswordfield(password);
//hs.enterpwdeye();
hs.confirmpasswordfield(password);
//hs.enterconfirmpwdeye();
hs.tandc();
hs.registerbutton();
}
}
