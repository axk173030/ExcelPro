package Pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCutomerPage extends BasePage {
	WebDriver driver;

	public AddCutomerPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5")
	WebElement Add_contact_header;

	public void validateaddContactPage(String addContactHeader) {
		Assert.assertEquals(Add_contact_header.getText(), addContactHeader, "Add Contact Page is not available");
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement Add_furtname_Element;

	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
	WebElement compant_Name_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement Add_Email_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement Add_Phone_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]")
	WebElement Add_Address_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]")
	WebElement Add_City_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"state\"]")
	WebElement Add_State_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"zip\"]")
	WebElement Add_Zip_Element;

	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]")
	WebElement Add_Country_Element;

	@FindBy(how = How.XPATH, using="//*[@id=\"submit\"]")
	WebElement SaveButton_Element;
	


	public void insertFirstName(String fullName) {
		int genNum = generateRandomNo(999);
		Add_furtname_Element.sendKeys(fullName + genNum);

	}

	public void SelectCompanyName(String company) {

		selectFromDropDown(compant_Name_Element, company);

	}

	public void insertEmail(String emailaddress) {
		Add_Email_Element.sendKeys(emailaddress);

	}

	public void insertPhoneNumber(String phoneNO) {
		Add_Phone_Element.sendKeys(phoneNO+generateRandomNo(999));

	}
	public void insertAddress(String Address) {
		Add_Address_Element.sendKeys(Address);
		
	}
	public void insertCity(String city) {
		Add_City_Element.sendKeys(city);
	}
	public void insertState(String state) {
		Add_State_Element.sendKeys(state);
		
	}
	public void insertZip(String zip) {
		Add_Zip_Element.sendKeys(zip);
	}
	public void selectCountry( String country) {
		selectFromDropDown( Add_Country_Element, country);
		
	}
	public void clickonSaveButton() {
		SaveButton_Element.click();
		
	}
}
