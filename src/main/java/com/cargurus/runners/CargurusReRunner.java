package com.cargurus.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //Karate.class
@CucumberOptions(
        features = "@target/uiFailedTests.txt",glue = "com/cargurus/stepDef",dryRun = false
        ,tags = "" ,
        plugin ={"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"} )
public class CargurusReRunner {
}
