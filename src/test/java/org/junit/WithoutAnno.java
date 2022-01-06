package org.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WithoutAnno {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\N.rajesh\\.eclipse\\SeleniumPro\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
		WebElement log = driver.findElement(By.id("txtUsername"));
		log.sendKeys("Admin");
		WebElement pass = driver.findElement(By.id("txtPassword"));
		pass.sendKeys("admin123");
		WebElement logBtn = driver.findElement(By.id("btnLogin"));
		logBtn.click();
		
		WebElement mar = driver.findElement(By.id("welcome"));
		String text = mar.getText();
		System.out.println(text);
		String concat = text.concat("Welcome Paul");
		Assert.assertTrue(concat,true);
		
		driver.close();


	}

}
