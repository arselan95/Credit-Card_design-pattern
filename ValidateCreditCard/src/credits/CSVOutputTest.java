package credits;


import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CSVOutputTest {

	@Test
	void testOut() {
		
		Creditcard card1= new Creditcard("4120000000000","4/20/2030","Bob","V I S A");
		ArrayList<Creditcard> testlist=new ArrayList<Creditcard>();
		testlist.add(card1);
		
		CSVOutput co=new CSVOutput(testlist);
		co.out();
		
		String out="4120000000000,4/20/2030,Bob,V I S A";
		
		assert(out.equals(co.JunitTestString));
				

		
		//fail("Not yet implemented");
	}

}
