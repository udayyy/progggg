package xtentreport;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class extent2 {

	
	@Test
	public void test() throws IOException
	{
	ExtentReports reports=new ExtentReports("C:\\eclipse\\rahul\\sample\\src\\com\rahul\reports\\uday2", true);
	ExtentTest test=reports.startTest("udayyyyyy");
	
		FirefoxDriver driver=new FirefoxDriver();
		test.log(LogStatus.INFO, "drrrrrr");
		driver.get("http://google.com");
		test.log(LogStatus.INFO, "goooooo");
		
		driver.findElement(By.linkText("Gmail")).click();
		test.log(LogStatus.INFO, "ggmil");
		
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\eclipse\\rahul\\sample\\src\\com\\rahul\\srnshts\\uday.png"));
		
		
		
		test.addScreenCapture("C:\\eclipse\\rahul\\sample\\src\\com\\rahul\\srnshts\\uday.png");
		reports.endTest(test);
		reports.flush();
		
	}
}
