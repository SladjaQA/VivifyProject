package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	WebElement logInBtn;
	WebElement createGalleryBtn;
	WebElement logOut;
	WebElement myGalleriesBtn;
	
	// Constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// Getters
	
	public WebElement getLogOut() {
		return driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
	}

	public WebElement getMyGalleriesBtn() {
		return driver.findElement(By.xpath("//a[contains(text(),'All Galleries')]"));
	}

	public WebElement getLogInBtn() {
		return driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
	}

	public WebElement getCreateGalleryBtn() {
		return driver.findElement(By.xpath("//a[contains(text(),'Create Gallery')]"));
	}
	
	// Methods
	public void clickOnLogInBtn() {
		getLogInBtn().click();
	}

	public void clickOnCreateGalleryBtn() {
		getCreateGalleryBtn().click();
	}

	public void clickOnLogOut() {
		getLogOut().click();
	}
	
	public void clickOnMyGalleriesBtn() {
		getMyGalleriesBtn().click();
	}
}
