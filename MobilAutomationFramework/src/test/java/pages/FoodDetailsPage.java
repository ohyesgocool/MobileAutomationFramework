package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;

public class FoodDetailsPage extends BasePage {

	public FoodDetailsPage(AndroidDriver<AndroidElement> driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.Button[@text='Delivery']")
	protected WebElement deliveryButton;

	@FindBy(xpath = "//android.widget.TextView[@text='Go Out']")
	protected WebElement goOutButton;

	@FindBy(xpath = "//android.widget.Button[@text='Apply']")
	protected WebElement applyButton;

	@FindBy(xpath = "//android.widget.Button[@text='Filters']")
	protected WebElement filterButton;

	@FindBy(xpath = "//android.widget.TextView[@text='Rating']")
	protected WebElement ratingButton;

	public void clickDropdown() {
		waitForElement(deliveryButton).click();
	}

	public void selectGoOut() {
		waitForElement(goOutButton).click();
	}

	public void ClickApply() {
		waitForElement(applyButton).click();
	}

	public void setRating() {

		waitForElement(filterButton).click();
		waitForElement(ratingButton).click();

		clickWithCoordinates(729, 1969, 729, 1172);
		waitForElement(applyButton).click();

	}

}
