package com.cybertek.step_defenitions;
import io.cucumber.java.en.Then;
import java.util.List;

public class DataTablesStepDefs {

    @Then("User should see below words displayed")
    public void userShouldSeeBelowWordsDisplayed(List<String> fruitList) {
            // enter : -- List<String> fruitList -- part manually
            // step def doesn't create it

        System.out.println("fruitList.size() = " + fruitList.size());
        System.out.println("fruitlist: "+ fruitList);
    }
}
