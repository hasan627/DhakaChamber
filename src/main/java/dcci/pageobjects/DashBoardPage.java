/**
 * 
 */
package dcci.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dcci.actiondriver.Action;
import dcci.base.BaseClass;

/**
 * @author HP
 *
 */
public class DashBoardPage extends BaseClass{
	
	@FindBy(xpath="//span[@class=\"welcome-text\"]")
	WebElement Dashboard;
	
	
	
	public DashBoardPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyDashboard() {
		return Action.isDisplayed(driver, Dashboard);
	}

}
