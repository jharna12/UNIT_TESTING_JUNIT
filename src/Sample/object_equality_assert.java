package Sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class object_equality_assert {

	@Test
	public void a_StringEquals() {    
	String first= "jharna";
	String second= "jharna";
		assertEquals("two strings",first,second);
	}
	@Test
	public void b_StringNotEquals() {    
	String first= "jharna";
	String second= "JHARNA";
		assertNotEquals("two strings",first,second);
	}
	@Test
	public void c_ObjectEquals() { 
		DataClass first = new  DataClass(42,"jharna");
		DataClass second = new  DataClass(42,"jharna");
			assertNotEquals("two objects",first,second);
	}
}
