package abc;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demoqspider {

	public static void main(String[] args) throws InterruptedException
	{ 
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	    FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys("sinchana");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("sinchanakumargk@gmail.com");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("sinchu");
		driver.findElement(By.cssSelector("svg[fill='currentColor']")).click();
	   driver.findElement(By.cssSelector("a[href='/link']")).click();
	   driver.findElement(By.cssSelector("section[class='poppins']")).click();
	}
	   

}
