package IcontentTestCases;

import org.testng.annotations.Test;

import IcontentTestBase.BasePage;
import IcontentsPageObject.Professionalsignupwithcode;

public class TC_005_Professionalsignupwithcode extends BasePage
{
	@Test(groups={"sanity","regression","master"})
	public void Professionalsignupwithcode()
	{
	logger.info("Starting of the test cases");
	try
	{
	Professionalsignupwithcode psc = new Professionalsignupwithcode (driver);
	Thread.sleep(10000);
	psc.signupbutton();
	Thread.sleep(10000);
	psc.professionaloption();
	Thread.sleep(5000);
	psc.fname(randomString().toLowerCase());
	psc.lname(randomString().toLowerCase());
	//ps.efield(randomString().toLowerCase()+"@yopmail.com");
	psc.emfield();
	psc.mobilenumber(randomNumeric());
	psc.contfield();
	psc.companynamefield(randomString());
	psc.codefield();
	String password = randomAlphaNumeric();
	Thread.sleep(1000);
	psc.enterpwd(password);
	psc.confirmpwd(password);
	Thread.sleep(10000);
	psc.termsandcondition();
	psc.registerfield();
	}
	catch(Exception e)
	{
	logger.info("test failed");
	}
	}
	}
