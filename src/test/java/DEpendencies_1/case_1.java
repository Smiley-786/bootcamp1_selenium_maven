package DEpendencies_1;
import org.testng.annotations.Test;
import org.testng.Assert;


public class case_1 {
	@Test(priority=1)
	public void openapp() {
		Assert.assertTrue(true);
	}
	@Test(priority=2,dependsOnMethods= {"openapp"})	
	public void login() {
		Assert.assertTrue(true);
	}
		
	@Test(priority=3,dependsOnMethods= {"login"})
	  public void search() {
		 
		Assert.assertTrue(false);
	  }
	@Test(priority=4,dependsOnMethods= {"login,search"})
	  public void Asearch() {
		 
		Assert.assertTrue(true); 
	  }
	  
	  
	@Test(priority=5,dependsOnMethods= {"login"})
	  public void logout() {
		 Assert.assertTrue(true);
				}
	  
	 
	  
	  }
	

