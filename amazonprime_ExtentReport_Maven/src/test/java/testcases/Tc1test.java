/**
 * Advantages in 3rd tool(ExtentReport):
 * go to chrome->type maven
 * 1.extentreport is 3rd party tool for generating the report with includes bargraghs,timings,userdefined data...etc

 * Drawbacks in testng report:
 * 1.we cannot generate the bargraghs(pictorial representations).
 * 2.In testng report there will be no record of timings of start and end of test cases.
 * 3.user defined data in not included in testng report(ex:which operating system,which language r using)
 */
package testcases;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Demo.Listener.class)
public class Tc1test {
	@Test
	public void m1()
	{
		Reporter.log("testcase 1");
	}
}
