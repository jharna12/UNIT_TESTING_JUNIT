package Sample;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class timeout_ordering {

	@Test
	public void a_test() {
		assertTrue(true);
		System.out.println(" a_executed");
	}
	@Test
	public void c_test() {
		assertTrue(true);
		System.out.println(" c_executed");
	}
	@Test
	public void b_test() {
		assertTrue(true);
		System.out.println(" b_executed");
	}
	@Test
	public void e_test() {
		assertTrue(true);
		System.out.println(" e_executed");
	}
	
	@Test
	public void d_test() {
		assertTrue(true);
		System.out.println(" d_executed");
	}

}
