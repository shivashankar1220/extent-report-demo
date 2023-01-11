package Demo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listener implements ITestListener {
	ExtentReports er;
	//non-primitive data type
	//it will moniter the listener clas example when it is starting ending
	ExtentTest test;
	public void onTestStart(ITestResult result) {
		String name=result.getName();
		//particular test case monitor
		test=er.createTest(name);
	}
	public void onTestSuccess(ITestResult result) 
	{
		String name=result.getName();
		test.log(Status.PASS,name+"------pass");
	}
	public void onTestFailure(ITestResult result) {
		String name=result.getName();
		test.log(Status.FAIL,name+"-----fail");
	}
	public void onStart(ITestContext context) 
	{
		ExtentSparkReporter esr=new ExtentSparkReporter(".\\extentreport\\"+1+".html");//we need to provide the path of extentroport folder
		//providing the title to the report
		esr.config().setDocumentTitle("final report");
		//providing the theme or colour for the report
		esr.config().setTheme(Theme.STANDARD);
		//providing the reporter name
		esr.config().setReportName("shiva shankar reddy");
		
		
		//extra relavent information about report
		er=new ExtentReports();
		er.attachReporter(esr);
		er.setSystemInfo("operating system", "windows");
		er.setSystemInfo("language", "java");
	}
	public void onFinish(ITestContext context) {
		er.flush();
		}
}
