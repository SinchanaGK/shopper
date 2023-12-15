package abc;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpath_youtube {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		    FirefoxDriver driver=new FirefoxDriver();
			Thread.sleep(2000);
			driver.get("https://www.youtube.com/");
			driver.findElement(By.xpath("//input[@id='search']")).sendKeys("leviatating ua lipa");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
			
			
	}

}
