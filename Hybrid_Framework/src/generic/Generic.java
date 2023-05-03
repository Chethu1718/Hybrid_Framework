package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic implements Framework_Constant
{
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty(gecko_key,gecko_value);
		 driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Fb_url);
		
	}
	@AfterMethod
	public void closeapp(ITestResult res)
	{
		if (ITestResult.FAILURE==res.getStatus()) 
		{
			Capture_ScreenShot.getScreenshot(driver);
			
		}
		driver.close();
	}

}
