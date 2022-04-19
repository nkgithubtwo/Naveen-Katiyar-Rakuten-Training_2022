import static org.junit.Assert.*;

import org.junit.Test;

public class TestClass {

	@Test
	public void test() {
		Mathematics mathematics = new Mathematics();
		
		int result1 = mathematics.add(10, 20);
		int result2 = mathematics.subtract(20, 5);
		int result3 = mathematics.divide(20, 0);
		
		assertEquals(30, result1);
		assertEquals(15, result2);
		assertEquals(0, result3);
		
	}

}
