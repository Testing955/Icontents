package IcontentTestCases;

import org.testng.annotations.Test;

import IcontentTestBase.BasePage;
import IcontentsPageObject.Professional_Projectcreate;

public class TC_006_Professional_ProjectCreate extends BasePage
{
@Test(groups= {"master","smoke"})
public void setup_Professional_ProjectCreate() throws InterruptedException
{
Professional_Projectcreate ppc = new Professional_Projectcreate(driver);
ppc.Emailfield();
ppc.Passwordfield();
ppc.Loginbutton();
Thread.sleep(10000);
ppc.projectfield();
ppc.Selectinsuredfield();
Thread.sleep(5000);
ppc.Selectinsuredoption();
ppc.claimnumberfield(randomNumeric());
ppc.lossoption();
Thread.sleep(5000);
ppc.losstypeoptions();
ppc.insurancecompanyfield(randomString());
ppc.addprojectoptions();
}
}
