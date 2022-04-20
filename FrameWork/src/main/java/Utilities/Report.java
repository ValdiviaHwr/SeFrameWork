package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Report {
	
	public static ExtentReports createReport(String nameCase) {
	
	
	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(nameCase+".html");
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	
	return extent;
			
			//extent.createTest("Report of"+nameCase, "Extent report of"+ nameCase);
	
	//ExtentTest nameCase = extent.createTest("Report of"+nameCase, "Extent report of"+ nameCase);
	 
	}
	
	public static ExtentReports doneReport(ExtentTest endReport) {
		
		endReport.flush();
	}
	
}
