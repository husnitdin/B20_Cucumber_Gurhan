package com.cybertek.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = "html:target/cucumber-report.html",    // creates reports
        features = "src/test/resources/features",       // feature file path
        glue = "com/cybertek/step_defenitions",
        tags = "@googleHomePageLinks"
)
public class CukesRunner {
}


