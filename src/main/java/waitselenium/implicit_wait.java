package waitselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class implicit_wait {
public static void main(String args[]) throws InterruptedException {
	//WebDriverManager.chromedriver().setup();  // earlier versions
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.opencart.com/");
	boolean b=driver.findElement(By.xpath("//a[normalize-space()='MacBook']")).isDisplayed();
	
	if(b=true) {
		System.out.println("passed");
	}
	else {
		System.out.println("failed");
	}
	
}
}
