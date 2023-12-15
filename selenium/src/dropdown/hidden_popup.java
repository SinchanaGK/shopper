package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hidden_popup {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		   FirefoxDriver driver = new FirefoxDriver();
		   driver.get("https://www.redbus.com/");
		   driver.findElement(By.id("date input-box ")).click();
		   driver.findElement(By.xpath("//span[text()='29']")).click();
		   Thread.sleep(2000);
	}

}
