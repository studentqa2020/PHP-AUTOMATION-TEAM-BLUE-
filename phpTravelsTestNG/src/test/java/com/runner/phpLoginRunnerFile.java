package com.runner;

import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
			plugin = { // for report
					"pretty",
					"html:target/site/cucumber-pretty",
					"json:target/cucumber.json" },
			// future = we will do cucumber maven report 
			features = {"./PHPtravelFeatureFile/PHP.feature"}, //feature location		
			glue = {"com.stepdef"}, //step definition 
			monochrome = true, //read console easily or remove all question mark
		dryRun = false, //why?to check feature file correctly written or not
			//there should not be any step definition
	//when we can use?? after finishing the Feature file and before step def code.
		//true = check or false = comment out
		strict = true, //why? it will check all feature scenario steps have corresponding automation code or not
		//when? after developing step definition
		tags = {"@Smoke"} //only test we will mention in tag
		)
		
	
	public class phpLoginRunnerFile  extends AbstractTestNGCucumberTests{ //AbstractTestNGCucumberTests to add TestNG
	
	//Hook = any TestNG annotation inside runner file
	@BeforeTest
	public void setup() {
		//code = setup browser
	}
	

}
