package com.cybertek.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = "json:target/cucumber.json",  // JSON report

        features = "src/test/resources/features",
        glue = "com/cybertek/step_defenitions",
        tags = "@SJCheckInThreePlaces"
)
public class CukesRunner {
}


