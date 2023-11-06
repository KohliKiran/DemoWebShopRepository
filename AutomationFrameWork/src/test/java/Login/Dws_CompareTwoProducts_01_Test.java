package Login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlibrery.BaseClass;
import genericlibrery.ITestcontext;
@Listeners(ITestcontext.class)
public class Dws_CompareTwoProducts_01_Test extends BaseClass {
	@Test
public void Comparetwoproducts() {
		product.getComputers().click();
		logger.log(Status.INFO,"user click on computers");
		
		product.getDesktop().click();
		logger.log(Status.INFO,"user click on desktop");
		
		product.getBuildyourowncomputer().click();
		logger.log(Status.INFO,"user click on buildyourcomputer");
		
		product.getComparelist().click();
		logger.log(Status.INFO,"user click on coparelist");
		
		driver.navigate().back();
		driver.navigate().back();
		
		product.getComputers().click();
		logger.log(Status.INFO,"user click on computers");
		
		product.getDesktop1().click();
		logger.log(Status.INFO,"user click on desktop1");
		
		product.getBuildyourowncomputers().click();
		logger.log(Status.INFO,"user click on buildyourcomputers");
		
		product.getComparelist1().click();
		logger.log(Status.INFO,"user click on coparelist1");
		
	   List<WebElement> remove = driver.findElements(By.xpath("//input[@value='Remove']"));
	  for(WebElement element:remove)
	  {
		  try
	  
		  {
		  element.click();
	  }
		  catch(StaleElementReferenceException e)
		  {
			  e.getMessage();
		  }
	  }
	  logger.log(Status.PASS,"the test case passed");

		
		
		
		
		
	
}
}
