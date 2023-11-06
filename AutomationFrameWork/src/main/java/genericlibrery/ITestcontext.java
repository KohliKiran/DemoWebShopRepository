package genericlibrery;
/**
 * @Kiran
 */
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.Writable;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import jdk.jfr.internal.Logger;

public class ITestcontext extends BaseClass implements ITestListener{
	ExtentReports report; 
	
	@Override
	public void onStart(ITestContext context) {
		/**
		 * To generate the extent reports 
		 */
		ExtentSparkReporter reporter=new ExtentSparkReporter("./Report/demoreport.html");
		reporter.config().setTheme(Theme.STANDARD);//DARK Theme
		reporter.config().setDocumentTitle("This is a Sample report");
		reporter.config().setReportName("Kiran");
		report=new ExtentReports();
		report.attachReporter(reporter);
	}
	@Override
	public void onTestStart(ITestResult result) {
		logger = report.createTest(result.getName());
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		logger.log(Status.PASS,"This test "+result.getName()+"is passed");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		logger.log(Status.FAIL,"This test"+result.getName()+"is failed");
		logger.addScreenCaptureFromPath(screeshot.capturingScreenshot(result.getName()));
	}
	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

}
