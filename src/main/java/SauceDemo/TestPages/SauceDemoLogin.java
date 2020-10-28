package SauceDemo.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SauceDemo.TestBase.SauceTestBase;

public class SauceDemoLogin extends SauceTestBase
{

@FindBy(id="user-name")
public WebElement uname;

@FindBy(id="password")
public WebElement passwrd;

@FindBy(id="login-button")
public WebElement loginbtn;

@FindBy(xpath="//button[@class='error-button']/following::text()[1]")
public WebElement errormsg;

@FindBy(xpath="//div[text()='Sauce Labs Bolt T-Shirt']/following::button[1]")
public WebElement addcart;

@FindBy(xpath="//a[@href='./cart.html']")
public WebElement cart;

@FindBy(xpath="//button[text()='REMOVE']")
public WebElement rmvcart;

@FindBy(xpath="//a[text()='Continue Shopping']")
public WebElement cntshop;

@FindBy(xpath="//button[text()='Open Menu']")
public WebElement openmenu;

@FindBy(xpath="//a[text()='Logout']")
public WebElement logoutbtn;


public SauceDemoLogin() throws Exception 
{
		PageFactory.initElements(driver, this); 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
