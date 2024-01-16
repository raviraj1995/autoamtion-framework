package Reusable;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReport {
	public static ExtentReports report;
	public static ExtentTest test;
	
	public static ExtentReports setExtentReport() {
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yy HH-mm-ss");
		Date date=new Date();
		String actaulDate=format.format(date);
		String path="C:\\Users\\Raviraj\\eclipse-workspace\\Framework6\\Reports\\report_"+actaulDate+".html";
		report=new ExtentReports(path);
		return report;
		
	}
	public static void startTest(String testName) {
		test=report.startTest(testName);
	}
	public static void endExtentReports() {
		report.endTest(test);
		report.flush();
	}

}
