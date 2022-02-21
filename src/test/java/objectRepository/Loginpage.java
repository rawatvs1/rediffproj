package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;
public Loginpage(WebDriver driver) {
		
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(id="login1")
	WebElement logintextbox;
	
	@FindBy(id="password")
	WebElement passwordtextbox;
	
	@FindBy(name="proceed")
	WebElement proceedbutton;
	
	@FindBy(xpath="//div//b")
	WebElement errormsg;
	
	
	
	public WebElement getlogintext()
	{
		return logintextbox;
		
	}
	
	public WebElement getpasswordtext()
	{
		return passwordtextbox;
		
	}
	
	public WebElement proceedbutton()
	{
		return proceedbutton;
		
	}
	
	public WebElement geterror()
	{
		return errormsg;
		
	}


}
