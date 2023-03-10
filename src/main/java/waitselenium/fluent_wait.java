package waitselenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class fluent_wait {
	public static void main(String args[])  {
		WebDriver driver = new ChromeDriver();
		//Deceleration
		FluentWait<WebDriver> mywait=new FluentWait(driver);
		mywait.withTimeout(Duration.ofSeconds(30));
		mywait.pollingEvery(Duration.ofSeconds(5));
		mywait.ignoring(NoSuchElementException.class);
	
		//usage
		WebElement username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		username.sendKeys("Admin");
		
		
		WebElement password =mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		password.sendKeys("admin123");
		
		
		WebElement submit=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		submit.click();
		
		driver.close();
	}}
