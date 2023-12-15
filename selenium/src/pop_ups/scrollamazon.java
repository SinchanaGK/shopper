package pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scrollamazon {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		   FirefoxDriver driver = new FirefoxDriver();
		   driver.get("https://www.amazon.com/");
		   Thread.sleep(1000);
		   JavascriptExecutor js=(JavascriptExecutor) driver;
		   for(int i=0;i<3;i++)
		   {
		   js.executeScript("window.scrollBy(0,500)");
		   Thread.sleep(1000);
	}
		   for(int j=0;j<3;j++)
		   {
			   js.executeScript("window,scrollBy(0,-500)");
			   Thread.sleep(1000);
		   }
	}
}

