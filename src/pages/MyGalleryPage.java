package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyGalleryPage {
	WebDriver driver;
	WebElement galleryTitle;
	
	//Constructor
	public MyGalleryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Getter
	public WebElement getGalleryTitle() {
		return driver.findElement(By.xpath("//a[contains(text(),'Bugs')]"));
	}
	
	//Method
	public void ClickOnGalleryTitle() {
		getGalleryTitle().click();
	}
	
	

}
