package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\features\\facekooklogin.feature",
		glue= {"com.defination"},
	   // tags = "@regression",
		publish = true,
		monochrome = true,
		plugin= {"pretty","html:target/html-reports"}
		
		
	

	    
		
		
		
		
		)


/*@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\resources\\features",
		glue= {"com.defination"},
		publish = false
		
		
		)
*/










public class testrunner {

}
