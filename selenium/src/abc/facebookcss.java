package abc;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebookcss 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	    FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("heeriye song");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("sinchu");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[name='login']")).click();
		Thread.sleep(2000);
		
	}
	

}
