package credits;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import org.json.simple.JSONArray;

/**
 * Read from JSON file return list of records
 * 
 * @author arselanalvi
 *
 */
public class MyJSONParser extends Parser {

	public MyJSONParser(String file) {
		super(file);
		// TODO Auto-generated constructor stub
	}

	public void parse() {

		String number = "";
		String date = "";
		String name = "";

		JSONParser parser = new JSONParser();
		Object obj;
		try {
			obj = parser.parse(new FileReader(this.file));
			JSONArray jsonArray = (JSONArray) obj;

			for (int i = 0; i < jsonArray.size(); i++) {
				Object jsonObject1 = jsonArray.get(i);
				JSONObject jo = (JSONObject) jsonObject1;

				Long value1 = (long) jo.get("CardNumber");
				number = Long.toString(value1);
				date = (String) jo.get("ExpirationDate");
				name = (String) jo.get("NameOfCardholder");

				Creditcard credit = new Creditcard(number, date, name);

				super.addCard(credit);

				// System.out.println(number);
				// System.out.println(date);
				// System.out.println(name);
				// System.out.println(" ");

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<Creditcard> getCards() {
		return super.getCards();
	}

}
