package com.cybertek.step_defenitions;
import com.cybertek.pages.EtsySearchPage;
import com.cybertek.utiities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class EtsyStepDefinitions {

    EtsySearchPage etsySearchPage = new EtsySearchPage();

    @Given("User is on etsy home page")
    public void userIsOnEtsyHomePage() {
        Driver.getDriver().get("https://www.etsy.com");
    }

    @Then("User should see title is as expected")
    public void userShouldSeeTitleIsAsExpected() {

        String exp = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String act = Driver.getDriver().getTitle();

        Assert.assertEquals("titles don't match", act, exp );
    }

    @When("User enters {string} in the search box")
    public void userEntersInTheSearchBox(String arg0) {
        etsySearchPage.searchBox.sendKeys(arg0);
    }

    @And("User clicks to search button")
    public void userClicksToSearchButton() {
        etsySearchPage.submitButton.click();
    }

    @Then("User should see {string} in the etsy title")
    public void userShouldSeeInTheEtsyTitle(String expTitle) {

        String exp = expTitle.toLowerCase();
        String act = Driver.getDriver().getTitle().toLowerCase();
        Assert.assertTrue("Actual title doesn't contain searched word/s", act.contains(exp));
    }
}
