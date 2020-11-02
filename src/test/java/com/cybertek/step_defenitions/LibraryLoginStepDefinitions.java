package com.cybertek.step_defenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LibraryLoginStepDefinitions {

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("user is on login page");
    }

    @When("User logs in as a librarian")
    public void user_logs_in_as_a_librarian() {
        System.out.println("user logs in as a librarian");
    }

    @Then("User should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println("user sees dashboard");
    }

    @When("User logs in as a student")
    public void user_logs_in_as_a_student() {
        System.out.println("user logs in as a student");
    }

    @When("User logs in as an admin")
    public void user_logs_in_as_an_admin() {
        System.out.println("user logs in as an admin");
    }

}
