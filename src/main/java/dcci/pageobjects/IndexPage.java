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
public class IndexPage extends BaseClass{
	
	@FindBy(xpath="//a/img[@alt=\"Dhaka-Chamber-Of-Commerce-Industries-image\"]")
	WebElement Logo;
	
	@FindBy(xpath="//a[@class=\"nav-link test\"]")
	WebElement LoginLink;
	
	public IndexPage() {
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage LoginClick() {
		Action.click(driver, LoginLink);
		return new LoginPage();
	}
	public boolean validateLogo() {
		return Action.isDisplayed(driver, Logo);
	}
	
	public String getMySiteTitle() {
		String mySiteTitle = driver.getTitle();
		return mySiteTitle;
	}
	
	public String getCurrentURL() {
		String homePageURL= driver.getCurrentUrl();
		return homePageURL;
	}
}
