package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import objectRepository.Loginpage;
import rediffproj.base;

public class loginTest extends base{

	
@Test
	public void verifyloginfun() throws IOException, InterruptedException
	{
		driver=initialization();
		//String url=props.getProperty("url");
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		Loginpage lp=new Loginpage(driver);
		lp.getlogintext().sendKeys("viishal");
		lp.getpasswordtext().sendKeys("rawat");
		lp.proceedbutton().click();
		Thread.sleep(1000);
		
		if(lp.geterror().getText().contains("Wrong username and password combination"))
		{
			System.out.println("Test Pass");
		}
	}
	
}
