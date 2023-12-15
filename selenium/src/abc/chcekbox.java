package abc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chcekbox {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
    FirefoxDriver driver=new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("file:///C:/Users/manjunath/Desktop/check.html");
	Thread.sleep(2000);
     List<WebElement> check = driver.findElements(By.xpath("//input"));
     int count=check.size();
     System.out.println(count);
     for(int i=0;i<count;i++)
     {
    	 WebElement abc=check.get(i);
    	 abc.click();
    	 Thread.sleep(2000);
     }
     for(int i=count-1;i>=0;i--)
     {
    	 WebElement s=check.get(i);
	   s.click();
	 Thread.sleep(2000);
 }
    	 
     }
}

