package com.task;

import com.mavn.BaseClass1;

public class PaymentLocator_PF_Exe extends ConfirmationLocator_PF_exe {
	
	public static void firstName() {
		BaseClass1.inputValues(new PaymentLocator_PF().getFirstName(),value);
		
	}
public static void lastName () {
	BaseClass1.inputValues(new PaymentLocator_PF().getLastName(), value);
		
	}

public static void address () {
	BaseClass1.inputValues(new PaymentLocator_PF().getAddress(), value);
	
}

public static void creditCard () {
	BaseClass1.inputValues(new PaymentLocator_PF().getCreditCard(), value);
	
}

public static void creditCardType () {
	BaseClass1.inputValues(new PaymentLocator_PF().getCreditCardType(), value);
		
}

public static void expiryMonth () {
	BaseClass1.inputValues(new PaymentLocator_PF().getExpiryMonth(), value);
	
}


}
