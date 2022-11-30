package testNGflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagsDescription {
	
	@Test(description = "This method logins to actiTime")
	public void loginToActiTime()
	{
	Reporter.log("login.....",true);	
	}
	@Test(description = "Loging out method")
	public void logOutActiTime()
	{
		Reporter.log("this is logout...........",true);
	}

}
