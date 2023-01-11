package testcases;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Demo.Listener.class)
public class Tc3test {
	@Test
	public void m3()
	{
		Reporter.log("testcase 3");
	}
}
