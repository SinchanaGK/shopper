package abc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon_findelemnt {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	    FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.amazon.com/");
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
	     List<WebElement> check = driver.findElements(By.xpath("//a|//img"));
	     int count=check.size();
	     System.out.println(count);
for (WebElement webElement : check) 
{
	String amazon = webElement.getAttribute("href");
	System.out.println(amazon);
	
}
	}

}
