package classAtTEN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(co);
		//driver.get("http://msi/login.do");
		Thread.sleep(3000);
		/*String PageTitle = driver.getTitle();
		System.out.println(PageTitle);
		String PageSourse = driver.getPageSource();
		System.out.println(PageSourse);
		String PageURl = driver.getCurrentUrl();
		System.out.println(PageURl);*/
		driver.navigate().to("http://msi/login.do");
		Thread.sleep(3000);
		driver.navigate().refresh();
		String PageWindowHandle = driver.getWindowHandle();
		System.out.println(PageWindowHandle);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.findElement(By.partialLinkText("Actimin")).click();
		//driver.findElement(By.name("username")).sendKeys("admin");
		//driver.findElement(By.name("pwd")).sendKeys("manager");
		//driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@name='username' and @class='textField']")).sendKeys("admin");
		//driver.findElement(By.xpath("//a[.='Actimind Inc.']")).click();
		//xpath(""//tagname[conatins(@attribute,'attribute value')])
		driver.findElement(By.xpath("//a[contains(@id,'loginButton')]")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		
		

	}

}
