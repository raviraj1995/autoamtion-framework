package TestBase;

import com.relevantcodes.extentreports.ExtentTest;

public class ExtentTestFactory {
	
	private ExtentTestFactory() {
		
	}
	private static ExtentTestFactory extentTest=new ExtentTestFactory();
	
	public static ExtentTestFactory getInstance() {
		return extentTest;
	}
	
	ThreadLocal<ExtentTest> extent=new ThreadLocal<ExtentTest>();
	
	public void setExtentTest(ExtentTest test) {
		extent.set(test);
	}
	public ExtentTest getExtentTest() {
		return extent.get();
	}
	public void closeExtentTest() {
		extent.remove();
	}

}
