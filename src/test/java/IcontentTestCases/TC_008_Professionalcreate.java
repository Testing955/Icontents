package IcontentTestCases;

import org.testng.annotations.Test;

import IcontentTestBase.BasePage;
import IcontentsPageObject.Professionalcreate;

public class TC_008_Professionalcreate extends BasePage
{
@Test(groups= {"Master","Smoke","regression"})
public void setup_Professioanlcreate() throws InterruptedException
{
Professionalcreate pcreate=new Professionalcreate(driver);
pcreate.Emailfield();
pcreate.Passwordfield();
pcreate.Loginbutton();
pcreate.pf();
pcreate.anf();
pcreate.efield(randomString()+"@yopmail.com");
pcreate.gcf();
Thread.sleep(5000);
pcreate.sif();
}
}
