package Login;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlibrery.BaseClass;
import genericlibrery.ITestcontext;
@Listeners(ITestcontext.class)
public class DWS_RegisterPage_01_Test extends BaseClass {
	@Test(groups = "FT")
	public void Register_to_application() {
		register.getregsiterlink().click();
		logger.log(Status.INFO,"user can click login link");
		
		register.getMalegender().click();
		logger.log(Status.INFO,"user can click gender");
		
		register.getFirstname().sendKeys("kiran");
		logger.log(Status.INFO,"user can enter first name");
		
		register.getLastname().sendKeys("kohli");
		logger.log(Status.INFO,"user can enter first name");
		
		register.getEmail().sendKeys("kohli24@gmail.com");
		logger.log(Status.INFO, "user can enter last name");
		
		register.getPassword().sendKeys("kiran@123");
		logger.log(Status.INFO, "user can enter the password");
     	assertFalse(true);
		register.getConfirmpassword().sendKeys("kiran@123");
		logger.log(Status.INFO, "user can enter the confirm password");
	}
	

}
