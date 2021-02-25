package com.project.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.basepagckage.Pageclass;

public class Zohoapppage extends Pageclass {
	
	
	
	public void gotochat() {
		driver.findElement(By.cssSelector(".zicon-apps-chat.zicon-apps-96")).click();
		
	}

	public void gotoCRM() {
		driver.findElement(By.cssSelector(".zicon-apps-crm.zicon-apps-96")).click();
		
	}
	
	public void gotoSalesIq() {
		driver.findElement(By.cssSelector(".zicon-apps-salesiq.zicon-apps-96")).click();
		
	}
	
	
}
