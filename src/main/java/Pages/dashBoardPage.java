package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class dashBoardPage {

	WebDriver driver;

	public dashBoardPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2")
	WebElement dashBoard_Element;
	
	@FindBy(how =How.XPATH, using ="//*[@id=\"side-menu\"]/li[3]/a") WebElement customer_menu_Element;
@FindBy(how =How.XPATH,using="//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")WebElement Add_customer_menu_Element;
	
@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a") WebElement List_Customer_Element;



public void validateDashBoard(String validationText) {
		Assert.assertEquals(dashBoard_Element.getText(), validationText, "dash not available");
	}
		public void clickcustomerMentElement1() {
			customer_menu_Element.click();
		}
	public void clickAddcustomerMentElement() {
		Add_customer_menu_Element.click();
	
		
	}public void clickLIstCustomer() {
		List_Customer_Element.click();
		
	}
}
