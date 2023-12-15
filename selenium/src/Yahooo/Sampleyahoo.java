package Yahooo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampleyahoo 
	{
	   
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("Webdriver.chrome.driver", "./software/Chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.yahoo.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("sinchanakumargk@yahoo.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sinchana");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@name='verifyPassword']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@aria-label='Check your mail']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@aria-label='Compose']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("sinchanakumargk@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys("Hi");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@data-test-id='rte']")).sendKeys("hello");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@title='Send this email']")).click();
			Thread.sleep(1000);
		}

	}
