package grouping_case1;

import org.testng.annotations.*;

public class case_1 {
@Test(priority=1,groups= {"sanity","regression"}) 
public void loginByEmail() {
	System.out.println("this is login by mail");
}
@Test(priority=2,groups= {"sanity"}) 
public void loginByfacebook() {
	System.out.println("this is login by facebook");}

@Test(priority=3,groups= {"sanity","regression"}) 
public void loginBytwitter() {
	System.out.println("this is login by twitter");}

@Test(priority=4,groups= {"regression"}) 
public void loginByinstagram() {
	System.out.println("this is login by instagram");}
}
