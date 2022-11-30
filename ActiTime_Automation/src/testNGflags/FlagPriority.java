package testNGflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagPriority {

	@Test
	public void x()
	{
		Reporter.log("method x",true);
	}
	@Test
	public void n()
	{
		Reporter.log("method n",true);	
	}
	@Test
	public void a()
	{
		Reporter.log("method a",true);
	}
	@Test
	public void h()
	{
		Reporter.log("method h",true);
	}
}
