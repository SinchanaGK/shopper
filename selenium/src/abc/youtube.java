package abc;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class youtube {

		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		    FirefoxDriver driver=new FirefoxDriver();
			Thread.sleep(2000);
			driver.get("https://www.youtube.com/");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[id='search']")).sendKeys("heeriye song");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("img[src='https://i.ytimg.com/vi/RLzC55ai0eo/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBuSM6jOWhh7iG070yLQRiOM8Q4Mw']")).click();

	}

}
 