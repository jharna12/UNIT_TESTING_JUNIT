package Sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class array_equality_asserts {
	@Test
	public void a_Equals() {    // when two arrays of same size and same object then assertEquals work
		int [] first= {1,2,3};
		int [] second= first;
		assertEquals("two arrays",first,second);
	}
	@Test
	public void a_ArrayEqualsFail() {   //when two arrays of same size but of different object then assertArrayEquals
		int [] first= {1,2,3};
		int [] second= {1,2,3};
		assertArrayEquals("two arrays",first,second);
	}
	@Test
	public void a_ArrayEqualsFailSize() {
		int [] first= {1,2,3};
		int [] second= {1,2};
		assertArrayEquals("two arrays",first,second);
	}
	@Test
	public void a_ArrayEqualsize() {
		int [] first= {1,2,3};
		int [] second= first;
		assertSame("two arrays",first,second);
	}
	
}

