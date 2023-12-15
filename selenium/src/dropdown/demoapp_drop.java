package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class demoapp_drop {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	    FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/dragDrop");
		 WebElement ele = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		 WebElement ele1 = driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'][1]"));
		 Actions s1=new Actions(driver);
		 s1.dragAndDrop(ele, ele1).perform();
	}

}