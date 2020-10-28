package SauceDemo.TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import SauceDemo.Utilities.SauceDemoUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceTestBase 
{
public static WebDriver driver;
File f;
FileInputStream fis;
Properties pro;

public SauceTestBase() throws Exception
{
	f=new File(".\\src\\main\\java\\SauceDemo\\Config\\Config.properties");
	fis=new FileInputStream(f);
	pro=new Properties();
	pro.load(fis);
}
public void OpenBrowser(String browsername)
{
	if(browsername.equalsIgnoreCase(pro.getProperty("browser")))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(browsername.equalsIgnoreCase(pro.getProperty("browser")))
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	else if(browsername.equalsIgnoreCase(pro.getProperty("browser")))
	{
		WebDriverManager.operadriver().setup();
		driver=new OperaDriver();
	}
	driver.get(pro.getProperty("URL"));
	SauceDemoUtil.winmax();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
