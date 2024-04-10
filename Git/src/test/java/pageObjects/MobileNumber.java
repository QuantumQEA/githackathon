package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.BaseClass;

public class MobileNumber extends BasePage {

	public MobileNumber(WebDriver driver) {
		super(driver);
	}
	
@FindBy(xpath = "//*[@id=\"mobileNumber\"]")
WebElement mobileNumber;
@FindBy(xpath="//div[@ class=\"pqCtaWrapper\"]/button")
WebElement viewplans;
@FindBy(xpath = "//*[@id='whatsapp-updates']")
 WebElement whatsappupdates;

	public void mobileNumber() {
		String number="9"+BaseClass.randomAlphaNumeric();
		mobileNumber.sendKeys(number);
	}
	
	public void viewplans() {
		viewplans.click();
	}
}

