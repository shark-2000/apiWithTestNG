package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class Driver {
	public static WebDriver d;

	public static WebDriver driver() throws IOException {
		return d;
	}
}
