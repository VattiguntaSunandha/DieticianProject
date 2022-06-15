package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	WebDriver driver;

	public SignInPage(WebDriver driver) {
		
		//Constructor of the page class
		this.driver=driver;
		try {
			PageFactory.initElements(driver, this);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//Swati's SignInPage.java code will come here.
	

}
