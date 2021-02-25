package com.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.project.pageobject.Homepage;
import com.project.pageobject.Loginpage;
import com.project.pageobject.Zohoapppage;

public class Testcase {

	public static void main(String[] args) {
		
	
		Homepage page = new Homepage();
		page.login();
		Loginpage log = new Loginpage();
		log.dologin("trainer", "selenium123");
		 Zohoapppage zoho = new  Zohoapppage();
		 zoho.gotoCRM();
		 
	}

}
