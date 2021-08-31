package Booksunit.Book;

import java.awt.Window;
import java.io.IOException;
import java.util.NavigableMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Resources.Base;
import landingPage.LandingPage;


public class Home extends Base
{
	@Test
	
	public void Basepagenavigation() throws IOException, InterruptedException
	{
		driver = initializeDriver();
		
		
		driver.get("https://staging-fiber-web.embibe.com/");
		driver.manage().window().maximize();
		LandingPage l =new LandingPage(driver);
		
	
		l.LinBtn().click();
		
		l.UsingPass().click();
		
		l.Username().sendKeys("rahulsingh.consultant@embibe.com");
		
		l.pass().sendKeys("rahul123");
		
		l.Signin().click();
		

		
		    
		}
		
		
		
		
		
	}
	
	


