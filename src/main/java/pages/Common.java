package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.BrowserMgr;
import utils.ConfigurationReader;

public class Common {
	public static WebDriver driver;
	public static WebElement element;

	public static void openURL() throws IOException {
		driver = BrowserMgr.setProperty(driver, ConfigurationReader.readFileBrwoserProperty());
		driver.get(ConfigurationReader.readFileBaseURLProperty());
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	public static WebElement inputBox(WebDriver driver) {
		String id = "twotabsearchtextbox";
		element = driver.findElement(By.id(id));
		return element;
	}

	public static void searchBooks(String product) {
		Common.inputBox(driver).sendKeys(product + Keys.ENTER);
		Common.inputBox(driver).clear();
		Common.driver.close();
	}

}
