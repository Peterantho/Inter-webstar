package com.defination;



import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.lib.LibGobal;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pom.POMODEL;
import org.testng.annotations.Test;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdefination extends LibGobal {

	 WebDriver driver;
	POMODEL obj =new POMODEL();
	

	@Given("user need to launch the facebookapplication")
	public void user_need_to_launch_the_facebookapplication() {
		System.out.println("inside step-user need to launch the facebookapplicatiom");
		launchsite("https:www.facebook.com");
	}

	@When("user need to enter the valid username and password")
	public void user_need_to_enter_the_valid_username_and_password() {
		System.out.println("inside step-user need to enter the valid username and password");
		
		POMODEL	obj=new POMODEL();
		obj.setupvalue("peter@gamil.com", "peter");
		
	}
	@And("user need to click on login button")
	public void user_need_to_click_on_login_button() {
		System.out.println("inside step-user need to click on login button");
		POMODEL	obj=new POMODEL();
			buttonclick(obj.getLoginbutton());
			
	}
			 @When("user need to enter the invalid {string} and valid {string}") public
			  void user_need_to_enter_the_invalid_and_valid(String username, String password) {
			  
					
				 POMODEL  obj=new POMODEL();
			      obj.setupvalue(username, password);

	}
	@Then("verify the homepage is navigated or not")
	public void verify_the_homepage_is_navigated_or_not() {
		System.out.println("inside step-verify the homepage is navigated or not ");
		verifypage("Forgotten password?");
		
	}
	
	
			/*
			 * @When("user need to enter the invalid {string} and valid {string}") public
			 * void user_need_to_enter_the_invalid_and_valid(String username1, String
			 * password1) {
			 * 
			 * 
			 * obj=new POMODEL(); obj.setupvalue(username1, password1);
			 * 
			 * }
			 */
}
