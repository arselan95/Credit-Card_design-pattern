package credits;
import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

class DiscoverTest {

	@Test
	void testCheckNumber() {
		String testnumber1 ="6010000000000000";
		String testnumber2 ="6011000000000000";
		
		

		Creditcard testcard1 = new Discover(testnumber1);
		assertEquals(false, testcard1.checkNumber(testnumber1));
		
		Creditcard testcard2 = new Discover(testnumber2);
		assertEquals(true, testcard2.checkNumber(testnumber2));
	}

}
