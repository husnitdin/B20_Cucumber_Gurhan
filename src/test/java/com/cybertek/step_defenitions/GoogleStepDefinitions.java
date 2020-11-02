package com.cybertek.step_defenitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utiities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {
    // creating the page object
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("User is on google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://google.com");
    }

    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {
    }

    @When("User searches apple")
    public void user_searches_apple() {
        // sending value into search box using page object
        googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER);
    }

    @Then("User should see apple in the title")
    public void user_should_see_apple_in_the_title() {
        String expTitle = "apple - Google qidiruvi";
        String actTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actTitle, expTitle);

    }

    @When("User searches {string}")
    public void userSearches(String searchValue) {
        googleSearchPage.searchBox.sendKeys(searchValue + Keys.ENTER);
    }

    @Then("User should see {string} in the title")
    public void userShouldSeeInTheTitle(String searchValue) {
        String expTitle = searchValue+" - Google qidiruvi";
        String actTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actTitle, expTitle);
    }
}
