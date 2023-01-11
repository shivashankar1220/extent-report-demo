package testcases;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Demo.Listener.class)
public class Tc2Test {
@Test
public void m2()
{
	Reporter.log("testcase 2");
}
}
