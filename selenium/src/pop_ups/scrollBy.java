package pop_ups;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scrollBy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		   FirefoxDriver driver = new FirefoxDriver();
		   driver.get("file:///C:/Users/manjunath/Desktop/disabled.html");
		   Thread.sleep(1000);
		   JavascriptExecutor jse=(JavascriptExecutor)driver;
		   jse.executeScript("document.getElementById('a1').value='selenium' ");		   
	}

}
