package com.task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationLocator_PF extends SearchHotelLocator_PF {

	public ConfirmationLocator_PF() {
		PageFactory.initElements(driver, this);
	}
	
	
  @FindBy(id="radiobutton_0")
  private WebElement select;
  
  @FindBy(id="continue")
  private WebElement next;

public WebElement getSelect() {
	return select;
}

public void setSelect(WebElement select) {
	this.select = select;
}

public WebElement getNext() {
	return next;
}

public void setNext(WebElement next) {
	this.next = next;
}
  
	
}
