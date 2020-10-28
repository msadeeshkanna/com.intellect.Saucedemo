package SauceDemo.TestScript;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import SauceDemo.TestBase.SauceTestBase;
import SauceDemo.TestPages.SauceDemoLogin;
import SauceDemo.Utilities.SauceDemoExcelReader;

public class Loginpage extends SauceTestBase
{
	SauceDemoLogin login;
	public Loginpage() throws Exception 
	{
		super();
	}	
@BeforeTest
public void Setup() throws Exception
{
	OpenBrowser("chrome");
	login=new SauceDemoLogin();
}
@Test(dataProvider="c1")
public void Validlogin(String uname,String passwrd)
{
	 login.uname.sendKeys(uname);
     login.passwrd.sendKeys(passwrd);
     login.loginbtn.click();
     login.addcart.click();
     login.cart.click();
     login.rmvcart.click();
     login.cntshop.click();
     login.openmenu.click();
     login.logoutbtn.click(); 
}
@AfterTest
public void TearDown()
{
	driver.close();
}

@DataProvider(name="c1")
public Object passdata() throws Exception
{
	SauceDemoExcelReader dat=new SauceDemoExcelReader();
	int r=dat.row("Sheet1");
	short c=dat.col("Sheet1");
	Object[][] obj=new Object[r][c];
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			obj[i][j]=dat.GetData("Sheet1",i, j);
		}
	}
	return obj;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
