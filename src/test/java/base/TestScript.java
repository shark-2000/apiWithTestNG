package base;

import java.io.IOException;

import org.testng.annotations.Test;

import abstracted.CustomAnnotations;
import dataProvider.DataSet;
import pages.Common;

public class TestScript extends CustomAnnotations {
	@Test(priority = 2, dependsOnMethods = { "assertAPI" }, dataProvider = "books", dataProviderClass = DataSet.class)
	public void f(String products) throws IOException {
		Common.openURL();
		Common.searchBooks(products);
	}
}
