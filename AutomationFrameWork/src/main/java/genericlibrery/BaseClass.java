package genericlibrery;
/**
 * @Kiran
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepositary.AddToCart;
import objectRepositary.CompareTwoProducts;
import objectRepositary.Jewlery;
import objectRepositary.LoginPage;
import objectRepositary.RegisterPage;
/**
 * WithhOut Base Class WecCant Do Anything in framework 
 * we can add pre and post conditions,configuration annotations and all the utilityes should be extends from base class 
 */
public class BaseClass implements IAutoConstants{
	public static WebDriver driver;
	public static ExtentTest logger ;
	;
	PropertyUtility property;
public static TakesScreenShotUtility screeshot;
	WebDriverUtility utility;

	JavaUtility javautility;
	DataBaseUtility databaseutility;
	public static LoginPage login;
	public static RegisterPage register;
	public static AddToCart cart;
	public static CompareTwoProducts product;
	public static Jewlery jewlery;
	

	/**
	 * This Method is used to launching the browser and navigate to the application
	 */
	@BeforeClass(alwaysRun = true)
	public void launchingthebrowserAndNavigateToApp() {
		property=new PropertyUtility();	
		if(BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver();

		}else if(BROWSER.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(property.readingDataFromPropertyFile("url"));
	    utility=new WebDriverUtility(driver);
	    screeshot=new TakesScreenShotUtility(driver);
	    javautility=new JavaUtility();
	    databaseutility=new DataBaseUtility();
	}
	/**
	 * This Method Is used to login to the application
	 */
	@BeforeMethod(alwaysRun = true)
	public void logintoapplication() {
		login=new LoginPage(driver);
		register=new RegisterPage(driver);
	    cart=new AddToCart(driver);
	    product=new CompareTwoProducts(driver);
	     jewlery=new Jewlery(driver); 	
		
		System.out.println("logged in to the applicatoion");	
	}
    /**
     * This Method is used to logged out to the application
     */
	@AfterMethod(alwaysRun = true)
	public void logoutfromapplication() {
		System.out.println("logged out to the applicatoion");	
	}
	/**
	 * This Method is used to quit the application
	 */
	@AfterClass(alwaysRun = true)
	public void closingtheserver() {
		driver.quit();
	}
}



