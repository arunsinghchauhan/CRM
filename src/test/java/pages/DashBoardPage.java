package pages;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import tests.TestBase;

public class DashBoardPage extends TestBase {

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//a[text()='About']")
	WebElement aboutLink;
	@FindBy(xpath = "//a[text()='Zoom Video']")
	WebElement zoomLink;
	@FindBy(xpath = "//a[text()='Compare']")
	WebElement compareLink;
	@FindBy(xpath = "//a[text()='Pricing']")
	WebElement pricingLink;
	@FindBy(xpath = "(//span[@class='rd-navbar-submenu-toggle'])[2]")
	WebElement appsDropdown;
	@FindBy(xpath = "//a[text()='Android']")
	WebElement dropdownTextAndroid;

	@FindBy(xpath = "(//span[@class='rd-navbar-submenu-toggle'])[1]")
	WebElement crmDropdown;
	@FindBy(xpath = "//a[text()='CRM for Any Business']")
	WebElement dropdownTextCrmAnyBusiness;

	@FindBy(xpath = "//a[text()='CRM']")
	WebElement crmText;

	@FindBy(xpath = "//a[text()='Apps']")
	WebElement appsText;

	@FindBy(xpath = "//a[text()='Support']")
	WebElement supportLink;

	public void headerTest() {
		aboutLink.click();
		driver.navigate().back();
		String about = aboutLink.getText();
		// System.out.println(about);
		assertEquals(about, "ABOUT");
		System.out.println("About link assertion pass");

		compareLink.click();
		driver.navigate().back();
		String comp = compareLink.getText();
		assertEquals("COMPARE", comp);
		System.out.println("Compare link assertion pass");

		pricingLink.click();
		driver.navigate().back();
		String price = pricingLink.getText();
		assertEquals("PRICING", price);
		System.out.println("Price link assertion pass");

		zoomLink.click();
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		driver.close();
		driver.switchTo().window(tabs2.get(0));
		String zoom = zoomLink.getText();
		assertEquals("ZOOM VIDEO", zoom);
		System.out.println("Zoom Video link assertion pass");

		appsDropdown.click();
		String apps = appsText.getText();
		assertEquals(apps, "APPS");
		dropdownTextAndroid.click();
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(1));
		driver.close();
		driver.switchTo().window(tabs1.get(0));
		System.out.println("Apps text assertion pass");

		crmDropdown.click();
		dropdownTextCrmAnyBusiness.click();
		String crm = crmText.getText();
		assertEquals("CRM", crm);
		System.out.println("CRM text assertion pass");

		supportLink.click();
		ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs3.get(1));
		driver.close();
		driver.switchTo().window(tabs3.get(0));
		String support = supportLink.getText();
		assertEquals("SUPPORT", support);
		System.out.println("support text assertion pass");
	}
		//image verfication
		public void checkImage() throws Exception {
			WebElement ImageFile = driver.findElement(By.xpath("//img[@alt='iTunes']"));

			    Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
			    if (!ImagePresent)
			    {
			         System.out.println("App Store Image not displayed.");
			    }
			    else
			    {
			        System.out.println("App Store Image displayed.");
			    }
			}

	}


