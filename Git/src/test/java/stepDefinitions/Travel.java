package stepDefinitions;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AgeSelection;
import pageObjects.DateSelection;
import pageObjects.MedicalCondition;
import pageObjects.MobileNumber;
import pageObjects.Plans;
import pageObjects.TravelInsurance;
import pageObjects.plan1;


public class Travel {
	 WebDriver driver;
     TravelInsurance TravelpageObject;
     DateSelection dateselectionObject;
     AgeSelection ageObject;
     MedicalCondition medicalconditionobject;
     MobileNumber mobileNumberobject;
     Plans plansObject;
     plan1 obj;
     List<HashMap<String, String>> datamap; 

@Given("Navigate to travel insurance page")
public void navigate_to_travel_insurance_page() throws InterruptedException {
	BaseClass.getLogger().info("Goto my account-->Click on Login.. ");
	TravelpageObject=new TravelInsurance(BaseClass.getDriver());
	TravelpageObject.travelInsurancepage();
	
}
@When("click on any european country as destination \\(country={string})")
public void click_on_any_european_country_as_destination_country(String country) {
	TravelpageObject.destination(country);
	
	
}
@When("click on next and navigate to Date page")
public void click_on_next_and_navigate_to_date_page() {
	TravelpageObject.next();
}

@When("select the Date and click on Next")
public void select_the_date_and_click_on_next() {
	dateselectionObject=new DateSelection(BaseClass.getDriver());
	dateselectionObject.date();
	TravelpageObject.next();
}

@When("select the number of travellers and enter the age and click on next")
public void select_the_number_of_travellers_and_enter_the_age_and_click_on_next() {
	ageObject=new AgeSelection(BaseClass.getDriver());
	ageObject.age();
	TravelpageObject.next();
}
@When("verify your Medical History and click on next\\(condition={string})")
public void verify_your_medical_history_and_click_on_next_condition(String string) {
	medicalconditionobject=new MedicalCondition(BaseClass.getDriver());
	medicalconditionobject.medicalCondition(string);

}
@When("Enter your Mobile Number")
public void enter_your_mobile_number() {
	mobileNumberobject=new MobileNumber(BaseClass.getDriver());
	mobileNumberobject.mobileNumber();
}

@When("click on View plans and navigate to the plans page")
public void click_on_view_plans_and_navigate_to_the_plans_page() {
	mobileNumberobject=new MobileNumber(BaseClass.getDriver());
	mobileNumberobject.viewplans();
}


@Then("display three lowest international  travel insurance plan")
public void display_three_lowest_international_travel_insurance_plan() throws InterruptedException {
	plansObject=new Plans(BaseClass.getDriver());
	plansObject.plans();
	Thread.sleep(5000);
	System.out.println("Three lowest international  travel insurance plan");	
	obj=new plan1(BaseClass.getDriver());
	obj.details();
 
}

}