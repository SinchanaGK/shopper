package abc;
import org.openqa.selenium.firefox.FirefoxDriver;

public class title_ex 
{
	
	public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		    FirefoxDriver driver=new FirefoxDriver();
			Thread.sleep(2000);
			driver.get("https://www.instagram.com/accounts/onetap/?next=%2F&__coig_login=1");
			Thread.sleep(2000);
			 String src = driver.getCurrentUrl(); 
			 String url="https://www.google.com/search?client=firefox-b-d&q=facebook";
				if(src.equals(url))
				{
					System.out.println(" it is matching ");
				}
			else
			{
				System.out.println("it is not matching");
			}
		}

}
