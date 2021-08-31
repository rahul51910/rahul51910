package Booksunit.Book;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import landingPage.LandingPage;
import net.bytebuddy.asm.Advice.Exit;

public class BookChoose extends SetGrade
{
	
	@Test
	
		public void Bookno() throws IOException, InterruptedException
		
		{
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
		
		
		// Choose book by no in all section

		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(5000);
		js.executeScript("document.querySelector('.fonts-loaded').scrollTop=500");
		

		String Bookno = prop.getProperty("BookNo");
		int i=Integer.parseInt(Bookno);
		int j=i/5;
		
		for(int k=0;k<j;k++)
		{
			driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[2]/div[4]/div[2]/div[3]/i")).click();
			
		}
	
	   driver.findElement(By.xpath("//*[@id='app']/main/div[2]/div[4]/div[2]/div[2]/div/div["+i+"]/div/div/div/div[2]")).click();
		 
	   
      // choose the book which have chapter and unit
	   
	   String Lastchno = prop.getProperty("howmanyChapter");

	   String StartCh = prop.getProperty("StartingChapter");
	   int Lc=Integer.parseInt(Lastchno);
	   int Ic=Integer.parseInt(StartCh);
	   
	   for(int C=Ic;C<Lc;C++)
	   {
		  driver.findElement(By.id("ROW "+"0"+C)).click();
		
		   Thread.sleep(3000);
		   
		   for(int T=0;T<20;T++)
		   {
			   
			   try {
				//   driver.findElement(By.id("ROW "+"0"+C)).click();
				   WebElement Topic = driver.findElement(By.id("ROW "+"1"+T));
				   
				 String TopicName1=Topic.getText();
				 Topic.click();
			
				   Thread.sleep(2000);
			    
			   }
			   catch (Exception e) {
				// TODO: handle exception
				   break;
				   
			}
			   
			 js.executeScript("document.querySelector('.coobo').scrollTop=800");  
			 
			  try
			  {
				  l.TopicTile().click();
			  }
			  catch (Exception e)
			  {
				  System.out.println("No Topic tile present for= "+ driver.findElement(By.id("ROW "+"1"+T)).getText());
			  }
			  try
			  {
				  l.PracticeHint().click();
			  }
			  catch (Exception e) {
				// TODO: handle exception
				  System.out.println("No QUestion is present= "+l.PracticeHint().getText()); 
			}
			  driver.navigate().back();
			  l.PracticeExit().click();
			  Thread.sleep(3000);
			  
			  driver.findElement(By.id("ROW "+"0"+C)).click();
			   Thread.sleep(3000);
		   }
		   
	   }
	   
	   
	   
	   
		}
	

}
