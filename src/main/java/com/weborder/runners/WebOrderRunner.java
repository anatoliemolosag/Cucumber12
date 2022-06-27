package com.weborder.runners;
/*
These are Interview Questions:
Runner class is a way to run your all features files from hre.Regression , smoke , Integration ..etc
@RunWith --> annotation comes from Junit and it executes the feature file steps.
@CucumberOptions --> is a special annotation that have some keywords
feature --> this is the location of feature files(this one should be content root
glue --> this is the location of the step definition file (this should be source root
dryRun  --> this is a way to get snips without executing the whole implementation
tags --> is a way to specialize scenarios for the specific purpose .It means you can run for some scenarios for only regression , smoke or etc.
plugin --> is a way to integrate specific condition for the keyword . It is mostly used to create report cart.

 */
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //Karate.class
@CucumberOptions(
        features = "src/main/resources/features/weborder",glue = "com/weborder/stepdefinitions",dryRun = false
,tags = "@regression and @smoke" ,
plugin ={"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"} )

public class WebOrderRunner {



}
