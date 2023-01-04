package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
	WebElement usrname_Element;
	@FindBy(how=How.XPATH,using="//*[@id=\"password\"]") 
	WebElement password_Element;
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/form/div[3]/button") 
	WebElement Login_Element;
	
	
	public void insertUsername(String username) {
	usrname_Element.sendKeys(username);
		
	}

	public void insertPassword(String password) {
		password_Element.sendKeys(password);
		
	}
	public void elickSininButton() {
		Login_Element.click();
	}


}
