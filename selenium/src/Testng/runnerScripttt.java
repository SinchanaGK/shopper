package Testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class runnerScripttt extends genericScript
{
@Test
public void validLogin()
{
	driver.findElement(By.xpath("//input [@id='email']")).sendKeys("Admin");
}
}
