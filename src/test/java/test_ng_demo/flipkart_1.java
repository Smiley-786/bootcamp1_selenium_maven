package test_ng_demo;
import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class flipkart_1 {
	  
	   WebDriver driver=new ChromeDriver(); 
	   
			 @Test(priority=0)
			  public void openapp() {
				  driver.get("https://www.flipkart.com/");
				  driver.manage().window().maximize();
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }
			 @Test(priority=1)
			 public void getLinkCount(){
					List<WebElement> allLink = driver.findElements(By.tagName("a"));
					
					System.out.println("Number of links on a page :: "+allLink.size());
				}
			 @Test(priority=2)
				public void getLinkUrl(){
					String url = driver.findElement(By.tagName("a")).getAttribute("href");
					System.out.println("Url :: "+ url);
				}
			 @Test(priority=3)
				public void getAllLinkInfo(){
					List<WebElement> allLink = driver.findElements(By.tagName("a"));
					
					for(WebElement link:allLink){
						System.out.println("Link Text :: "+ link.getText());
						System.out.println("Link URL  :: "+ link.getAttribute("href"));
						
						System.out.println("-------------------------------------------");
					}
				}

			}



