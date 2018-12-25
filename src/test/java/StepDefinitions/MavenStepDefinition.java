package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MavenStepDefinition {

    @Given("^I am opening a browser$")
    public void i_am_opening_a_browser() throws Throwable {
        System.out.println("step1");
        //throw new PendingException();
    }

    @When("^I am opening the google link$")
    public void i_am_opening_the_google_link() throws Throwable {
        System.out.println("step2");
        //throw new PendingException();
    }

    @Then("^The home page displays$")
    public void the_home_page_displays() throws Throwable {
        System.out.println("step3");
        //throw new PendingException();
    }


}
