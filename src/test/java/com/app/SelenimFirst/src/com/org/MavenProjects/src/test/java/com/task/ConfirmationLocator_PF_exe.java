package com.task;

import com.mavn.BaseClass1;

public class ConfirmationLocator_PF_exe extends SearchHotelLocator_PF {
	
	public static void select() {
		BaseClass1.clickValue(new ConfirmationLocator_PF().getSelect());
		
	}
	public static void next() {
		BaseClass1.clickValue(new ConfirmationLocator_PF().getNext());
		
	}

}
