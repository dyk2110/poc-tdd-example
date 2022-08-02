package com.tdd.poc.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.tdd.poc.LeapYearExample;

public class LeapYearExampleTest {
	
	@Test
	public void check_2022_year() {
		assertFalse(LeapYearExample.checkLeapYear(2022));
	}

	@Test
	public void check_2020_year() {
		assertTrue(LeapYearExample.checkLeapYear(2020));
	}

	@Test
	public void check_1900_year() {
		assertFalse(LeapYearExample.checkLeapYear(1900));
	}

	@Test
	public void check_2000_year() {
		assertTrue(LeapYearExample.checkLeapYear(2000));
	}

}
