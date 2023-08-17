package com.app.exe;
import org.junit.Test;

import com.app.pageexe.SearchHotelPageExe;


public class Exe_PF extends SearchHotelPageExe {

	@Test
	public void test1() {
		user();
		pass();
		loginbutton();
		location_exe();
	}
}
