package Sample;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anything;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class combinational_collection_assert {

	@Test
	public void a_StringMatchers() {  
		String tested="TEKSYSTEMS";
		String check ="EKS";
		assertThat("MATCHING",tested, anything(check));
	}
	@Test
	public void b_NullMatchers() {  
		String tested=null;
		assertThat(" Null MATCHING",tested,nullValue());
	}
	@Test
	public void c_NotNullMatchers() {  
		String tested="";
		assertThat(" Null MATCHING",tested,notNullValue());
	}
	@Test
	public void d_STRINGSameMatchers() {  
		String tested="jharna";
		String check="jharna";
		assertThat(" MATCHING",tested,is(check));
	}
	@Test
	public void e_STRINGNotSameMatchers() {  
		String tested="jharna";
		String check="jharna1234";
		assertThat(" MATCHING",tested,not(check));
	}
	//--------------------------------combination assert---------------------------------
	@Test
	public void f_CombinationSTRINGNotSameMatchers() {  
		String tested="!!!!jharna@";
			assertThat(" MATCHING",tested,allOf(startsWith("!"),endsWith("@")));
					
	}
	//-------------------------------Collection Assert---------------------
	
	@Test
	public void f_CoLLECTIONSTRINGSameMatchers() {  
	String[] testArray= {"a","b","c"};
	Collection<String> tested=Arrays.asList(testArray);
	assertThat("MATCHES" ,tested, hasItem("b"));
}
	@Test
	public void g_CoLLECTIONSTRINGSameMatchers() {
	String[] testArray={"mate","rate"};
	Set<String> tested=new HashSet<String>(Arrays.asList(testArray));
	assertThat(tested,hasItem(endsWith("ate")));
	}
	
	@Test
	public void h_CoLLECTIONSTRINGSameMatchers() {
	String[] testArray={"teksystems","tekstsav"};
	Set<String> tested=new HashSet<String>(Arrays.asList(testArray));
	assertThat(tested,hasItem(startsWith("tek")));
	}

}
