package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.CreatePage;
import pages.LogInPage;
import pages.MyGalleryPage;
import pages.HomePage;

public class TestBase {

	HomePage homePage;
	WebDriver driver;
	ExcellReader excelReader;
	LogInPage logInPage;
	CreatePage createPage;
	MyGalleryPage myGalleryPage;

	@BeforeClass
	public void beforeClass() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.homePage = new HomePage(driver);
		this.excelReader = new ExcellReader("Test Data/GalleryApp Test Cases.xlsx");
		this.logInPage = new LogInPage(driver);
		this.createPage = new CreatePage(driver);
		this.myGalleryPage = new MyGalleryPage(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() throws IOException {
		driver.close();
		excelReader.fis.close();
		excelReader.wb.close();
	}

}