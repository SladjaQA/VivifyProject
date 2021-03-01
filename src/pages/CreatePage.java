package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreatePage {

	WebDriver driver;
	WebElement titleField;
	WebElement descriptionsField;
	WebElement imagesField;
	WebElement addImageBtn;
	WebElement submitBtn;
	WebElement cancelBtn;

	// Constuctor
	public CreatePage(WebDriver driver) {
		this.driver = driver;
	}

	// Getters
	public WebElement getTitleField() {
		return driver.findElement(By.id("title"));
	}

	public WebElement getDescriptionsField() {
		return driver.findElement(By.id("description"));
	}

	public WebElement getImagesField() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/form/div[3]/div/div/input"));
	}

	public WebElement getAddImageBtn() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/form/div[3]/button"));
	}

	public WebElement getSubmitBtn() {
		return driver.findElement(By.xpath("//button[contains(text(),'Submit')]")); // custom xpath
	}

	public WebElement getCancelBtn() {
		return driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")); // custom xpath
	}

	// Methods
	public void titleInsert(String title) {
		getTitleField().clear();
		getTitleField().sendKeys(title);
	}

	public void descriptionsInsert(String description) {
		getDescriptionsField().clear();
		getDescriptionsField().sendKeys(description);
	}

	public void imagesInsert(String url) {
		getImagesField().clear();
		getImagesField().sendKeys(url);
	}

	public void submitClick() {
		getSubmitBtn().click();
	}
}
