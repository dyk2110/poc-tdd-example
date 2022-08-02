package com.tdd.poc;

public class LeapYearExample {
	public static boolean checkLeapYear(int year) {
		boolean result = false;
		if (year % 100 == 0 && year % 400 != 0) {
			result = false;
		} else if (year % 4 == 0)
			result = true;
		return result;
	}

}
