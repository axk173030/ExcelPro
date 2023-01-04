package PageTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.dashBoardPage;
import Util.BrowserFactory;
import Util.ExcelReader;

/**
 * @author rsvac
 *
 */
public class LoginPageTest {
	
	WebDriver driver;
	ExcelReader exlRead= new ExcelReader("src\\main\\java\\Pages\\testData\\testData.xlsx");
	
	String username=exlRead.getCellData("Logininfo", "userName", 2);
	String password= exlRead.getCellData("Logininfo", "password", 2);
	
	
	
	@Test
	public void ValidUserShouldBeableToLogin() throws InterruptedException {
		driver =BrowserFactory.init();
	//LoginPage loginpage= 	new LoginPage();
		LoginPage loginpage =PageFactory.initElements(driver, LoginPage.class);
	loginpage.insertUsername(username);
	Thread.sleep(2000);
	loginpage.insertPassword(password);
	Thread.sleep(2000);
	loginpage.elickSininButton();
	
		
	dashBoardPage dpage = PageFactory.initElements(driver, dashBoardPage.class);
	dpage.validateDashBoard("Dashboard");
	dpage.clickLIstCustomer();
	Thread.sleep(2000);
	
	
	
	BrowserFactory.tearDown();

}
	private void DisplaydashBoard() {
		// TODO Auto-generated method stub
		
	}
}
