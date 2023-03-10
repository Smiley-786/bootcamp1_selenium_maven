package Annotation_1;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class beforeafter_class {
	@BeforeClass
	public void login() {
		System.out.println("login");
	}
		
	@Test(priority=2)
	  public void search() {
		 
		System.out.println("search");  
	  }
	@Test(priority=2)
	  public void Asearch() {
		 
		System.out.println("Asearch");  
	  }
	  
	  
	 @AfterClass
	  public void logout() {
		 System.out.println("logout"); 
				}
	  
	 
	  public void close() {
		  System.out.println("close");
	  }
	}


