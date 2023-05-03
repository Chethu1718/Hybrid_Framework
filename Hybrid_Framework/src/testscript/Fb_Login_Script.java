package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Fetch_Data;
import generic.Generic;
import pom.Pom;


public class Fb_Login_Script extends Generic
{
	@Test
	public void test1()
	{
		String un = Fetch_Data.get_data("Sheet1", 0, 0);
		String pwd = Fetch_Data.get_data("Sheet1", 0, 1);
		Pom p=new Pom(driver);
		p.username(un);
		p.password(pwd);
		//Assert.fail();
		p.login_btn();
	}

}
