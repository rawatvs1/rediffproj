package rediffproj;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class base {
	
	public static WebDriver driver; 

	public  WebDriver initialization() throws IOException {
		// TODO Auto-generated method stub
		//String chromedriverpath=System.getProperty("user.dir")+"//resources//chromedriver.exe";
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sit\\eclipse-workspace\\rediffproj\\resources\\chromedriver.exe");
//String dataproppath=System.getProperty("user.dir")+"//resources//data.properties";
		//FileInputStream fis=new FileInputStream("C:\\Users\\sit\\eclipse-workspace\\rediffproj\\resources\\data.properties");
		
	//	Properties props=new Properties();
	//	props.load(fis);
	//	
		
		//if(props.getProperty("browser").contains("chrome"))
		//{
			driver=new ChromeDriver();
			
			
	//	}
		
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			return driver;
	}
	

}
