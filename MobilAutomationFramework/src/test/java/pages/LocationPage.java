package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationPage extends BasePage {

	public LocationPage(AndroidDriver<AndroidElement> driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.Button[@text='Skip']")
	protected WebElement skipButton;

	@FindBy(xpath = "//android.widget.Button[@text='Set your location manually']")
	protected WebElement setLocation;

	@FindBy(xpath = "//android.widget.EditText[@text='Search for your location…']")
	protected WebElement searchLocation;

	@FindBy(xpath = "//android.widget.TextView[@text='Bangalore']")
	protected WebElement Bangalore;

	@FindBy(xpath = "//android.widget.Button[@text='Confirm location']")
	protected WebElement confirmLocation;

	public void clickOnSkipButton() {
		waitForElement(skipButton).click();

	}

	public void clickOnConfirmLocation() {
		waitForElement(confirmLocation).click();

	}

	public void selectLocation() {
		waitForElement(Bangalore).click();

	}

	public void clickOnSetLocationButton() {
		waitForElement(setLocation).click();

	}

	public void EnterLocation(String location) {

		waitForElement(searchLocation).sendKeys(location);

	}
	
	public void moveLocation() {
		
		driver.runAppInBackground(Duration.ofSeconds(10));

		/*
		 * DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		 * desiredCapabilities.setCapability("browserstack.gpsLocation",
		 * "12.974230,77.595654");
		 */
		
		Location loc = new Location(12.974230, 77.595654, 0);  // latitude, longitude, altitude
		
		driver.setLocation(loc);
		
	}

}
