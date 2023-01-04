package PageTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.AddCutomerPage;
import Pages.LoginPage;
import Pages.dashBoardPage;
import Util.BrowserFactory;
import Util.ExcelReader;

public class AddCustomerTest {
	WebDriver driver;
	
	ExcelReader exlRead= new ExcelReader("src\\main\\java\\Pages\\testData\\testData.xlsx");
	
	String username=exlRead.getCellData("Logininfo", "userName", 2);
	String password= exlRead.getCellData("Logininfo", "password", 2);
	String fullName=exlRead.getCellData("AddContact", "FullName", 2);
	String companyName=exlRead.getCellData("AddContact", "CompanyName", 2);
	String email=exlRead.getCellData("AddContact", "Email", 2);
	String phone=exlRead.getCellData("AddContact", "Phone", 2);
	String address=exlRead.getCellData("AddContact", "Address", 2);
	String city=exlRead.getCellData("AddContact", "City", 2);
	String country=exlRead.getCellData("AddContact", "Country", 2);
	String state=exlRead.getCellData("AddContact", "State", 2);
	String zip=exlRead.getCellData("AddContact", "Zip", 2);

	
	
	@Test
	public void userShouldBeAbleToAddCustomer() throws InterruptedException {
		driver = BrowserFactory.init();

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.insertUsername(username);
		Thread.sleep(2000);
		loginpage.insertPassword(password);
		Thread.sleep(2000);
		loginpage.elickSininButton();

		dashBoardPage dpage = PageFactory.initElements(driver, dashBoardPage.class);
		dpage.validateDashBoard("Dashboard");
		Thread.sleep(2000);
		dpage.clickcustomerMentElement1();
		Thread.sleep(2000);
	    dpage.clickAddcustomerMentElement();
	    Thread.sleep(2000);
	    
		AddCutomerPage acp = PageFactory.initElements(driver, AddCutomerPage.class);
		
		acp.insertFirstName(fullName);
		Thread.sleep(2000);
	
		acp.SelectCompanyName(companyName);
		Thread.sleep(2000);
		acp.insertEmail(email);
		Thread.sleep(2000);
		acp.insertPhoneNumber(phone);
		Thread.sleep(2000);
		acp.insertAddress(address);
		Thread.sleep(2000);
		acp.insertCity(city);
		Thread.sleep(2000);
		acp.insertState(state);
		Thread.sleep(2000);
		acp.insertZip(zip);
		Thread.sleep(2000);
		acp.selectCountry(country);
		Thread.sleep(2000);
		acp.clickonSaveButton();
		
		Thread.sleep(2000);
		dpage.clickLIstCustomer();
		Thread.sleep(2000);
		acp.validateInsertedCustomerAndDelete();
		
		Thread.sleep(2000);
		acp.clickConfirmButton();
		Thread.sleep(2000);
	
		BrowserFactory.tearDown();

	}

}
