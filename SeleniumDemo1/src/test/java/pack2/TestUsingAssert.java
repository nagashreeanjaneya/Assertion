package pack2;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestUsingAssert {
	@Test
	public void testAssert1() {
		Reporter.log("Step 1", true);
		Assert.assertEquals("abc", "abc");
		Reporter.log("Step 2", true);
		Assert.assertEquals("abc", "xyz");
		Reporter.log("Step 3", true);
	}
}
