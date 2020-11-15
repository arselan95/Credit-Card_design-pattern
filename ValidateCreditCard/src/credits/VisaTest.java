package credits;
import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

class VisaTest {

	@Test
	void testCheckNumber() {
		String testnumber1 = "341000000000000";
		String testnumber2 = "4120000000000";

		Creditcard testcard1 = new Visa(testnumber1);
		Creditcard testcard2 = new Visa(testnumber2);

		assertEquals(false, testcard1.checkNumber(testnumber1));

		assertEquals(true, testcard2.checkNumber(testnumber2));

	}
	}


