package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import base.Basepage;

public class HomePage extends Basepage {
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
@FindBy(xpath="//*[@id=\"market-btn\"]")
public WebElement mapmarker;
	@FindBy(xpath="//*[@id=\"manage-btn\"]")
	public WebElement tourbooks;
	@FindBy(xpath="/html/body/div[1]/div/a")
	public WebElement seeforyourself;

	//public WebDriver driver;
	/*public HomePage(WebDriver driver)
	{
		//this.driver= driver;
		PageFactory.initElements(driver, this);
	}*/
	
	public HomePage domapmarker()
	{
		mapmarker.click();
		return null;
		
		//return new HomePage(driver);
	}
	public HomePage dotourbooks()
	{
		tourbooks.click();
		
		return new HomePage(driver);
	}
	public HomePage doseeforyourself()
	{
		seeforyourself.click();
		
		return new HomePage(driver);
	}
	
}
