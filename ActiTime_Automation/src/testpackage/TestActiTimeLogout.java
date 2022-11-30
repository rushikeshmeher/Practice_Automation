package testpackage;

import java.io.IOException;

import generic.BaseTest;
import generic.Flib;
import pagepackage.HomePage;
import pagepackage.LoginPage;

public class TestActiTimeLogout extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		LoginPage lg = new LoginPage(driver);
		Flib flib = new Flib();
		String username = flib.readPropertyData(PROP_PATH, "username");
		String password = flib.readPropertyData(PROP_PATH, "password");
		lg.validLoginToActiTime(username, password);
		HomePage hp = new HomePage(driver);
		Thread.sleep(3000);
		hp.logOutmethod();
	}

}
