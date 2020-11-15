package credits;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Read from record and generate a CSV file
 * 
 * @author arselanalvi
 *
 */
public class CSVOutput extends OutputParser {

	String JunitTestString;

	public CSVOutput(ArrayList<Creditcard> c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	public void out() {

		String header = "CardNumber, ExpirationData, NameOfCardholder,TypeOfCard\n";

		String recordAsCsv = c.stream().map(Creditcard::toCsvRow)
				.collect(Collectors.joining(System.getProperty("line.separator")));

		// System.out.println(header.concat(recordAsCsv));
		JunitTestString = recordAsCsv;

		FileWriter file;
		try {
			String name=Test.outputfile;
			file = new FileWriter(name);
			file.write(header.concat(recordAsCsv));
			file.flush();
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
