package explicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class facebook {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	   FirefoxDriver driver = new FirefoxDriver();
	   driver.get("https://www.facebook.com/");
	   driver.findElement(By.id("email")).sendKeys("9663919461");
	   driver.findElement(By.id("pass")).sendKeys("sinchana@25");
	   driver.findElement(By.name("login")).click();
	   WebDriverWait wait=new WebDriverWait(driver,10);
	   wait.until(ExpectedConditions.titleContains("Facebook"));
	   System.out.println(driver.getTitle());
	   WebDriverWait waiting=new WebDriverWait(driver,10);
	   waiting.until(ExpectedConditions.urlMatches("https://www.facebook.com/"));
	   System.out.println(driver.getCurrentUrl());
	   driver.findElement(By.xpath("//a[@href='/friends/']")).click();
		

	}

}
