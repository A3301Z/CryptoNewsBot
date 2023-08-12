package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneNumberHandlerTest {
	String phoneNumber = "89887317534";

	@Test
	public void isItNumberTest() {
		Assertions.assertTrue(PhoneNumberHandler.isItPhoneNumber(phoneNumber));
		System.out.println();
	}
}
