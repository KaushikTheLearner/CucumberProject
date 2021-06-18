package stepDefinitions;


import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

	@Given("^User is on HomePage$")
	public void user_is_on_homepage() throws Throwable {
		System.out.println("User is on HomePage ");
	
	}

	@When("^User clicks on Orderbook$")
	public void user_clicks_on_orderbook() throws Throwable {
		System.out.println(" User clicks on Orderbook");
	}

	@When("^User clicks on Tradebook$")
	public void user_clicks_on_tradebook() throws Throwable {
		System.out.println("User clicks on Tradebook ");
	}

	@When("^User clicks on NetPosition$")
	public void user_clicks_on_netposition() throws Throwable {
		System.out.println(" User clicks on NetPosition");
	}

	@When("^User clicks on Scanner$")
	public void user_clicks_on_scanner() throws Throwable {
		System.out.println("User clicks on Scanner ");
	}

	@When("^User clicks on Strategy$")
	public void user_clicks_on_strategy() throws Throwable {
		System.out.println("User clicks on Strategy ");
	}

	@When("^User clicks on ExchangeMessage$")
	public void user_clicks_on_exchangemessage() throws Throwable {
		System.out.println("User clicks on ExchangeMessage ");
	}

	@When("^User clicks on Alerts$")
	public void user_clicks_on_alerts() throws Throwable {
		System.out.println("User clicks on Alerts ");
	}

	@Then("^Orderbook should get open$")
	public void orderbook_should_get_open() throws Throwable {
		System.out.println(" Orderbook should get open");
	}

	@Then("^Tradebook should get open$")
	public void tradebook_should_get_open() throws Throwable {
		System.out.println(" Tradebook should get open");
	}

	@Then("^NetPosition should get open$")
	public void netposition_should_get_open() throws Throwable {
		System.out.println(" NetPosition should get open");
	}

	@Then("^Scanner should get open$")
	public void scanner_should_get_open() throws Throwable {
		System.out.println(" Scanner should get open");
	}

	@Then("^Strategy should get open$")
	public void strategy_should_get_open() throws Throwable {
		System.out.println(" Strategy should get open");
	}

	@Then("^ExchangeMessage should get open$")
	public void exchangemessage_should_get_open() throws Throwable {
		System.out.println("ExchangeMessage should get open ");
	}

	@Then("^Alerts should get open$")
	public void alerts_should_get_open() throws Throwable {
		System.out.println("Alerts should get open ");
	}
	@Given("^User is on LoginPage$")
	public void user_is_on_loginpage() throws Throwable {
		System.out.println("User is on LoginPage");
	}

	@When("^User clicks to clear cookies$")
	public void user_clicks_to_clear_cookies() throws Throwable {
		System.out.println("User clicks to clear cookies");
	}

	@Then("^Cookies should get cleared$")
	public void cookies_should_get_cleared() throws Throwable {
		System.out.println("Cookies should get cleared");

	}
	@Given("^User is on Login Page$")
	public void user_is_on_login_page() throws Throwable {
		System.out.println("User is on Login Page");
	}

	@When("^User enter invalid username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enter_invalid_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
		System.out.println(strArg1+" "+strArg2);
	}


	@Then("^User should be on Home page$")
	public void user_should_be_on_home_page() throws Throwable {
		System.out.println("User should be on Home page");

	}

	@And("^Clicks on submit option$")
	public void clicks_on_submit_option() throws Throwable {
		System.out.println("Clicks on submit option");
	}

	@Given("^User is on Login Page in beginning$")
	public void user_is_on_login_page_in_beginning() throws Throwable {
		System.out.println("User is on Login Page in beginning");
	}

	@When("^User enter (.+) and (.+)$")
	public void user_enter_and(String username, String password) throws Throwable {
		System.out.println(username+" "+ password);
	}

	@Then("^User should be logged in$")
	public void user_should_be_logged_in() throws Throwable {
		System.out.println("User should be logged in");

	}

	@And("^Clicks on submit button$")
	public void clicks_on_submit_button() throws Throwable {
		System.out.println("Clicks on submit button");

	}
	@Given("^User is on Signup Page$")
	public void user_is_on_signup_page() throws Throwable {

		System.out.println("User is on Signup Page");     
	}

	@When("^User enter the following valid credentials$")
	public void user_enter_the_following_valid_credentials(DataTable data) throws Throwable {
		List<List<String>> obj = data.asLists();   
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));
		System.out.println(obj.get(0).get(4));
	}

	@Then("^SignedUp Successfully message should be displayed$")
	public void signedup_successfully_message_should_be_displayed() throws Throwable {
		System.out.println("SignedUp Successfully message should be displayed");    
	}



	}

