package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	static WebDriver driver;
	
	public static WebDriver openBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		return driver;
	}
	public void mini()
	{
		driver.manage().window().minimize();
	}
	
	public void maxi()
	{
		driver.manage().window().maximize();
		
	}
	
	public void openUrl(String url)
	{
		driver.get(url);
	}
	
	public void send(WebElement element,String value)
	{
		element.sendKeys(value);
	}
	
	public void tap(WebElement element)
	{
		element.click();
	}
	public void navigate(String url)
	{
		driver.navigate().to(url);
		
	}

}
