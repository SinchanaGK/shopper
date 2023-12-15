package abc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_count {

	

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	    FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/reg/?next=%2FPHP%2F");
		WebElement ele = driver.findElement(By.id("month"));
		Select s = new Select(ele);
		List<WebElement> opt = s.getOptions();
		ArrayList<String> l=new ArrayList<String>();
		int count=opt.size();
		{
			System.out.println(count);
		}
		for (WebElement webElement : opt)
		{
			String text1=webElement.getText();
			l.add(text1);
		}
		Collections.sort(l);
		for (String l2 : l)
		{
			System.out.println(l2);
		}
			
			
		}
	
			}
