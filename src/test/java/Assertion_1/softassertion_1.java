package Assertion_1;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertion_1 {
	@Test
	void test_softassertion() {
		System.out.println("testing....");
		System.out.println("testing....");
		System.out.println("testing....");
		System.out.println("testing....");
		SoftAssert sa=new SoftAssert();
		
		sa.assertEquals(1,2);
		System.out.println("soft assertion completed");
		sa.assertEquals(1,1);
	sa.assertAll();
	}
}
