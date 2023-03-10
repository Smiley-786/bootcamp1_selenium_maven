package Annotation_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class beforeafter_1 {
	@BeforeMethod
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
	  
	  
	 @AfterMethod
	  public void logout() {
		 System.out.println("logout"); 
				}
	  
	 
	  public void close() {
		  System.out.println("close");
	  }
	}


