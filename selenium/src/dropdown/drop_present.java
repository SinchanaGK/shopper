package dropdown;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_present 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
    FirefoxDriver driver=new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com/reg/?next=%2FPHP%2F/");
	WebElement ele = driver.findElement(By.id("month"));
	Select s = new Select(ele);
	List<WebElement> opt = s.getOptions();
	TreeSet<String> t=new TreeSet<String>();
	for (WebElement webElement : opt) 
	{
		String text=webElement.getText();
		t.add(text);
		}
		if(t.contains("Mar"))
		{
			System.out.println("option present");
		}
		else
		{
			System.out.println("not present");
			
		}
	}
		
}
