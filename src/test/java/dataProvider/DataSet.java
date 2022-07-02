package dataProvider;

import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;

import utils.ParsedAPIData;

public class DataSet {

	@DataProvider(name="books")
	public Object[] dp() throws IOException, ParseException {
		ArrayList<String> books = ParsedAPIData.bookTitles();
		Object[] bookObjects = books.toArray();
		return bookObjects;
	}
}
