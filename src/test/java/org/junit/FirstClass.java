package org.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstClass {
	
	static WebDriver driver ;
	
	@BeforeClass
	public static void launchBrowser()
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
	}
	
	@AfterClass
	public static void closeProgram()
	{
		driver.close();
	}
	
	@Before
	public void openApplication()
	{
		driver.navigate().to("http://www.leafground.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void act()
	{
		WebElement edit = driver.findElement(By.xpath("//img[@class='wp-categories-icon svg-image']"));
		edit.click();
		
		WebElement heading = driver.findElement(By.xpath("//h1[@itemprop=\"name\"]"));
		String attribute = heading.getAttribute("value");
		System.out.println(attribute);
		
	}
	
	@After
	public void validation()
	{
		WebElement append = driver.findElement(By.xpath("//input[@value='Append ']"));
		String txName = append.getText();
		System.out.println(txName);
		boolean contains = txName.contains("TestLeaf");
		Assert.assertTrue(contains);
		Assert.assertEquals("TestLeaf", txName);
		
		
	}

}
