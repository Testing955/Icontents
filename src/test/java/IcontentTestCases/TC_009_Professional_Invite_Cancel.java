package IcontentTestCases;

import org.testng.annotations.Test;

import IcontentTestBase.BasePage;
import IcontentsPageObject.ProfessionalInviteCancel;

public class TC_009_Professional_Invite_Cancel extends BasePage
{
@Test(groups= {"master","smoke"})
public void setup_Professional_Invite_Cancel() throws InterruptedException
{
ProfessionalInviteCancel pic = new ProfessionalInviteCancel(driver);
pic.Emailfield();
pic.Passwordfield();
pic.Loginbutton();
pic.pf();
Thread.sleep(10000);
pic.cancel();
}
}
