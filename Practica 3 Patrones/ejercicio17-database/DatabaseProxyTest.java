package ar.edu.unlp.info.oo2.accesobd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseProxyTest {
	private DatabaseProxy dbproxy;
	
	@BeforeEach
	void setUp() {
		dbproxy = new DatabaseProxy();	
	}
	
	@Test
	void testGetSearchResults() {
		dbproxy.setAccess(false);
		assertNull(dbproxy.getSearchResults(null));
		dbproxy.setAccess(true);
		assertEquals(Arrays.asList("Spiderman", "Marvel"), this.dbproxy.getSearchResults("select * from comics where id=1"));
	    assertEquals(Collections.emptyList(), this.dbproxy.getSearchResults("select * from comics where id=10"));
	}
	@Test 
	void testInsertNewRow(){
		dbproxy.setAccess(false);
		assertEquals(0,dbproxy.insertNewRow(null));
		dbproxy.setAccess(true);
		assertEquals(3, this.dbproxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.dbproxy.getSearchResults("select * from comics where id=3"));
	}

}
