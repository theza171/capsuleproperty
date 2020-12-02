package testcases;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.HomePage;
import base.Basepage;

public class tc1 {
	@Test
	public void domapmarker()
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.propertycapsule.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//HomePage home=PageFactory.initElements(driver, HomePage.class);
		/*HomePage home=new HomePage(driver);
		home.doLogin("thezasri1997@gmail.com", "Theza@18");
		LandingPage lp= new LandingPage(driver);
		lp.gotoProfile();*/
		
		//new HomePage(driver).doLogin("thezasri1997@gmail.com", "Theza@18").gotoProfile();
		HomePage home=new HomePage(driver);
		home.domapmarker();
		//LandingPage lp=home.doLogin("thezasri1997@gmail.com", "Theza@18");
		
		driver.quit();
		
	}
}
