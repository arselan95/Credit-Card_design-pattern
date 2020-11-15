package credits;

import org.junit.jupiter.api.Test;

class CardTest {

	Creditcard c;

	@Test
	void testGetType() {

		String testnumber1 = "341000000000000";
		String testnumber2 = "4120000000000";
		String testnumber3 = "5410000000000000";
		
		String n4 = "3/4/56";
		String n5 = "6/8/79";
		String n6 = "3/4/99";
		
		String n7 = "bob";
		String n8 = "darth";
		String n9 = "sam";

		Card c1 = new Card(new Creditcard(testnumber1));
		Card c2 = new Card(new Creditcard(testnumber2));
		Card c3 = new Card(new Creditcard(testnumber3));

		c1.getType(testnumber1,n4,n7);
		c = new Amex(testnumber1);
		String testamex = "A M E R I C A N   E X P R E S S";
		assert (c1.creditcard.issuer.equals(testamex));

		c2.getType(testnumber2,n5,n8);
		c = new Visa(testnumber2);
		String testvisa = "V I S A";
		assert (c2.creditcard.issuer.equals(testvisa));

		c3.getType(testnumber3,n6,n9);
		c = new Mastercard(testnumber3);
		String testmaster = "M A S T E R - C A R D";
		assert (c3.creditcard.issuer.equals(testmaster));

	}

}
