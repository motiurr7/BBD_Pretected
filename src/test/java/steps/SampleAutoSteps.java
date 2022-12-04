package steps;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import reporting.Logs;
import base.BaseClass;

public class SampleAutoSteps extends BaseClass{


	
	@Given("user navigate to homepage")
	public void user_navigate_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		Logs.log("Before Hook");
	}

	@Given("user select auto")
	public void user_select_auto() {
	    // Write code here that turns the phrase above into concrete actions
			homePage.clickAuto();
}

	@Then("user input zipcode")
	public void user_input_zipcode() {

		homePage.autoSteps("11203");

		// Write code here that turns the phrase above into concrete actions
	}

	@Then("click on get started")
	public void click_on_get_started() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("select car company")
	public void select_car_company() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("select vehicle year")
	public void select_vehicle_year() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("select vehicle model")
	public void select_vehicle_model() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("select purpose of use")
	public void select_purpose_of_use() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("select annual milage")
	public void select_annual_milage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("select coverage level")
	public void select_coverage_level() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("select ownership of vehicle")
	public void select_ownership_of_vehicle() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("select No for any other vehicle addition")
	public void select_no_for_any_other_vehicle_addition() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("select current insurance coverage")
	public void select_current_insurance_coverage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("click on first continue  button")
	public void click_on_first_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("select acitve license")
	public void select_acitve_license() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("selcet tickets or claims")
	public void selcet_tickets_or_claims() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("selcet Fill SR")
	public void selcet_fill_sr() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("click on second contiune button")
	public void click_on_second_contiune_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("select homeowner or not")
	public void select_homeowner_or_not() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("select married or unmarried")
	public void select_married_or_unmarried() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("select gender")
	public void select_gender() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	@Then("click on third contiune button")
	public void click_on_third_contiune_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("select education level")
	public void select_education_level() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("select credit score")
	public void select_credit_score() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("click on fourth contiune button")
	public void click_on_fourth_contiune_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("click on month")
	public void click_on_month() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("click on day")
	public void click_on_day() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("click on Year")
	public void click_on_year() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("click on fifth contiune button")
	public void click_on_fifth_contiune_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	@Then("input the first name")
	public void input_the_first_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("input the last name")
	public void input_the_last_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("click on Continue")
	public void click_on_continue() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user will be in about your contact Information")
	public void user_will_be_in_about_your_contact_information() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("input the street address")
	public void input_the_street_address() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("input the email address")
	public void input_the_email_address() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("input the phone number")
	public void input_the_phone_number() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("click to view the rates")
	public void click_to_view_the_rates() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
}
