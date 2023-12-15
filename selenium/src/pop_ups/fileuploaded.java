package pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileuploaded{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	   FirefoxDriver driver = new FirefoxDriver();
	   driver.get("file:///C:/Users/manjunath/Desktop/fileupload.html/");
	   Thread.sleep(1000);
	  WebElement ele = driver.findElement(By.name("upload file"));
	   ele.sendKeys("C:\\Users\\manjunath\\Desktop\\Archana GK_10690234.docx");

	}

}
