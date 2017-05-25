package APIValidation;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

import javax.xml.parsers.ParserConfigurationException;

import org.json.simple.JSONArray;
import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import com.IO.Xls_Reader;

public class tmoCheck {
@Test
	public static void main() throws ParserConfigurationException, SAXException, IOException, JSONException, ParseException {
		
		//Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"\\APIAutomation\\config\\TestData.xlsx");
		//String sresourceURL= xls.getCellData("Input", "Resource URL", 2);
		
			
		WebDriver driver =  new FirefoxDriver();
		String sresourceURL = "https://google.com";
	
		driver.manage().window().maximize();
		driver.get(sresourceURL);
		
	}
	
}
