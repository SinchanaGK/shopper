package abc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class text_findelemnet {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	    FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/manjunath/Desktop/fam.html");
		Thread.sleep(2000);
	     List<WebElement> check = driver.findElements(By.xpath("//input"));
	     for (WebElement sinchana : check)
	     {
	    	 sinchana.sendKeys("Sridevi");
	     }
	   for (WebElement webElement : check)
	   {
		webElement.clear();
		Thread.sleep(2000);
		
	}
	  
	    	
		}			
		}
