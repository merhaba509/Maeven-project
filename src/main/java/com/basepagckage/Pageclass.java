package com.basepagckage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pageclass {
	public WebDriver driver;
	public Pageclass() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\excutable\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.zoho.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
