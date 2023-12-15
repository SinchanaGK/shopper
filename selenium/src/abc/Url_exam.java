package abc;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Url_exam 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	    FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.instagram.com/accounts/onetap/?next=%2F&__coig_login=1");
		Thread.sleep(2000);
		 String src = driver.getTitle(); 
		 String title="hello world";
			if(src.equals(title))
			{
				System.out.println(" it is matching ");
			}
		else
		{
			System.out.println("it is not matching");
		}
	}

}

