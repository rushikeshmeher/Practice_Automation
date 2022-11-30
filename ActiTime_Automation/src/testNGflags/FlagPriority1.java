package testNGflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagPriority1 {
  @Test(priority = 1)
  public void loginMethod() {
	  Reporter.log("This is Login method",true);
  }
  @Test(priority = 2)
  public void flag1() {
	  Reporter.log("This is First testCase...",true);
  }
  @Test(priority = 3)
  public void flag2() {
	  Reporter.log("This is second testCase....",true);
  }
  @Test(priority = 4)
  public void logOutmethod() {
  Reporter.log("This is logOut method",true);
  }
}
