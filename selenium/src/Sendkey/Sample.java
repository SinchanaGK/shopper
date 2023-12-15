package Sendkey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("file:///C:/Users/manjunath/Desktop/seclear.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("sinchana");
		driver.findElement(By.id("a1")).sendKeys("123");
		driver.findElement(By.name("n1")).sendKeys("archana");
		driver.findElement(By.className("c1")).sendKeys("siri");

	}

}
