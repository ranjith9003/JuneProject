package com.task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentLocator_PF extends LoginPageLocators_PF {
	
	
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement address;
	
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement creditCard;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement creditCardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement expiryMonth;
	
	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(WebElement address) {
		this.address = address;
	}

	public WebElement getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(WebElement creditCard) {
		this.creditCard = creditCard;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(WebElement creditCardType) {
		this.creditCardType = creditCardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(WebElement expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(WebElement expiryYear) {
		this.expiryYear = expiryYear;
	}

	public WebElement getCvvType() {
		return cvvType;
	}

	public void setCvvType(WebElement cvvType) {
		this.cvvType = cvvType;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public void setBookNow(WebElement bookNow) {
		this.bookNow = bookNow;
	}

	@FindBy(id="cc_exp_year")
	private WebElement expiryYear;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cvvType;
	
	@FindBy(id="book_now")
	private WebElement bookNow;
}
