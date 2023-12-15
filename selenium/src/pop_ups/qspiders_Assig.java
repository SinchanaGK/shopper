package pop_ups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class qspiders_Assig {

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		   FirefoxDriver driver = new FirefoxDriver();
		   driver.get("https://www.google.com/search?client=firefox-b-d&q=qspiders+coursee");
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//h3[text()='Courses']")).click();
		   JavascriptExecutor js=(JavascriptExecutor) driver;
		   for(int i=0;i<2;i++)
		   {
		   js.executeScript("window.scrollBy(0,200)");
		   }
		   Thread.sleep(1000);
	WebElement element = driver.findElement(By.xpath("//a[@href='/api-testing/course']"));
	Actions act=new Actions(driver);
	 act.contextClick(element).perform();
	 Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_T); 
	  r.keyRelease(KeyEvent.VK_T);
Set<String> ele = driver.getWindowHandles();
ArrayList<String> l=new ArrayList<String>(ele);
String wh=l.get(1);
driver.switchTo().window(wh);
driver.findElement(By.xpath(("(//p[@class='card-header-title has-text-persian'])[3]")));
JavascriptExecutor jss=(JavascriptExecutor)driver;
for(int i=0;i<1;i++)
{
	jss.executeScript("window.scrollBy(0,100)");
}
	}
}

