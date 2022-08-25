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
public class LoginPage extends BaseClass{
	
	@FindBy(name="phoneOrEmail")
	WebElement Email;

	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(xpath="//button[@class=\"login-btn w-100 b-radius mt-4 btn btn-outline-warning\"]")
	WebElement SigninBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public DashBoardPage login(String eml, String pswd) {
		Action.type(Email, eml);
		Action.type(Password, pswd);
		Action.click(driver, SigninBtn);
		return new DashBoardPage();
	}
}
