package org.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgePro {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\N.rajesh\\.eclipse\\SeleniumPro\\chrome\\chromedriver.exe");
		 driver=new ChromeDriver();	
		}
	
	@AfterClass
	public static void closeProgram() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
	
	@Before
	public void openApplication()
	{
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
	}
	@Test
	public void loginPage()
	{
	
		WebElement log = driver.findElement(By.id("txtUsername"));
		log.sendKeys("Admin");
		WebElement pass = driver.findElement(By.id("txtPassword"));
		pass.sendKeys("admin123");
		WebElement logBtn = driver.findElement(By.id("btnLogin"));
		logBtn.click();
	}
	
	@After
	public void validation()
	{
		WebElement mar = driver.findElement(By.id("MP_link"));
		String text = mar.getText();
		System.out.println(text);
		String concat = text.concat("Marketplace");
		Assert.assertTrue(concat,true);
		
	}
	
	

}
