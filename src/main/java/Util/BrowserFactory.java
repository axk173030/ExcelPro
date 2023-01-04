package Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	static WebDriver driver;
	static String browser;
	static String url;
	public static void readconfig() {
		Properties prop= new Properties();
	try {
		InputStream input = new FileInputStream("src\\main\\java\\config\\cofig.properties");
		prop.load(input);
		browser =prop.getProperty("browser");
		 url =prop.getProperty("url");
	}catch(IOException e) {
		e.printStackTrace();
	}
	
	}

	public static WebDriver init() {
		readconfig();
if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rsvac\\OneDrive\\Desktop\\SeleniumFeb2022\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
}else if (browser.equalsIgnoreCase("firefox")) {

	System.setProperty("webdriver.gecko.driver",
			"C:\\Users\\rsvac\\OneDrive\\Desktop\\geckodriver-v0.32.0-win32 (2)\\geckodriver.exe");
	driver = new FirefoxDriver();}

	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get(url);
		return driver;

	}

	public static void tearDown() {
		driver.close();
		driver.quit();
	}

}
