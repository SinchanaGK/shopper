package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class qspiders_demopage
{

	public static void main(String[] args) throws InterruptedException
	
	{ System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	   FirefoxDriver driver = new FirefoxDriver();
	   driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");
	   Thread.sleep(2000);
	 driver.findElement(By.id("phone")).sendKeys("9663919461");
	   Thread.sleep(2000);
	   WebElement drop_down = driver.findElement(By.xpath("//select[@id='select2']"));
	   Select sel=new Select(drop_down);
	   Thread.sleep(1000);
	   sel.selectByIndex(2);
	   

	}

}
