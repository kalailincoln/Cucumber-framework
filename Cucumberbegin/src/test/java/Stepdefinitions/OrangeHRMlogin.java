package Stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMlogin {
	WebDriver driver;
	

	@Given("User opens the orange HRM login page")
	public void user_opens_the_orange_hrm_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Cucumberbegin\\Driverfile\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("The Home page is visible");
	    
	    
	}
	@When("User enters the below valid username and password")
	public void user_enters_the_below_valid_username_and_password(DataTable dataTable) throws Throwable {
		
		List<List<String>> datawithoutheader = dataTable.asLists(String.class);   //Data without the header...for 2D array
		
		driver.findElement(By.id("txtUsername")).sendKeys(datawithoutheader.get(0).get(0));   //to get data based on first row(0th row) and first column(0th column)
		driver.findElement(By.id("txtPassword")).sendKeys(datawithoutheader.get(0).get(1));    //to get data based on first row(0th row) and second column column(1st column)
	   
	}
	@When("User clicks the login button")
	public void user_clicks_the_login_button() throws Throwable {
		driver.findElement(By.name("Submit")).click();
	  
	    
	}
	@Then("The page is navigated to Home page")
	public void the_page_is_navigated_to_home_page() throws Throwable {
		System.out.println("The page is successfully navigated to home page ");
	
	   
	}




}
