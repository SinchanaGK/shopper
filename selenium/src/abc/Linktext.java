package abc;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Linktext
{

	public static void main(String[] args) throws InterruptedException  
	{ 

		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
     FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgotten password?")).click();
	

	}

}
