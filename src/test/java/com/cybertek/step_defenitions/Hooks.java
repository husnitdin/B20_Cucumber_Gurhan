package com.cybertek.step_defenitions;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
public class Hooks {

    @Before(order = 2)
    // opening the browser
    public void setUpScenario(){
        System.out.println("setting up: Before");
    }

    @Before(value = "@dataBase", order = 1)
    // connecting to the database
    // connects to database before opening the browser since the order # is less than browser's
    public void setUpDatabaseConnection(){  // connecting to database
        System.out.println("setting up Data Base Connection");
    }

    @After (order = 1)
    // closing the browser
    public void tearDownScenario(){
        System.out.println("tearing down: After");
    }

    @After(value = "@dataBase", order = 2)
    // disconnecting the database
    public void tearDownDatabaseConnection(){
        System.out.println("tearing down Data Base Connection");
    }

    @BeforeStep
    // apply before each step, used mostly for screenshots
    public void setUpStep(){
        System.out.println("before step screenshot");
    }

    @AfterStep
    public void tearDownStep(){
        System.out.println("after step screenshot");
    }
}
