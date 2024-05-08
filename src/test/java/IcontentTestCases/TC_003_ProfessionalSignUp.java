package IcontentTestCases;

import org.testng.annotations.Test;

import IcontentTestBase.BasePage;
import IcontentsPageObject.Professionalsignup;

public class TC_003_ProfessionalSignUp extends BasePage
{
@Test(groups={"sanity","regression","master"})
public void ProfessionalSignUp()
{
logger.info("Starting of the test cases");
try
{
Professionalsignup ps = new Professionalsignup (driver);
Thread.sleep(10000);
ps.signupbutton();
Thread.sleep(10000);
ps.professionaloption();
Thread.sleep(5000);
ps.fname(randomString().toLowerCase());
ps.lname(randomString().toLowerCase());
ps.efield(randomString().toLowerCase()+"@yopmail.com");
ps.mobilenumber(randomNumeric());
ps.contfield();
}
catch(Exception e)
{
logger.info("test failed");
}
}
}
