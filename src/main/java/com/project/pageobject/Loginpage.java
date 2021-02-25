package com.project.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.basepagckage.Pageclass;

public class Loginpage extends Pageclass{
	
	
		
	
	
	
	public void dologin(String username , String password) {
		
		driver.switchTo().frame("zohoiam");
		driver.findElement(By.cssSelector("#lid")).sendKeys(username);
		driver.findElement(By.cssSelector("#pvd")).sendKeys(password);
		driver.findElement(By.cssSelector("#submit_but")).click();
		
	}

	public void gotosalesandmarketing() {
		
	}
	
	public void gotoFinance() {
		
	}
	
	
}
