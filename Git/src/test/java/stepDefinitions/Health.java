package stepDefinitions;
 
import java.io.FileNotFoundException;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
 
import factory.BaseClass;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;

import HealthInsurancepageObjects.*;
 
public class Health {
 
	 WebDriver driver;

	 HealthInsurance health;

	@Given("the user navigates to website")

	public void the_user_navigates_to_website() {

		System.out.println("The user in on the HomePage"); 

	}

	@When("the user click on Insurance products menu")

	public void the_user_click_on_insurance_products_menu() {

		health=new HealthInsurance(BaseClass.getDriver());

		   health.menuAction();

	}

	@Then("Retrieve all Health Insurance menu items as List and print them")

	public void retrieve_all_health_insurance_menu_items_as_list_and_print_them() throws FileNotFoundException, IOException {

		 health.healthList();

	}

}
