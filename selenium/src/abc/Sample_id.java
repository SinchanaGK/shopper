package abc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_id {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/manjunath/Desktop/userrr.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("hi");
		Thread.sleep(2000);
		driver.findElement(By.id("a1")).sendKeys("345");
		Thread.sleep(2000);
		driver.findElement(By.name("n1")).sendKeys("sinchana");
		Thread.sleep(2000);
		driver.findElement(By.className("c1")).sendKeys("sample");
		Thread.sleep(2000);
		
	}

}
