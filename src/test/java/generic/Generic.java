package generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Generic {

	public static WebDriver driver;
	public void getDriver() throws IOException
	{
		Properties p=new Properties();
		FileInputStream fin=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\Automation\\src\\test\\java\\generic\\Property.properties");
		p.load(fin);
		String property=p.getProperty("url");

		System.setProperty("WebDriver.chrome.Driver", "C:\\Users\\admin\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(property);


	}

}


