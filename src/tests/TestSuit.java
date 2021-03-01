package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSuit extends TestBase{

	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.navigate().to("https://gallery-app.vivifyideas.com/");
	}

	@Test(priority = 0)
	public void validCredentialsLogIn() throws InterruptedException {
		String eMail = excelReader.getCellData("Automation Data", 1, 3);
		String password = excelReader.getCellData("Automation Data", 2, 3);
		
		homePage.clickOnLogInBtn();
        logInPage.logIn(eMail, password);
		
		Assert.assertEquals(true, homePage.getLogOut().isDisplayed());
	}
	
	@Test(priority = 5)
	public void createGallery() throws InterruptedException {
		String title = excelReader.getCellData("Automation Data", 4, 3);
		String description = excelReader.getCellData("Automation Data", 5, 3);
		String url = excelReader.getCellData("Automation Data", 6, 3);
		
		homePage.clickOnCreateGalleryBtn();
		createPage.titleInsert(title);
		createPage.descriptionsInsert(description);
		createPage.imagesInsert(url);
		createPage.submitClick();
		
		String textForAssert = myGalleryPage.getGalleryTitle().getText();
		Assert.assertEquals(textForAssert, title);
		
	}
	
	@Test(priority = 10)
	public void findingMyGallery() throws InterruptedException {
		String AssertMessage = excelReader.getCellData("Automation Data", 4, 3);
		homePage.clickOnMyGalleriesBtn();
		myGalleryPage.ClickOnGalleryTitle();
		
		String textForAssert = myGalleryPage.getGalleryTitle().getText();
		Assert.assertEquals(textForAssert, AssertMessage);
	}
	
	@Test(priority = 15)
	public void logOut() throws InterruptedException {
		homePage.clickOnLogOut();
		
		Assert.assertEquals(true, homePage.getLogInBtn().isDisplayed());
	}
	
	@AfterMethod
	public void afterTest() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
}
