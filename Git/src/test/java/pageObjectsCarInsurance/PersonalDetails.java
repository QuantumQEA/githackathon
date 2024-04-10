package pageObjectsCarInsurance;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.BaseClass;

public class PersonalDetails extends BasePage{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	public PersonalDetails(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder='Full name'] | //input[@id='name']")
	WebElement fullName;
	@FindBy(xpath="//input[@placeholder='Your email'] | //input[@id='email']")
	WebElement email;
	@FindBy(xpath="//input[@placeholder='Mobile number'] | //input[@id='mobileNo']")
	WebElement mob;
	@FindBy(xpath="//div[@class='msg-error show']| //*[@class=\"errorMsg\"]")
	WebElement error;
	
	public void name(String Name) throws IOException 
	{
		//fullName.click();
		//fullName.sendKeys(BaseClass.getProperties().getProperty("name"));
		fullName.sendKeys(Name);
	}
	public void email(String emailid) throws IOException
	{
		//email.click();
		//email.sendKeys(BaseClass.getProperties().getProperty("email"));
		email.sendKeys(emailid);
	}
	public void mobileNum()
	{
		String number="9"+BaseClass.randomAlphaNumeric();
		mob.sendKeys(number);

	}
	public void errorMsg()
	{
	  String errormessage=error.getText();
	  System.out.println("_____________________Error Message_____________________");
	  System.out.println();
	  System.out.println(errormessage);
	  System.out.println("_______________________________________________________");
	}
}
 	