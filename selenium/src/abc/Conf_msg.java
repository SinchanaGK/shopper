package abc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Conf_msg {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	    FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.id("btn")).click();
		WebElement conf_msg = driver.findElement(By.xpath("//span[contains(text(),'You selected')]"));
		String Text = conf_msg.getText();
		System.out.println(Text);

	}

}
