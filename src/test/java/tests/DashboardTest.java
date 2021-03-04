package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.DashBoardPage;

public class DashboardTest extends TestBase {

	@Test
	public void initialPage() throws Exception {
		DashBoardPage dash = PageFactory.initElements(driver, DashBoardPage.class);
		dash.headerTest();
		dash.checkImage();

	}

}
