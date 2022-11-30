package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//find all the webelements in the page
	@FindBy(xpath="//div[contains(text(),'Time-Track')]")private WebDriver timeTrackTab;
	@FindBy(xpath = "//div[contains(text(),'Tasks')]") private WebDriver trackTab;
	@FindBy(xpath="//a[text()='Logout']") private WebElement logoutLink;
	
	
	
	//utilization

	
	
	//initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//logout method

		public WebDriver getTimeTrackTab() {
		return timeTrackTab;
	}

	public WebDriver getTrackTab() {
		return trackTab;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

		public void logOutmethod()
		{
			logoutLink.click();
		}

}
