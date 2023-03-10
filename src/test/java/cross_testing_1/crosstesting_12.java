package cross_testing_1;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.*;


import io.github.bonigarcia.wdm.WebDriverManager;


public class crosstesting_12 {
	WebDriver driver;
@Test
	@BeforeClass
	@Parameters({"Browser"})
	void setup(String br) throws InterruptedException
	{
		if(br.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(br.equals("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
//	@Test(priority=1)
//	void testLogo()
//	{
//		try
//		{
//			boolean status=driver.findElement(By.xpath("//img[@title='Flipkart']")).isDisplayed();
//			Assert.assertEquals(status,true);
//		}
//		catch(Exception e)
//		{
//			Assert.fail();
//		}
//	}
//
//	@Test(priority=2)
//	void testHomePageTitle()
//	{
//		Assert.assertEquals(driver.getTitle(),"OrangeHRM","Titles are not matched..");
//
//	}

	@AfterClass
	void closeApp()
	{
		driver.quit();
	}
}
