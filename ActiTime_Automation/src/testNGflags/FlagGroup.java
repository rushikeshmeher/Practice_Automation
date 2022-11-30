package testNGflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagGroup {
  @Test(groups = "Functional")
  public void functionalTest1()
  {
	  Reporter.log("This is functional test 1",true);
  }@Test(groups = "Integration")
  public void integrationTest1()
  {
	  Reporter.log("This is integration test 1",true);
  }
  @Test(groups = "Smoke")
  public void smokeTest1()
  {
	  Reporter.log("This is smoke test 1",true);
  }
  @Test(groups = "System")
  public void systemTest1()
  {
	  Reporter.log("This is system test 1",true);
  }
  //--------------------------------------------------------
  
  @Test(groups = "Functional")
  public void functionalTest2()
  {
	  Reporter.log("This is functional test 2",true);
  }@Test(groups = "Integration")
  public void integrationTest2()
  {
	  Reporter.log("This is integration test 2",true);
  }
  @Test(groups = "Smoke")
  public void smokeTest2()
  {
	  Reporter.log("This is smoke test 2",true);
  }
  @Test(groups = "System")
  public void systemTest2()
  {
	  Reporter.log("This is system test 2",true);
  }
  //--------------------------------------------------------
  
  @Test(groups = "Functional")
  public void functionalTest3()
  {
	  Reporter.log("This is functional test 3",true);
  }@Test(groups = "Integration")
  public void integrationTest3()
  {
	  Reporter.log("This is integration test 3",true);
  }
  @Test(groups = "Smoke")
  public void smokeTest3()
  {
	  Reporter.log("This is smoke test 3",true);
  }
  @Test(groups = "System")
  public void systemTest3()
  {
	  Reporter.log("This is system test 3",true);
  }
  //--------------------------------------------------------
  
  @Test(groups = "Functional")
  public void functionalTest4()
  {
	  Reporter.log("This is functional test 4",true);
  }@Test(groups = "Integration")
  public void integrationTest4()
  {
	  Reporter.log("This is integration test 4",true);
  }
  @Test(groups = "Smoke")
  public void smokeTest4()
  {
	  Reporter.log("This is smoke test 4",true);
  }
  @Test(groups = "System")
  public void systemTest4()
  {
	  Reporter.log("This is system test 4",true);
  }
  //--------------------------------------------------------
  
  @Test(groups = "Functional")
  public void functionalTest5()
  {
	  Reporter.log("This is functional test 5",true);
  }@Test(groups = "Integration")
  public void integrationTest5()
  {
	  Reporter.log("This is integration test 5",true);
  }
  @Test(groups = "Smoke")
  public void smokeTest5()
  {
	  Reporter.log("This is smoke test 5",true);
  }
  @Test(groups = "System")
  public void systemTest5()
  {
	  Reporter.log("This is system test 5",true);
  }
  //--------------------------------------------------------
  @Test(groups = "Functional")
  public void functionalTest6()
  {
	  Reporter.log("This is functional test 6",true);
  }@Test(groups = "Integration")
  public void integrationTest6()
  {
	  Reporter.log("This is integration test 6",true);
  }
  @Test(groups = "Smoke")
  public void smokeTest6()
  {
	  Reporter.log("This is smoke test 6",true);
  }
  @Test(groups = "System")
  public void systemTest6()
  {
	  Reporter.log("This is system test 6",true);
  }
  //--------------------------------------------------------
  

}
