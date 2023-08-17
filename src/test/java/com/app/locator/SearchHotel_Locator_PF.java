package com.app.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel_Locator_PF extends LoginPageLocators_PF {

	public SearchHotel_Locator_PF() {
		PageFactory.initElements(driver, this);
	}
	

	public WebElement getLocation() {
		return location;
	}


	@FindBy(id="location")
	private WebElement location;
	
}
