package classAtTEN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		//All Locators methods are of By Class.(Static)
		/*
		 * tagName() id() name() className() linkText() partialLinkText() cssSelector()
		 * Xpath()
		 */
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://msi/login.do");
		Thread.sleep(3000);
		/*
		 * driver.findElement(By.className("textField")).sendKeys("admin");
		 * driver.findElement(By.name("pwd")).sendKeys("manager"); Thread.sleep(3000);
		 * driver.findElement(By.id("loginButton")).click(); Thread.sleep(3000);
		 */
		//driver.findElement(By.linkText("Logout")).click();
		//driver.findElement(By.partialLinkText("ogo")).click();
		//css selector Tagname[@attributeName=""]
		//driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		//Xpath type 1:- xpath("//tagName[@attribute='value of attribute']")
		/* username textfield */driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		Thread.sleep(2000);
		/* password textfield */driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		//Xpath type 2:- xpath("//tagName[text()='value of attribute']")
		driver.findElement(By.id("loginButton")).click();
		
		
		
		
		
		

	}

}
