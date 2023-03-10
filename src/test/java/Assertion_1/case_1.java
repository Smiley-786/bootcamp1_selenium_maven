package Assertion_1;

import org.testng.Assert;
import org.testng.annotations.*;

public class case_1 {
	@Test
public void abc() {
int a=20;
	int b=20;
	if(a>b) {
		System.out.println("passed");
		
	}
	else {
		System.out.println("failed");
	}
	Assert.assertEquals(a,b);
	Assert.assertTrue(true);
	Assert.assertTrue(false);
	
//Assert.assertEquals(actual, expected,description);
//	Assert.assertEquals(a>b,true,"a is not greater than b");//description will not work when condition is true 
//	
//	
//String s1="abc";
//String s2="abc";
//	Assert.assertEquals(s1,s2);
//	
//	
//	if(false) {		Assert.assertTrue(true);
//	}
//	else {
//		//Assert.assertTrue(false);
//		Assert.fail();
//	}
//}
	}}
