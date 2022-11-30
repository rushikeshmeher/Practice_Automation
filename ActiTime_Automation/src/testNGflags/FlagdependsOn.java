package testNGflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagdependsOn {
  @Test
  public void login() {
	  Reporter.log("This is login method",true);
  }
  @Test(dependsOnMethods = "login")
  public void craeteUser() {
	  Reporter.log("This will run after login method",true);
  }
  @Test (priority = 1)
  public void logout() {
	  Reporter.log("This is logout method",true);
  }
}
