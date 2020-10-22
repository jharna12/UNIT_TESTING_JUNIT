package Sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class number_equality_assert {
	@Test                    // integer equality asserts
	public void a_integerEqualAsserts() {
		short shortValue=10;
		int intValue=10;
		assertEquals("any two integer  Values", intValue,shortValue);
		
	}
	@Test
	public void b_floatingEqualAsserts() {
		double doubleValue=0.3;
				assertEquals("any two double  Values", doubleValue,doubleValue,0.00000001);
				float floatValue=0.3f;
				assertEquals("any two float Values", floatValue, floatValue,0.00000001);
		
	}

	@Test
	public void c_NotEquals() {
		double doubleValue=0.3;
		double secondValue=0.30000000000001;
				assertNotEquals("Not equals Values", doubleValue,secondValue);
	}


}
