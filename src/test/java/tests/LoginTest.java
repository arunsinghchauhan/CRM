package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends TestBase {
	
	@Test
	public void loginPage() throws InterruptedException
	{
		LoginPage lgn= PageFactory.initElements(driver, LoginPage.class);
		lgn.loginButtonClickInDashBoardPage();
		lgn.EnterEmailAndPassword();
		System.out.println("User login into the application successfully");
	}

}
