package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class punter
{
@Test(invocationCount = 2,priority=0)
	public void run1()
	{
	System.out.println("sinchana");
	
}
@Test
public void run2()
{
	Reporter.log("india",true);
}
}