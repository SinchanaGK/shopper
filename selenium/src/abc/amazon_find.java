package abc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon_find
{  

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
    FirefoxDriver driver=new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("https://www.amazon.com/");
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
     List<WebElement> images = driver.findElements(By.xpath("//img|//a"));
    // List<WebElement> images1 = driver.findElements(By.xpath("//a"));
	
      int count=images.size();
      System.out.println(count);
      //int count1=images1.size();
      //System.out.println(count1);
     

	

	

}
}