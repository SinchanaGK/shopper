package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_fb {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	    FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[@create-account")).click();
		WebElement facebook = driver.findElement(By.xpath("//select[@id='day']"));
      Select sel= new Select(facebook);
      sel.selectByIndex(0);
      Thread.sleep(2000);
      sel.selectByValue("month");
      Thread.sleep(1000);
      sel.selectByVisibleText("year");
 
	}
	
	}

