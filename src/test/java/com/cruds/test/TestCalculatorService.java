package com.cruds.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cruds.service.CalculatorService;

public class TestCalculatorService {

	@Test
	public void testAdd() {
		assertEquals(10, CalculatorService.add(5, 5));
	}

}
