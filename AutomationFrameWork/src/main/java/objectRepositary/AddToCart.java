package objectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	public AddToCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}	
		@FindBy(linkText = "Books")
		private WebElement books;
		
		@FindBy(linkText = "Computing and Internet")
		private WebElement computinginternet;
		
		@FindBy(id = "add-to-cart-button-13")
		private WebElement addtocartbutton;

		public WebElement getBooks() {
			return books;
		}

		public WebElement getComputinginternet() {
			return computinginternet;
		}

		public WebElement getAddtocartbutton() {
			return addtocartbutton;
		}
		

}
