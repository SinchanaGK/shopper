package abc;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Partial_link {

	public static void main(String[] args) throws InterruptedException
	{
      System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
      FirefoxDriver driver = new FirefoxDriver();
      Thread.sleep(2000);
      driver.get("file:///C:/Users/manjunath/Desktop/partiallink.html");
      Thread.sleep(2000);
      driver.findElement(By.partialLinkText("google")).click();
	}

}
