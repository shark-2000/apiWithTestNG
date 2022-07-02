package abstracted;


import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.parser.ParseException;
import org.testng.Assert;

import org.testng.annotations.Test;

import utils.ParsedAPIData;


public class CustomAnnotations {
	@Test(priority=1)
	public void assertAPI() throws IOException, ParseException {
		ArrayList<String> exp = new ArrayList<String>();
		exp.add("The Russian");
		exp.add("Just as I Am");
		exp.add("The Vanishing Half");
		exp.add("The Midnight Library");
		exp.add("Untamed");
		exp.add("Viscount Who Loved Me");
		Assert.assertEquals(exp, ParsedAPIData.bookTitles());
		exp.clear();

	}


}
