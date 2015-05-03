package ph.calculator.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ph.calculator.Functions;

public class FunctionsTest {

	@Test
	public void testAdd() {
		Double num1 = 324.3;
		Double num2 = 23423.6;
		
		Double result = Functions.add(num1, num2);
		assertTrue(result == num1 + num2);
	}

	@Test
	public void testSubtract() {
		Double num1 = 324.3;
		Double num2 = 23423.6;
		
		Double result = Functions.subtract(num1, num2);
		assertTrue(result == num1 - num2);
	}

	@Test
	public void testMultiply() {
		Double num1 = 324.3;
		Double num2 = 23423.6;
		
		Double result = Functions.multiply(num1, num2);
		assertTrue(result == num1 * num2);
	}

	@Test
	public void testDivide() {
		Double num1 = 324.3;
		Double num2 = 23423.6;
		
		Double result = Functions.divide(num1, num2);
		assertTrue(result == num1 / num2);
	}

}
