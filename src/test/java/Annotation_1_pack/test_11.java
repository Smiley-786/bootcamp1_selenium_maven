package Annotation_1_pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test_11 {
	@Test
	public void abc() {
		System.out.println("This is abc from test11");
	}
	@BeforeTest
	void m() {
		System.out.println("This is before class");
	}
	@BeforeSuite
	void a() {
		System.out.println("This is before Suite");
	}
	
	@AfterSuite
	void b() {
		System.out.println("This is After Suite");
	}
	
}
