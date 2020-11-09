package com.cybertek.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target/cucumber-report.html",  // html report
                  "json:target/cucumber-report.json",  // JSON report
                  //"rerun:target/rerun.txt"             // rerun txt
                 },
        features = "src/test/resources/features",
        glue = "com/cybertek/step_defenitions",
        tags = "@wiki"
)
public class CukesRunner {
}


