package pop_ups;

import org.openqa.selenium.firefox.FirefoxDriver;

public class parent_browser {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		   FirefoxDriver driver = new FirefoxDriver();
		   driver.get("https://github.com/");
		  String ele = driver.getWindowHandle();
		  System.out.println(ele);
		   }

}
