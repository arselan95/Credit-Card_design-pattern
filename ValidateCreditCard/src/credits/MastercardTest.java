package credits;
import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

class MastercardTest {

	@Test
	void testCheckNumber() {
		

		String testnumber1 = "5410000000000000";
		String testnumber2 = "4120000000000";

		Creditcard testcard1 = new Mastercard(testnumber1);
		Creditcard testcard2 = new Mastercard(testnumber2);

		assertEquals(true, testcard1.checkNumber(testnumber1));

		assertEquals(false, testcard2.checkNumber(testnumber2));
		
	}

}
