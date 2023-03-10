package test_ng_demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class test_ng1 {
	WebDriver driver=new ChromeDriver(); 
	WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
	
  @Test(priority=0)
  public void openapp() {
		
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	  
  }
  
  
  @Test(priority=1)
  public void login() {
	  WebElement username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
	  username.sendKeys("vgfcgh");
	  
				
				
	
				driver.findElement(By.xpath("//button[@type='submit']")).click();  
  }
  
  @Test(priority=2)
  public void close() {
	 driver.close(); 
  }
}
