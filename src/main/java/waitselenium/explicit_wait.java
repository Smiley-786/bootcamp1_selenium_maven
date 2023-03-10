package waitselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_wait {
public static void main(String args[]) {
	WebDriver driver = new ChromeDriver();
	WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
	username.sendKeys("Admin");
	
	
	WebElement password =mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
	password.sendKeys("admin123");
	
	
	WebElement submit=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
	submit.click();
	
	driver.close();
}
}
