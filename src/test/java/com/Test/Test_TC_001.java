package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test_TC_001 extends BaseClass{

	@Test
	public void TC_0001() throws Exception {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		  Library.custom_sendKeys(login.getEmailid(),excel.getStringData("Sheet1", 0, 0),"Emailid");
		  Library.custom_sendKeys(login.getPassword(), excel.getStringData("Sheet1", 0, 1),"Password");
		  Library.custom_click(login.getLogin(),"Login");
		  Thread.sleep(5000);
	}
	
}
