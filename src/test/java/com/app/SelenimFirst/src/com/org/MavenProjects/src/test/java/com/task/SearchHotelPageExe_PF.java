package com.task;

import com.mavn.BaseClass1;

public class SearchHotelPageExe_PF extends LoginPageExe_PF {

	public static void location_exe() {
		BaseClass1.select_Value_dropdown(new SearchHotelLocator_PF().getLocation(),"Sydney" );
	}
	public static void hotels_exe() {
		BaseClass1.select_Value_dropdown(new SearchHotelLocator_PF().getHotels(),"Hotel Creek");
		
	}
	public static void room_type_exe() {
		BaseClass1.select_Value_dropdown(new SearchHotelLocator_PF().getRoom_type(),"Standard" );
		
	}
	public static void room_nos_exe() {
		BaseClass1.select_Value_dropdown(new SearchHotelLocator_PF().getRoom_nos(),"2");
		
	}
	public static void checkInDate_exe() {
		BaseClass1.select_Value_dropdown(new SearchHotelLocator_PF().getCheckInDate(),"01/08/2023");
		
	}
	public static void checkOutDate_exe() {
		BaseClass1.select_Value_dropdown(new  SearchHotelLocator_PF().getCheckOutDate(), "02/08/2023");
	}
	public static void adultsPerRoom_exe() {
		
		BaseClass1.select_Value_dropdown(new SearchHotelLocator_PF().getAdultsPerRoom(), "2");
		
	}
	public static void childrenPerRoom_exe() {
		BaseClass1.select_Value_dropdown(new SearchHotelLocator_PF().getChildrenPerRoom(), "2");
		
	}
	public static void search_exe() {
		BaseClass1.clickValue(new SearchHotelLocator_PF().getSearch());
		
	}
}
