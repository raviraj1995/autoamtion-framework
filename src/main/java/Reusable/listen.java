package Reusable;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;

import TestBase.ExtentTestFactory;
import TestBase.TestBase;

public class listen extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		ExtentReport.startTest(result.getMethod().getMethodName());
		ExtentTestFactory.getInstance().setExtentTest(ExtentReport.test);
		ExtentTestFactory.getInstance().getExtentTest();
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ExtentTestFactory.getInstance().getExtentTest().log(LogStatus.PASS, "test case passed");
		ExtentTestFactory.getInstance().getExtentTest().log(LogStatus.INFO, "name of passed test case is "+result.getMethod().getMethodName());
		ExtentTestFactory.getInstance().closeExtentTest();
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try{ExtentTestFactory.getInstance().getExtentTest().log(LogStatus.FAIL, "test case failed");
		ExtentTestFactory.getInstance().getExtentTest().log(LogStatus.INFO, "name of failed test case is "+result.getMethod().getMethodName());
		ExtentTestFactory.getInstance().getExtentTest().log(LogStatus.INFO, "resoan of failure is "+result.getThrowable());
		ExtentTestFactory.getInstance().getExtentTest().log(LogStatus.INFO, ExtentTestFactory.getInstance().getExtentTest().addScreenCapture(Utlity.takeScreenshot(result.getMethod().getMethodName())));
		ExtentTestFactory.getInstance().closeExtentTest();
		}catch(NullPointerException e) {
			
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ExtentTestFactory.getInstance().getExtentTest().log(LogStatus.SKIP, "test case skipped");
		ExtentTestFactory.getInstance().closeExtentTest();
		
	}

	@Override
	public void onStart(ITestContext context) {
		ExtentReport.setExtentReport();
		
	}

	@Override
	public void onFinish(ITestContext context) {
		ExtentReport.endExtentReports();
		
	}

}
