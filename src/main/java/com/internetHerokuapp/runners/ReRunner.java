package com.internetHerokuapp.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //Karate.class
@CucumberOptions(
        features = "@target/uiFailedTests.txt",glue = "com/internetHerokuapp/stepDef",dryRun = false
        ,tags = "" ,
        plugin ={"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"} )
public class ReRunner {
}
