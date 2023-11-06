package Login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlibrery.BaseClass;
import genericlibrery.ITestcontext;
@Listeners(ITestcontext.class)
public class Dws_AddToCart_01_Test extends BaseClass {
	@Test
	public void Addtocart() {
		cart.getBooks().click();
		logger.log(Status.INFO,"user click on books");
		
		cart.getComputinginternet().click();
		logger.log(Status.INFO,"user click on computinginternet");
		
		cart.getAddtocartbutton().click();
		logger.log(Status.INFO,"user click on addtocartbutton");
		

		
		
	}

}
