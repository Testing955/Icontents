package IcontentTestCases;

import org.testng.annotations.Test;

import IcontentTestBase.BasePage;
import IcontentsPageObject.Login;

public class TC_001_Login extends BasePage
{
@Test(groups= {"sanity","master","regression"})
public void verify_login()
{
logger.info("Starting of the testcases....");
try
{
Login lf = new Login(driver);
lf.Emailfield();
lf.Passwordfield();
lf.Loginbutton();
}
catch(Exception e)
{
logger.error("test failled....");
}
}
}
