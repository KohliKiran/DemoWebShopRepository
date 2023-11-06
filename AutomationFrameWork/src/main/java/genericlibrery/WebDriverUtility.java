package genericlibrery;

import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
/**
 *@Kiran 
 */
public class WebDriverUtility {
	// In this Utility we are using javaScriptexceutor(by using js were performing clicking,entering the data,scrolling actions),ActionClass,SelectClass,
	// To check the explicitly wait and handling the frames and handling the windows
	WebDriver driver;
	JavascriptExecutor js;
	public WebDriverUtility(WebDriver driver) {
		this.driver=driver;
		js=(JavascriptExecutor) driver;
	}
	/**
	 * This method is used to click the element by using javaScriptexceutor
	 * @param Element
	 */
	public void clickingonElement(WebElement Element) {
		js.executeScript("arguments[0].click();",Element);	
	}
	/**
	 * This method is used to enter the data into the text field by using javaScriptexceutor 
	 * @param Element
	 * @param data
	 */
	public void enteringDataIntoElement(WebElement Element,String data) {
		js.executeScript("arguments[0].value='"+data+"'", Element);
	}
	/**
	 * This method is use to Scrolling the WebPage for given coordinates  
	 * @param x
	 * @param y
	 */
	public void scrollToAction(int x,int y ) {
		js.executeScript("window.scrollTo("+x+","+y+")");			
	}
	/**
	 * This method is use to Scrolling the WebPage for given coordinates
	 * @param x
	 * @param y
	 */
	public void scrollByAction(int x,int y ) {
		js.executeScript("window.scrollBy("+x+","+y+")");			
	}
	/**
	 * This method is used to Scroll the element for given condition either true or false 
	 * @param element
	 * @param status
	 */
	public void scrollIntoViewAction(WebElement element, Boolean status) {
		js.executeScript("arguments[0].scrollIntoView("+status+")",element);
	}
	/**
	 * This method is used to given the WebDriver Wait to the 
	 */
	
	/**
	 * This method is used to perform mouse related operations
	 * @return
	 */
	public Actions actionsRefernce() {
		Actions act=new Actions(driver);
		return act;
	}
	/**
	 * This method is used to perform dropDowns(Single,MultiDropdowns)
	 * @param element
	 * @param value
	 */
	public void handlingDropdown(WebElement element,String value) {
		Select select=new Select(element);
		try {
			select.selectByVisibleText(value);
		}
		catch(NoSuchElementException e) {
			select.selectByValue(value);
		}
		catch(Exception e) {
			int val=Integer.parseInt(value);
			select.selectByIndex(val);
		}
	}
	/**
	 *  This method is used to switch the driver control from window to name
	 * @param name
	 */
	public void switchingToFrame(String name) {
		driver.switchTo().frame(name);
	}
	/**
	 * This method is used to switch the driver control from window to frame
	 * @param element
	 */
	public void switchingToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}
	/**
	 *  This method is used to switch the driver control from window to element
	 */
	public void switchingBackToMainWindow(){
		driver.switchTo().defaultContent();
	}
	/**
	 * This method is use to return the alert method
	 * @return
	 */
	public Alert returnAlertRefernce() {
		driver.switchTo().alert();
		return driver.switchTo().alert();
	}
	/**
	 * This method is used to switch the driver control from one window to anther window
	 * @param allWindowId
	 * @param expectedTitle
	 * @param parentId
	 */
	public void switchingToWindow(Set<String> allWindowId,String expectedTitle,String parentId) {
		allWindowId.remove(parentId);
		for(String id:allWindowId) {
			driver.switchTo().window(id);
			if(expectedTitle.equalsIgnoreCase(driver.getTitle()));
			break;
		}
	}
	/**
	 * This method is used to switch the control back to parent window
	 * @param parentId
	 */
	public void switchingBackToMainWindow(String parentId) {
		driver.switchTo().window(parentId);
	}		
}








