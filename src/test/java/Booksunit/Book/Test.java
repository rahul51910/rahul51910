package Booksunit.Book;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;

import landingPage.LandingPage;

public class Test extends SetGrade
{
	
	@BeforeTest
	
	public void TestCheck() throws IOException, InterruptedException
	{
		System.out.println(".................................................");
        driver = initializeDriver();
		
		
		LandingPage l = new LandingPage(driver);
	//	driver.get("https://embibe.com/");
		driver.get("https://staging-fiber-web.embibe.com/");
		driver.manage().window().maximize();
		
		

		l.LinBtn().click();
		
		l.UsingPass().click();
		
		l.Username().sendKeys("rahulsingh.consultant@embibe.com");
		
		l.pass().sendKeys("rahul123");
		
		l.Signin().click();
		
		l.LearnClick().click();
		System.out.println("mncbv");
		
		// Give the details of grade and Board
		
		l.ClkGrade().click();
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("/home/rahul/eclipse-workspace/Book/src/main/java/Resources/data.properti");
		prop.load(fis);
		
		String Boardname = prop.getProperty("BoardName");
		String grade1=prop.getProperty("Grade");
		String Grade=grade1+"th"+" "+Boardname;
		
		
		driver.findElement(By.xpath("//*[text()='"+Boardname+"']")).click();
		
		
		try
		{
			
			l.Next1().click();
		}
		
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		driver.findElement(By.xpath("//*[text()='"+Grade+"']")).click();
		
		
		l.Next().click();

		
		l.Done().click();
		l.Test().click();
		// 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
		
	}
	
	
	

}
