package com.testvagrant.testcases;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

import java.io.IOException;

import java.net.URL;

public class TestBase {
	protected WebDriverWait wait;

	protected AndroidDriver<AndroidElement> driver;

	public AndroidDriver<AndroidElement> driverInitialize() throws IOException {

		File f = new File("app");
		File fs = new File(f, "zomato.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");

		capabilities.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		//timeout // auto grant permisson

		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		return driver;

	}

}
