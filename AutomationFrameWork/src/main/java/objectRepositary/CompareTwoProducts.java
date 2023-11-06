package objectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompareTwoProducts {
	public CompareTwoProducts(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Computers")
	private WebElement computers;
	
	@FindBy(linkText = "Desktops")
	private WebElement desktop;
	
	@FindBy(linkText = "Build your own cheap computer")
	private WebElement buildyourowncomputer;
	
	@FindBy(xpath = "//input[@value='Add to compare list']")
	private WebElement comparelist;
	
	@FindBy(linkText = "Build your own computer")
	private WebElement buildyourowncomputers;
	
	@FindBy(linkText = "Desktops")
	private WebElement desktop1;
	
	@FindBy(xpath = "//input[@value='Add to compare list']")
	private WebElement comparelist1;
	
	@FindBy(xpath = "//input[@value='Remove']")
	private WebElement remove;

	public WebElement getComputers() {
		return computers;
	}

	public WebElement getDesktop() {
		return desktop;
	}

	public WebElement getBuildyourowncomputer() {
		return buildyourowncomputer;
	}

	public WebElement getComparelist() {
		return comparelist;
	}

	public WebElement getBuildyourowncomputers() {
		return buildyourowncomputers;
	}

	public WebElement getComparelist1() {
		return comparelist1;
	}

	public WebElement getDesktop1() {
		return desktop1;
	}

	public WebElement getRemove() {
		return remove;
	}
	
	
	

	
	
	
   
		

}

