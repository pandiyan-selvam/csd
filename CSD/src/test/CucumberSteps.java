package test;

import junit.framework.TestCase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberSteps extends TestCase {
	
	Ride ride = new Ride();
	RideValidator validator = new RideValidator();
	
	@Given("^login user  page$")
	public void login_user_page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		
	}

	@When("^the user enters the details and clicks \"([^\"]*)\"$")
	public void the_user_enters_the_details_and_clicks(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   // throw new PendingException();
		
	/*	if(arg1.equals("submit"))
		{
			assertEquals(arg1,validator.validateLogin() );
		}
	*/	
	}

	@Then("^\"([^\"]*)\" the user details$")
	public void the_user_details(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   // throw new PendingException();
	}

	@Given("^Confirmation page$")
	public void Confirmation_page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   // throw new PendingException();
	}

	@When("^on click \"([^\"]*)\"$")
	public void on_click(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   // throw new PendingException();
	}

	@Then("^show \"([^\"]*)\"  or \"([^\"]*)\" msg$")
	public void show_or_msg(String arg1, String arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	  //  throw new PendingException();
	}

	@Given("^Confirmation cancellation page$")
	public void Confirmation_cancellation_page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	  //  throw new PendingException();
	}

	@Then("^show \"([^\"]*)\" msg$")
	public void show_msg(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	  //  throw new PendingException();
	}

	@Given("^Confirmation page success$")
	public void Confirmation_page_success() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	  //  throw new PendingException();
	}

	@Then("^driver receives the guest user details and pick up the guest user$")
	public void driver_receives_the_guest_user_details_and_pick_up_the_guest_user() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	  //  throw new PendingException();
	}

	@Given("^guest user details$")
	public void guest_user_details() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	  //  throw new PendingException();
	}

	@When("^driver \"([^\"]*)\"$")
	public void driver(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	  //  throw new PendingException();
	}

	@Then("^notify driver$")
	public void notify_driver() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	  //  throw new PendingException();
	}



	
}
