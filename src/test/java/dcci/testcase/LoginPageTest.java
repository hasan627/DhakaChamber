/**
 * 
 */
package dcci.testcase;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dcci.base.BaseClass;
import dcci.pageobjects.DashBoardPage;
import dcci.pageobjects.IndexPage;
import dcci.pageobjects.LoginPage;

/**
 * @author HP
 *
 */
public class LoginPageTest extends BaseClass{
	IndexPage indexpage;
	LoginPage loginpage;
	DashBoardPage dashboardpage;
	
	@BeforeMethod
	public void Setup() {
		LaunchApp();
	}
	
	@AfterMethod
	public void Close() {
		driver.quit();
	}
	
	
	@Test
	public void LoginTest() throws InterruptedException {
		TimeUnit.SECONDS.sleep(4);
		indexpage = new IndexPage();
		indexpage.LoginClick();
		dashboardpage = loginpage.login(prop.getProperty("emailorphone"), prop.getProperty("password"));
		//dashboardpage = loginpage.login();
		String actualTitle = driver.getTitle();
		//System.out.println(actualURL);
		String expectedTitle="DCCI | Login";
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	

}
