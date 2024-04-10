package HealthInsurancepageObjects;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.WriteExcel;

public class HealthInsurance extends BasePage{

	public HealthInsurance(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//*[contains(text(),\"Insurance Products \")]")
	WebElement InsuranceProduct;
	@FindBy(xpath="//div[@class='ruby-col-3 hidden-md'][2]//li")
	List <WebElement> HealthList;
	
	public void menuAction()
	{
		Actions action=new Actions(driver);
	    action.moveToElement(InsuranceProduct).perform();

	}
	public void healthList() throws FileNotFoundException, IOException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(HealthList));
		List<WebElement> Healthmenu=HealthList;
	    System.out.println("HealthInsurance List:");
	    for(WebElement Healthlist:Healthmenu)
	    {
	    	System.out.println(Healthlist.getText());
	    }
	    List<String> healthInsuranceList1 =getHealthInsuranceList();
	    try {
	        WriteExcel.healthListExcel(healthInsuranceList1, ".\\testData\\HealthInsurance.xlsx", "Sheet1");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	 
	public List<String> getHealthInsuranceList() {
	 
	    List<String> healthInsuranceList = new ArrayList<>();
	 
	    for (WebElement Healthlist1 : HealthList) {
	 
	        String insuranceOption = Healthlist1.getText();
	 
	        healthInsuranceList.add(insuranceOption);
	  
	    }
	 
	    return healthInsuranceList;
	 
	}

}
