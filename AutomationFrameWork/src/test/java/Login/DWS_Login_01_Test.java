package Login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlibrery.BaseClass;
import genericlibrery.ExcelUtility;
import genericlibrery.ITestcontext;
import objectRepositary.LoginPage;
@Listeners(ITestcontext.class)
public class DWS_Login_01_Test extends BaseClass {
	@Test(dataProvider = "data",dataProviderClass = ExcelUtility.class)
	public void login_to_application(String email,String password) {
		login.getLoginlink().click();
		logger.log(Status.INFO,"user click on login link");
		login.getEmailTF().sendKeys("kiran24@gmail.com");
		logger.log(Status.INFO,"user entered email address");
		login.getPasswordTF().sendKeys("1234");
		logger.log(Status.INFO,"user enterd password");
		login.getLoginButton().click();
	}

}
