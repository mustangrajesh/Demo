package org.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.BaseClass;

public class NewProgram extends BaseClass {

	static WebDriver driver;
	static LoginPage lp;
	
	@BeforeClass
	public static void openBrowser()
	{
		driver=openBrowser("chrome");
		lp=new LoginPage(driver);
	}
	@AfterClass
	public static void closeProgram() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
		
	}
	@Before
	public void lunchBrowser()
	{
		openUrl("https://www.google.co.in/");
		maxi();
		navigate("http://www.leafground.com/pages/Edit.html");
	}
		
	@Test
	public void findingElements()  
	{
		send(lp.getUser(), "rajesh@gmail.com");
		
		send(lp.getPass(),"Afjkj");
		
		/*WebElement login = driver.findElement(By.id("btnLogin"));
		tap(login);*/
	}
	
	/*@After
	
	public void validation()
	{
		WebElement valid = driver.findElement(By.id("welcome"));
		String text = valid.getText();
		boolean contains = text.contains("Welcome Paul");
		Assert.assertTrue(contains);
	}*/
	
}
