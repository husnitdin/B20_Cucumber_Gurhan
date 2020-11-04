package com.cybertek.step_defenitions;
import com.cybertek.pages.WikiSearchPage;
import com.cybertek.utiities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikiStepDefs {

    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("User is on the Wikipedia home page")
    public void userIsOnTheWikipediaHomePage() {
        Driver.getDriver().get("https://www.wikipedia.org");
    }

    @When("User types {string} in wiki search box")
    public void userTypesInWikiSearchBox(String arg0) {
        wikiSearchPage.searchBox.sendKeys(arg0);
        wikiSearchPage.submitButton.click();
    }

    @Then("User should see {string} in the wiki title")
    public void userShouldSeeInTheWikiTitle(String expTitle) {
        String exp = expTitle.toLowerCase();
        String act = Driver.getDriver().getTitle().toLowerCase();
        Assert.assertTrue(expTitle + " not exist in the actual title", act.contains(exp));
    }

    @Then("User should see {string} in the main header")
    public void userShouldSeeInTheMainHeader(String mHeader) {
        String expMH = mHeader.toLowerCase();
        String actMH = wikiSearchPage.mainHeader.getText().toLowerCase();
        Assert.assertEquals("Headers don't match", actMH, expMH);
    }

    @Then("User should see {string} in the image header")
    public void userShouldSeeInTheImageHeader(String mHeader) {
        String expIH = mHeader.toLowerCase();
        String actIH = wikiSearchPage.imageHeader.getText().toLowerCase();
        Assert.assertEquals("Headers don't match", actIH, expIH);

    }
}
