package datadriven_3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_1 {
	public static void main(String args[]) {
	System.setProperty("Webdriver.chrome.driver","C:\\automation testing\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(); 
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	String title=driver.getTitle();
	String actualTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	
	System.out.println(title);

	if(actualTitle.equals(title)) {
		
	System.out.println("test passed");
	}
	else {
		System.out.println("test failed");
		
	}
	
	String title1=driver.getCurrentUrl();
	String actualTitle1="https://www.flipkart.com/";
	
	System.out.println(title1);

	if(actualTitle1.equals(title1)) {
		
	System.out.println("test passed");
	}
	else {
		System.out.println("test failed");
		
	}
if( driver.getPageSource().contains("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books &amp; More. Best Offers!<")){
		//System.out.println(driver.getPageSource());
	 System.out.println("test passed");
	
}else {
	 System.out.println("test failed");
}
	
	
	driver.close();
}

	
		
	}
