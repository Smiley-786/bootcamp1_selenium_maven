package test_ng_demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class facebook_1 {
	WebDriver driver=new ChromeDriver(); 
	 @Test(priority=0)
	  public void openapp() {
		  driver.get("https://www.facebook.com");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  String title1="https://www.facebook.com/";
			String actualTitle1=driver.getCurrentUrl();
		  Assert.assertEquals(title1, actualTitle1);
		  
		 }
	 @Test(priority=1)
	 public void createanaccount() {
	WebElement btn= driver.findElement(By.xpath("(//a[normalize-space()='Create new account'])[1]"));
	boolean iscreateaccount=btn.isDisplayed();
	if(iscreateaccount) {
       
        System.out.println("create an account box is present");
    }
    else
        Assert.fail("create an account box is not present in the webpage");
	
		}
	 @Test(priority=2)
	 public void facebookSignUp() {
		 driver.findElement(By.xpath("(//a[normalize-space()='Create new account'])[1]")).click();
			driver.findElement(By.xpath("//input[@id='u_f_b_l3']")).sendKeys("anjali");
			driver.findElement(By.xpath("//input[@id='u_f_d_LQ']")).sendKeys("sharma");
			driver.findElement(By.xpath("//input[@id='u_f_g_05']")).sendKeys("anjalisharma@gmail.com");
			driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("smily123");
			
			Select selDate = new Select(driver.findElement(By.xpath("//select[@id='day']")));
			Select selMonth = new Select(driver.findElement(By.xpath("//select[@id='month']")));
			Select selYear = new Select(driver.findElement(By.xpath("//select[@id='year']")));
			selDate.selectByVisibleText("28");
			selMonth.selectByVisibleText("10");
			selYear.selectByVisibleText("2000");
			
			driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
			
			WebElement female= driver.findElement(By.xpath("(//label[normalize-space()='Female'])[1]"));
			female.click();
			
			driver.findElement(By.xpath("//button[@id='u_j_s_zQ']")).click();

	  }
	  
	  @Test(priority=3)
	  void verifyAccCreation() {
		  String acc_url=driver.getCurrentUrl();
		  Assert.assertEquals(acc_url, "https://www.facebook.com/getting_started/","Account not created successfully.");
		  
	  }
	  @Test(priority=4)
		  void closeup() {  
		  
		  driver.close();
	  }}

