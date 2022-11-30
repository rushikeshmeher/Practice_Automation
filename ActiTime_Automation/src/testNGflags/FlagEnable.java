package testNGflags;

import org.testng.annotations.Test;

public class FlagEnable {
  @Test(enabled = true)
  public void login() {
  }
  
  @Test(enabled = false)
  public void logout() {
  }
}
