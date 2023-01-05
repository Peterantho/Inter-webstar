package com.defination;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.lib.LibGobal;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class hooks extends LibGobal {
	WebDriver driver;

	@Before
	public void beforescenario() {
		launchbrower();
		System.out.println("###launch the browser###");
	}

	// WebDriverManager.chromedriver().setup();
	@After
	public void afterscenario(Scenario scenario) throws IOException {
		
		  if(scenario.isFailed()) {
			  
			teamdown(); 
			closebrower();
		  }
	}

}
