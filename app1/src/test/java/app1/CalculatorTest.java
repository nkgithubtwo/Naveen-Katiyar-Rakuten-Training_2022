package app1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCheckEven() {
		Calculator obj = new Calculator();
		 int res = obj.checkEven(230);
		 assertEquals(1 , res);
	}

}
