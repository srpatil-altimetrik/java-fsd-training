package com.JunitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorJunit {

	Calculator cal = new Calculator();

	@Test
	void add() {
		assertEquals(700, cal.add(300, 400));
	}
	
	@Test
	void sub() {
		assertEquals(300, cal.sub(500, 200));
	}

}
