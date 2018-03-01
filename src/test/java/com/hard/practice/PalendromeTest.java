package com.hard.practice;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PalendromeTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public PalendromeTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(PalendromeTest.class);
	}

	public void testWithEmpty() {
		Palinedrome p = new Palinedrome();
		assertTrue(p.isPalindrome(""));
	}

	public void testWithValidPlindrome() {
		Palinedrome p = new Palinedrome();
		assertTrue(p.isPalindrome("1234554321"));
	}

	public void testWithInValidPlindrome() {
		Palinedrome p = new Palinedrome();
		assertFalse(p.isPalindrome("12345522342"));
	}
}
