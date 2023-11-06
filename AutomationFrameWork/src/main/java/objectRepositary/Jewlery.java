package objectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jewlery {
	public Jewlery(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}	
	@FindBy(linkText = "Jewelry")
	private WebElement jewlery;
	
	@FindBy(linkText = "Black & White Diamond Heart")
	private WebElement blackandwhitediamond;
	
	@FindBy(id = "add-to-wishlist-button-14")
	private WebElement addtowishlist;
	
	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement wishlist;

	public WebElement getJewlery() {
		return jewlery;
	}

	public WebElement getBlackandwhitediamond() {
		return blackandwhitediamond;
	}

	public WebElement getAddtowishlist() {
		return addtowishlist;
	}

	public WebElement getWishlist() {
		return wishlist;
	}

	
	}
	

