package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_down {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	    FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/manjunath/Desktop/dropdown.html");
		WebElement drop_down = driver.findElement(By.xpath("//select[@id='Country-dropdown']"));
		 Select sel = new Select(drop_down);
            if(sel.isMultiple())
            {
            	System.out.println("single dropdown");
            }
                 else
            {
            	System.out.println("multi dropdown");
            }
	}

}
