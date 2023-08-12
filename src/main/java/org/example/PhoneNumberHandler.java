package org.example;

public class PhoneNumberHandler {
	public static boolean isItPhoneNumber(String number) {

		char[] chars = number.trim().toCharArray();
		boolean isNumber = false;
		if (chars[0] == 8 && chars.length == 11) {
			isNumber = true;
		} else if (chars[0] == 7 && chars.length == 11) {
			isNumber = true;
		}
		return isNumber;
	}
}
