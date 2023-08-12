package org.example;

public class PhoneNumberHandler {
	public static void main(String[] args) {
		String phoneNumber = "89887317534";

		System.out.println(isItPhoneNumber(phoneNumber));
	}
	public static boolean isItPhoneNumber(String number) {

		char[] chars = number.trim().toCharArray();
		int integer = Integer.parseInt(String.valueOf(chars[0]));

		if (integer == 8 && chars.length == 11) {
			return true;
		} else if (integer == 7 && chars.length == 11) {
			return true;
		}
		return false;
	}
}
