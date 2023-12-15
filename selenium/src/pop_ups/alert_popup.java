package pop_ups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alert_popup {

	public static void main(String[] args) throws InterruptedException 
	{
   System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
   FirefoxDriver driver = new FirefoxDriver();
   driver.get("https://demo.guru99.com/test/delete_customer.php");
   driver.findElement(By.name("submit")).click();
   Thread.sleep(2000);
  Alert a = driver.switchTo().alert();
  System.out.println(a.getText());
  a.accept();
  Thread.sleep(2000);
  System.out.println(a.getText());
  a.accept();
  driver.quit();
   
	}

}
