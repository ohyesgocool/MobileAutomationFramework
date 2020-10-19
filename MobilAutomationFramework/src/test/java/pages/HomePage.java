package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class HomePage extends BasePage {

	public HomePage(AndroidDriver<AndroidElement> driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//android.widget.TextView[@text='More Filters']")
	protected WebElement moreFilters;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Great Offers']")
	protected WebElement greatOffers;
	
	@FindBy(xpath = "//android.widget.Button[@text='Apply']")
	protected WebElement applyButton;

	
	@FindBy(xpath = "//android.widget.LinearLayout[@index='11']")
	protected WebElement foodItem;
	
	public void openSeeMore() throws InterruptedException {
		Thread.sleep(5000);
		scrollAndClick("see more");
	}

	public void selectfoodItem() {
		waitForElement(foodItem).click();
	}
	
	public void ClickFiler() {
		scrollAndClick("Filters");
	}
	
	public void ClickMoreFilters() {
		waitForElement(moreFilters).click();
	}
	
	public void ClickGreatOffers() {
		waitForElement(greatOffers).click();
	}
	
	public void ClickApplyButton() {
		waitForElement(applyButton).click();
	}
	
	

}
