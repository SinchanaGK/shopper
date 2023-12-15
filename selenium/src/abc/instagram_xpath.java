package abc;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class instagram_xpath {

		public static void main(String[] args) throws InterruptedException 
		{ 
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		    FirefoxDriver driver=new FirefoxDriver();
			Thread.sleep(2000);
			driver.get("https://www.instagram.com/accounts/login/?hl=en");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sinchanakumar25");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sinchana@1998");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
	}

}
