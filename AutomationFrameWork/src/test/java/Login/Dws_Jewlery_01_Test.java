package Login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlibrery.BaseClass;
import genericlibrery.ITestcontext;
@Listeners(ITestcontext.class)
public class Dws_Jewlery_01_Test extends BaseClass {
	@Test
	public void jewlery() {
		jewlery.getJewlery().click();
		logger.log(Status.INFO,"user click on jewlery");
		
		jewlery.getBlackandwhitediamond().click();
		logger.log(Status.INFO,"user click on black and white diamnod");
		
		jewlery.getAddtowishlist().click();
		logger.log(Status.INFO,"user click on add to wishlist");
		
		jewlery.getWishlist().click();
		logger.log(Status.INFO,"user click on wishlist");
		
		
	}

}
