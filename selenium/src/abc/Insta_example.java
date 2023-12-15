package abc;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Insta_example {

	public static void main(String[] args) throws InterruptedException 
	{ 
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	    FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("_aa4b _add6 _ac4d")).sendKeys("sinchanakumar");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("password")).sendKeys("sinchana@1998");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("login")).click();
		Thread.sleep(2000);
		driver.get("sribhajarangi");
		Thread.sleep(2000);
		
		
	

	}
}
