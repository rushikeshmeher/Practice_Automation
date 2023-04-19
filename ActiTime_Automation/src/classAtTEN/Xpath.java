package classAtTEN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		//Xpath:- it is a locator which is used to find webelemnets on web page
		//xpath syntax:--- //tagName[@attributeName='attributeValue']
		// eg      xpath("//tagName[@attributeName='attributeValue']")
		//absolute Xpath :- /html/body/form/table/tr/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td[2]/table/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td[2]/input
		//relative xpath:- 
	
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(co);
		driver.get("http://msi/login.do");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(3000);
		//eg      xpath("//tagName[.='attributeValue']") ("//tagName[text()='attributeValue']")
		//driver.findElement(By.xpath("//a[.='Login']")).click();
		
		//eg      xpath("//tagName[contains(@attributeName,'attributeValue')]")
		//eg      xpath("//tagName[contains(text(),'attributeValue')]")
		
		
		
		
		
	}

}
