package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException 
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("/home/rahul/eclipse-workspace/Book/src/main/java/Resources/data.properti");
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
	
		System.out.println(browserName);
		
		if(browserName.equals("chrome"))
		{

   	       System.setProperty("webdriver.chrome.driver", "/home/rahul/Downloads/chromedriver");
   	       driver = new ChromeDriver();
   	       
		}
		else if(browserName.equals("firefox"))
		{
			//write firefox path
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	
   	
		
	}

}
