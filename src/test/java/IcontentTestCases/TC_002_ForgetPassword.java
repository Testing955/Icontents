package IcontentTestCases;

import org.testng.annotations.Test;

import IcontentTestBase.BasePage;
import IcontentsPageObject.ForgetPassword;

public class TC_002_ForgetPassword extends BasePage
{
@Test(groups= {"master","regression"})
public void setup_forgetpassword() throws InterruptedException
{
ForgetPassword fp = new ForgetPassword(driver);
fp.fpwd();
fp.emailfield();
fp.verify();
/*fp.backbutton();
Thread.sleep(60000);
fp.verifyo();
fp.resend();*/
}
}

