package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom 
{
	@FindBy(id = "email")
	private WebElement un_ele;
	@FindBy(id = "pass")
	private WebElement pwd_ele;
	@FindBy(name = "login")
	private WebElement btn_ele;
	 
	public Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void username(String un1)
	{
		un_ele.sendKeys(un1);
		
		
	}
	public void password(String pwd1)
	{
		pwd_ele.sendKeys(pwd1);
		
	}
	public void login_btn()
	{
		btn_ele.click();
	}




	
}
