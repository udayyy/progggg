package xsltreports;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class gmaillaunch {
	@Test
	public void gmailtest()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		
	}

}
