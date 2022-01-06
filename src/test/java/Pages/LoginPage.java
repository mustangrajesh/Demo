package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		
		WebDriver driver;
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
		@FindBy(id = "email")
		private WebElement user;
		@FindBy(xpath = "//input[@value=\\\"Clear me!!\\\"]")
		private WebElement pass;
		
		public WebElement getUser() {
			return user;
		}
		public void setUser(WebElement user) {
			this.user = user;
		}
		public WebElement getPass() {
			return pass;
		}
		public void setPass(WebElement pass) {
			this.pass = pass;
		}
		


}
