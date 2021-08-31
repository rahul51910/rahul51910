package landingPage;

import java.io.FileInputStream;
import java.security.PublicKey;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage
{
	public WebDriver driver;
	
	
	
	By LoginBtn = By.xpath("//*[@id=\"app\"]/main/div[2]/div[1]/div[1]/div/div/div[2]/div/div[2]/button[2]");
	
	By Usingpass = By.xpath("//*[@id=\"app\"]/main/div/div[1]/div/div[2]/div/button/span/span");
	
	By Username = By.xpath("//*[@id=\"app\"]/main/div/div[1]/div/form/div[1]/div/div/div/div/div/input");
	
	By Passw = By.xpath("//*[@id=\"app\"]/main/div/div[1]/div/form/div[2]/div/div/div/div/div[1]/input");
	
	By Signin = By.xpath("//*[@id=\"app\"]/main/div/div[1]/div/form/div[4]/div/button");
	
	By learn = By.xpath("//*[text()='Practice']");
	
	By CilckGrade = By.xpath("//*[@id=\"app\"]/main/div[2]/div[1]/div[2]/div/div/button");
	
	By next =By.xpath("//*[text()='Next']");
	
	By done = By.xpath("//*[text()='Done']");
	
	By Back = By.xpath("//*[@id='app']/main/div/div[2]/i");
	
	By next1 = By.xpath("//*[@id='app']/main/div/div[2]/div[2]/div/div[4]/button");
	
	By topictile = By.cssSelector(".practice-image");
	
	By Practicehint = By.xpath("//*[@id='PracticeConatiner']/div/section[1]/div[1]/div[1]/div[1]");
	
	By Practicexit= By.xpath("//*[text()='End Session']");
	
	By test = By.xpath("//*[text()='Test']");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		
		this.driver=driver;
	}


	public WebElement LinBtn()
	{
		return driver.findElement(LoginBtn);
	}
	
	public WebElement UsingPass()
	{
		return driver.findElement(Usingpass);
	}
	
	public WebElement Username() 
	{
		return driver.findElement(Username);
	}
	
	public WebElement pass()
	{
		return driver.findElement(Passw);
	}
	
	public WebElement Signin()
	{
		return driver.findElement(Signin);
	}
	
	public WebElement LearnClick()
	{
		return driver.findElement(learn);
	}
	public WebElement ClkGrade()
	{
		return driver.findElement(CilckGrade);
	}
	public WebElement Next()
	{
		return driver.findElement(next);
	}
	public WebElement Done()
	{
	    return driver.findElement(done);
	
	}
	public WebElement back()
	{
		return driver.findElement(Back);
	}
	public WebElement Next1()
	{
		return driver.findElement(next1);
	}
	public WebElement TopicTile()
	{
		return driver.findElement(topictile);
	}
	public WebElement PracticeHint()
	{
		return driver.findElement(Practicehint);
	}
	public WebElement PracticeExit()
	{
		return driver.findElement(Practicexit);
	}
	public WebElement Test()
	{
		return driver.findElement(test);
	}
	
		
	
		
}
	
