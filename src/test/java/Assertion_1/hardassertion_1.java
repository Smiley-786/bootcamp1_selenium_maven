package Assertion_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassertion_1 {
	@Test
void test_hardassertion() {
	System.out.println("testing....");
	System.out.println("testing....");
	System.out.println("testing....");
	System.out.println("testing....");
	Assert.assertEquals(1,2);
	System.out.println("aa");
	Assert.assertEquals(1,1);
	System.out.println("hard assertion completed");
}
}
