package Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class genericScript {
	public WebDriver driver;
	@BeforeMethod
	public void openApplication()
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		 driver=new FirefoxDriver();
         driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.facebokk.com");
	}
	@AfterMethod
	public void closeApplication()
	{
		driver.close();
	}
	
	}

