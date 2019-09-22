package com.devops.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invoke {

	@Test
	public void invokeApplication() {

		System.setProperty("webdriver.driver.chromedriver", "./Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.close();

	}

}
