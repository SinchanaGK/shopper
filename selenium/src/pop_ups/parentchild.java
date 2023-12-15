package pop_ups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class parentchild {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	   FirefoxDriver driver = new FirefoxDriver();
	   driver.get("https://skpatro.github.io/demo/links/");
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	  Set<String> ele = driver.getWindowHandles();
			  
			  
			  System.out.println(ele.size());
	  for (String abc: ele) 
	  {
		  System.out.println(abc);
		
	}
	}

}
