package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locator.SearchHotel_Locator_PF;

public class SearchHotelPageExe extends LoginPageExe_PF{

	public static void location_exe() {
		BaseClass.select_Value_dropdown(new SearchHotel_Locator_PF().getLocation(), "Sydney");
	}
}
