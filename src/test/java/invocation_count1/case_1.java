package invocation_count1;

import org.testng.annotations.Test;

public class case_1 {
  @Test(invocationCount=10)
  public void f() {
	  System.out.println("testing");
  }
}
