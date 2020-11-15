package credits;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

/**
 * Read from list and output in JSON file
 * 
 * @author arselanalvi
 *
 */
public class JSONOutput extends OutputParser {
	
	String JUnitTestString;

	public JSONOutput(ArrayList<Creditcard> c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	public void out() {

		Gson gson = new Gson();

		JsonElement element = gson.toJsonTree(c, new TypeToken<ArrayList<Creditcard>>() {
		}.getType());

		if (!element.isJsonArray()) {
			// fail appropriately

		}

		JsonArray jsonArray = element.getAsJsonArray();
		JsonArray newArray = new JsonArray();

		newArray.addAll(jsonArray);
		JUnitTestString=jsonArray.get(0).toString();

		/*
		for (int i = 0; i < jsonArray.size() - 1; i++) {
			System.out.println(jsonArray.get(i).toString() + ",\n");
		}
		*/

		FileWriter file;
		try {
			String name=Test.outputfile;
			file = new FileWriter(name);

			file.write("[\n");

			for (int i = 0; i < jsonArray.size() - 1; i++) {
				file.write(jsonArray.get(i).toString() + ",\n");
			}

			file.write(jsonArray.get(jsonArray.size() - 1).toString() + "\n");

			file.write("]\n");

			file.flush();
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
