package abc;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example_script {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/udayd/OneDrive/Desktop/abc.html");
		WebElement t1 = driver.findElement(By.id("t1"));
		Thread.sleep(2000);
		t1.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(2000);
		WebElement t3= driver.findElement(By.id("t3"));
		t3.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		WebElement t2 = driver.findElement(By.id("t2"));
		t2.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(2000);
		t1.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		t3.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(2000);
		t2.sendKeys(Keys.CONTROL+"v");
		

	}

}
