package pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazonscrollassignment {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		   FirefoxDriver driver = new FirefoxDriver();
		   driver.get("https://www.amazon.com/");
		   Thread.sleep(1000);
		   JavascriptExecutor js=(JavascriptExecutor) driver;
		  WebElement elem = driver.findElement(By.xpath("//a[@class='nav_a']"));
		//  js.executeScript("window,scrollBy("+x +" "+y+ ")");
		  Point locate = elem.getLocation();
		  int x = locate.getX();
		  int y=locate.getY();
	   System.out.println(x);
		System.out.println(y);
		  driver.quit();
		  
	}

}
