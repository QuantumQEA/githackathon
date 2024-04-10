package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class plan1 extends BasePage {

	public plan1(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//*[@id='Traveller_1']")
	WebElement Traveler1;
	@FindBy(xpath = "//*[@id='Traveller_2']")
	WebElement Traveler2;
	@FindBy(xpath = "//*[@id='feet']")
	WebElement noOfDays;
	@FindBy(xpath = "//*[@id=\"amt-modal\"]/div[3]/button")
	WebElement apply;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/aside/section[1]/details/summary/p")
	WebElement sortby;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/aside/section[1]/details/ul/li[2]")
	WebElement lowest;
	@FindBy(xpath = "//div//p[@class='quotesCard--insurerName']")
	List<WebElement> Names;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/section/article/div/div/div/div/div")
	List<WebElement> provider;
	@FindBy(xpath = "//div[@class='quotesCard__cta familyPlanPriceContainer']//span")
	List<WebElement> price;
	
	public void details() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Traveler1.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Traveler2.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		noOfDays.click();
		Select obj=new Select(noOfDays);
		obj.selectByVisibleText("60 Days");
		apply.click();
		sortby.click();
		lowest.click();
		
		for(int i=0;i<3;i++) {
			System.out.println(provider.get(i).getText());
			System.out.println("Price : "+price.get(i).getText());
		}
	}
}