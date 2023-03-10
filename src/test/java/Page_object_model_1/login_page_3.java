package Page_object_model_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page_3 {
	public WebDriver driver;

	login_page_3(WebDriver Driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="")
	WebElement img_logo;
	
	@FindBy(xpath="")
	WebElement txt_username;
	
	@FindBy(xpath="")
	WebElement txt_password;
	
	@FindBy(xpath="")
	WebElement btn_submit;
	
	
	public void setUserName(String username) {
		
	}
	}
