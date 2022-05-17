package Runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

  
@RunWith(Cucumber.class)

@CucumberOptions(features="Features", glue= {"stepdefinitions"},
plugin = {"pretty","usage:target/usages","summary","html:target/cucumber-ohrmsbihtml-report",
	    "junit:target/cucumber-junit-report/allcukes.xml", "json:target/cucumber-ohrmsbireport.json",
	    "json:target/cucumber.json", "usage:target/cucumber-ohrmsbiusage.json"},
         monochrome=true)
                 
   public class Runner 
 {            

	
}
