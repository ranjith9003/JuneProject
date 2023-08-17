package com.task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mavn.BaseClass1;

public class LoginPageLocators_PF extends BaseClass1 {
	public LoginPageLocators_PF() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id= "username")
	private WebElement username;
	
	@FindBy(id= "password")
	private WebElement password;
	
	@FindBy(id= "login")
	private WebElement login;

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}
	
}
	
	
	
	
	
		
		

