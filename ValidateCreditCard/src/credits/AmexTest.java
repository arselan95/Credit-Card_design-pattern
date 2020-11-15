package credits;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class AmexTest {

	@Test
	void testCheckNumber() {

		String testnumber1 = "341000000000000";
		String testnumber2 = "4120000000000";

		Creditcard testcard1 = new Amex(testnumber1);
		Creditcard testcard2 = new Amex(testnumber2);

		assertEquals(true, testcard1.checkNumber(testnumber1));

		assertEquals(false, testcard2.checkNumber(testnumber2));

	}

}
