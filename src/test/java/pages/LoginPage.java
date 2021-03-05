package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import tests.TestBase;

public class LoginPage extends TestBase{
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	@FindBy(xpath="//span[text()='Log In']//parent::a")
	WebElement loginButton;
	@FindBy(name="email")
	WebElement emailTextField;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//div[text()='Login']")
	WebElement login;
	
	
	public void loginButtonClickInDashBoardPage() throws InterruptedException
	{
		String lgnText=loginButton.getText();
		Assert.assertEquals("LOG IN", lgnText);
		System.out.println("Login text assertion pass");
		loginButton.click();
		Thread.sleep(2000);
		
	}
	
	public void EnterEmailAndPassword()
	{
		emailTextField.sendKeys("arun.chauhan000@gmail.com");
		password.sendKeys("Qait@123");
		login.click();
		
		
	}
	
	
}
