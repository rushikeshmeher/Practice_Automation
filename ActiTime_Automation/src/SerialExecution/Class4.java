package SerialExecution;

import java.util.Set;

import org.apache.log4j.chainsaw.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class4 {
	@Test
	private void Main() {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.hike.in/");
		

	}

}
