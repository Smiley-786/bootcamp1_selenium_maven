package Annotation_1_pack;

import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;

public class test_22 {
	@Test
public void xyz() {
	System.out.println("This is xyz from test22");
}
	@AfterTest
	void n() {
		System.out.println("This is after class");
	}
}
