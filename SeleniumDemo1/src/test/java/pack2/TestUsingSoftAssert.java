package pack2;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestUsingSoftAssert {
	@Test
	public void testSoftAssert1() {
		Reporter.log("Step 1", true);
		SoftAssert s=new SoftAssert();
		s.assertEquals("abc", "abc");
		Reporter.log("Step 2", true);
		s.assertEquals("abc", "xyz");
		Reporter.log("Step 3", true);
		s.assertAll();
	}
}
