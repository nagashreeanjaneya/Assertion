package testGroupsRunning;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestGroup2 {
	@Test(priority=1,groups="regression")
	public void testCaseFive() {
		Reporter.log("Test Case 5", true);
	}
	@Test(priority=2,groups="regression")
	public void testCaseSix() {
		Reporter.log("Test Case 6", true);
	}
	@Test(priority=3,groups="smoke")
	public void testCaseSeven() {
		Reporter.log("Test Case 7", true);
	}
	@Test(priority=4,groups="smoke")
	public void testCaseEight() {
		Reporter.log("Test Case 8", true);
	}
}
