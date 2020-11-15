package credits;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Read from CSV file and add records to list
 * 
 * @author arselanalvi
 *
 */
public class CSVParser extends Parser {

	public CSVParser(String file) {
		super(file);
		// TODO Auto-generated constructor stub
	}

	public void parse() {

		String line = "";
		String cvsSplitBy = ",";
		String number = "";
		String date = "";
		String name = "";

		try (BufferedReader br = new BufferedReader(new FileReader(this.file))) {

			int iteration = 0;

			while ((line = br.readLine()) != null) {

				if (iteration == 0) {
					iteration++;
					continue;
				}

				// use comma as separator
				String[] country = line.split(cvsSplitBy);

				number = new BigDecimal(country[0]).toPlainString();
				date = country[1];
				name = country[2];

				Creditcard credit = new Creditcard(number, date, name);

				super.addCard(credit);

				/*
				 * System.out.println(number); System.out.println(date);
				 * System.out.println(name); System.out.println(" "); System.out.println(" ");
				 */

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public ArrayList<Creditcard> getCards() {
		return super.getCards();
	}

}
