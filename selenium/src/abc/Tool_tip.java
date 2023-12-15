package abc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tool_tip {

		public static void main(String[] args) throws InterruptedException 
		{ 
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		    FirefoxDriver driver=new FirefoxDriver();
			Thread.sleep(2000);
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
		    WebElement kannada = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
             String tip = kannada.getAttribute("title");
             System.out.println(tip);
	}

}
