package generic;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_ScreenShot 
{
	public static void getScreenshot(WebDriver driver)
	{
		try 
		{
		String path="./Screenshot/";
		Date d=new Date();
		String d1 = d.toString();
		String d2 = d1.replaceAll(":", "-");
		TakesScreenshot tss=(TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);	
		File dst=new File(path+d2+".png");
		FileHandler.copy(src, dst);
		}
		catch (Exception e) 
		{
			System.out.println(e);
			
		}
	}

}
