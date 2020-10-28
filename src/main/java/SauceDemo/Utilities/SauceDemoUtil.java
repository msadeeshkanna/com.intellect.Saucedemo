package SauceDemo.Utilities;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import SauceDemo.TestBase.SauceTestBase;

public class SauceDemoUtil extends SauceTestBase
{
static Select s;
static Alert a;
public SauceDemoUtil() throws Exception 
{
	super();
}	
public static void winmax()
{
	driver.manage().window().maximize();
}
public static void impwait()
{
	driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);	
}
public static boolean isDisp(WebElement Disp)
{
	boolean flag=Disp.isDisplayed();
	return flag;
}
public static boolean isSel(WebElement Sel)
{
	boolean flag=Sel.isSelected();
	return flag;
}
public static boolean isEnab(WebElement Enb)
{
	boolean flag=Enb.isEnabled();
	return flag;
}
public static void selectbyvalue(WebElement val, String value)
{
	s=new Select(val);
	s.selectByValue(value);
}
public static void selectbyindex(WebElement val, int index)
{
	s=new Select(val);
	s.selectByIndex(index);
}
public static void selectbyvisibletext(WebElement val, String text)
{
	s=new Select(val);
	s.selectByVisibleText(text);
}
public static void alertdismiss()
{
	Alert a=driver.switchTo().alert();
		a.dismiss();;
}
public static void alertaccept()
{
	Alert a=driver.switchTo().alert();
		a.accept();
}
public static void alertgettext()
{
	Alert a=driver.switchTo().alert();
		a.getText();
}
public static void frameind(int frameind)
{
	driver.switchTo().frame(frameind);
}
public static void frameelement(WebElement frameele)
{
	driver.switchTo().frame(frameele);
}
public static void framename(String framename)
{
	driver.switchTo().frame(framename);
}
public static void windowhandles()
{
	String parent=driver.getWindowHandle();
Set<String>child=driver.getWindowHandles();
if(!parent.equals(child))
{
	for(String childs:child)
	{
	driver.switchTo().window(childs);
}
	driver.switchTo().window(parent);
}
}
public static void screeshot() throws Exception
{
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(f, new File(".\\Screenshot"+ +System.currentTimeMillis()+ ".png"));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
