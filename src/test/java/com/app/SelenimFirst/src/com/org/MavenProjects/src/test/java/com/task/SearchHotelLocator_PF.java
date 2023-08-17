package com.task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelLocator_PF extends LoginPageLocators_PF {
	public SearchHotelLocator_PF(){
		PageFactory.initElements(driver, this);
		
	}
	
@FindBy(id="location")
private WebElement location;

@FindBy(id="hotels")
private WebElement hotels;

@FindBy(id="room_type")
private WebElement room_type;

@FindBy(name="room_nos")
private WebElement room_nos;

@FindBy(xpath="//input[@name='datepick_in']")
private WebElement checkInDate;

@FindBy(xpath="//input[@name='datepick_out']")
private WebElement checkOutDate;

@FindBy(id="adult_room")
private WebElement adultsPerRoom;

@FindBy(id="child_room")
private WebElement childrenPerRoom;

@FindBy(xpath="//input[@type='submit']")
private WebElement search;

public WebElement getLocation() {
	return location;
}

public void setLocation(WebElement location) {
	this.location = location;
}

public WebElement getHotels() {
	return hotels;
}

public void setHotels(WebElement hotels) {
	this.hotels = hotels;
}

public WebElement getRoom_type() {
	return room_type;
}

public void setRoom_type(WebElement room_type) {
	this.room_type = room_type;
}

public WebElement getRoom_nos() {
	return room_nos;
}

public void setRoom_nos(WebElement room_nos) {
	this.room_nos = room_nos;
}

public WebElement getCheckInDate() {
	return checkInDate;
}

public void setCheckInDate(WebElement checkInDate) {
	this.checkInDate = checkInDate;
}

public WebElement getCheckOutDate() {
	return checkOutDate;
}

public void setCheckOutDate(WebElement checkOutDate) {
	this.checkOutDate = checkOutDate;
}

public WebElement getAdultsPerRoom() {
	return adultsPerRoom;
}

public void setAdultsPerRoom(WebElement adultsPerRoom) {
	this.adultsPerRoom = adultsPerRoom;
}

public WebElement getChildrenPerRoom() {
	return childrenPerRoom;
}

public void setChildrenPerRoom(WebElement childrenPerRoom) {
	this.childrenPerRoom = childrenPerRoom;
}

public WebElement getSearch() {
	return search;
}

public void setSearch(WebElement search) {
	this.search = search;
}














}
