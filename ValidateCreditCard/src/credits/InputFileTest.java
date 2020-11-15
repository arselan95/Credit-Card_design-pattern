package credits;


import org.junit.jupiter.api.Test;

class InputFileTest {

	@Test
	void testDetermineInput() {
		String name1="Sample.xml";
		String name2="Sample.csv";
		
		
		Parser p1=new Parser(name1);
		InputFile i1=new InputFile(p1);
		i1.determineInput(name1);
		
		Parser p2= new Parser(name2);
		InputFile i2=new InputFile(p2);
		i2.determineInput(name2);
		
		assert(".xml".equals(i1.JUnitTestString));
		assert(".csv".equals(i2.JUnitTestString));
		
	}

}
