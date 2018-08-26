package testGroupsRunning;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestGroup {
	@Test(priority=1,groups="smoke")
	public void testCaseOne() {
		Reporter.log("Test Case 1", true);
	}
	@Test(priority=2,groups="regression")
	public void testCaseTwo() {
		Reporter.log("Test Case 2", true);
	}
	@Test(priority=3,groups="regression")
	public void testCaseThree() {
		Reporter.log("Test Case 3", true);
	}
	@Test(priority=4,groups="regression")
	public void testCaseFour() {
		Reporter.log("Test Case 4", true);
	}
}
