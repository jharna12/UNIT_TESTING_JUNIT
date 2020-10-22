package Sample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class fixed_setup_fixtures {


	@BeforeClass
	public  static void before_Class() {
		System.out.println(" Before class executed");
	}

	@Before
	public void before() {
		System.out.println(" Before executed");
	}
	
	@Test
	public void sample_test() {
		assertTrue(true);
		System.out.println(" test_executed");
	}
	
		@AfterClass
		public  static void afterClass() {
			System.out.println("After class executed");
		}
	
	@After
	public void after() {
		System.out.println("After_executed");
	}
}
