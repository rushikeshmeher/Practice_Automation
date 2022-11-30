package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//find all the webelements from the page
	@FindBy(name="username") private WebElement usr;
	@FindBy(name="pwd") private WebElement pwd;
	@FindBy(name="remember") private WebElement rememberMeCheckBox;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(xpath = "//a[contains(text(),'License')]") private WebElement LicenceLink;
	
	
	//Initialization
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization 
	
	public WebElement getUsername() {
		return usr;
	}
	
	public WebElement getPassword() {
		return pwd;
	}
	public WebElement getRememberMeCheckBox() {
		return rememberMeCheckBox;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getLicenceLink() {
		return LicenceLink;
	}

	//validLoginMethod
	public void validLoginToActiTime(String username,String password)
	{
		usr.sendKeys(username);
		pwd.sendKeys(password);
		loginButton.click();
	}
	//invalidLoginMethod
	public void invalidLoginToActiTime(String username,String password)
	{
		usr.sendKeys(username);
		pwd.sendKeys(password);
		loginButton.click();
		usr.clear();
	}
	

}
