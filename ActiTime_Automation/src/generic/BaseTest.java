package generic;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.google.common.io.Files;

public class BaseTest implements IAutoConstant{
 protected static WebDriver driver;

	@BeforeMethod
	public void setUp() throws IOException
	{
		Flib flib = new Flib();
		String browservalue = flib.readPropertyData(PROP_PATH, "browser");
		String url = flib.readPropertyData(PROP_PATH, "url");
		if(browservalue.equalsIgnoreCase("chrome"))
		{
		System.setProperty(CHROME_KEY, CHROME_PATH);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		
		}
		else 
		{
			System.out.println("Invalid broswser name");
		}
	}

	public void failed(String methodName)
	{
		try{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(SCREENSHOT_PATH+methodName+".png");
			Files.copy(src, dest);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
