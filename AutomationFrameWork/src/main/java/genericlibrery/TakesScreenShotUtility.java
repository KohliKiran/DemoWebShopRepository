package genericlibrery;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
/**
 *@Kiran
 */
public class TakesScreenShotUtility {
	WebDriver driver;
	TakesScreenshot ss;
	public TakesScreenShotUtility(WebDriver driver) {
		this.driver=driver;
		ss=(TakesScreenshot) this.driver;
	}
	// TODO Auto-generated constructor stub
	/**
	 * This method is used to Takes The ScreenShot from the WebPage or WebElement
	 * @param screenshotName
	 * @return
	 */
	public String capturingScreenshot(String screenshotName) {
		File photo = ss.getScreenshotAs(OutputType.FILE);
		String time = LocalDateTime.now().toString().replace(':', '-');
		String directory = System.getProperty("user.dir");
		String path="./target/errorshort/"+screenshotName+ ""+ time+".png"; 
		File destination=new File(path); 
		try {
			FileUtils.copyFile(photo, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return path;




	}
}
