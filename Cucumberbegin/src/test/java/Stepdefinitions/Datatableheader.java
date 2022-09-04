package Stepdefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Datatableheader {
	WebDriver driver;
	

	@Given("The login page of orangeHRM is opened")
	public void the_login_page_of_orange_hrm_is_opened() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Cucumberbegin\\Driverfile\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 System.out.println("The login page is visible");
	}
	@When("Client enters the ID  and Password as below")
	public void client_enters_the_id_and_password_as_below(io.cucumber.datatable.DataTable dataTable) throws Throwable {
		List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);    //for storing header name ie.username and password together,we use "Map" and "list" function approach together
	    
		driver.findElement(By.id("txtUsername")).sendKeys(data.get(0).get("Username"));   //for getting the data from the header "username", the index of  1st row (Where the header is given)
		driver.findElement(By.id("txtPassword")).sendKeys(data.get(0).get("Password"));   // for getting the data from the header "Password" , the index of 1st row(where the header is given)
		
		System.out.println("The ID and Password entered successfully");
	}
	@When("Clients cliks the login button")
	public void clients_cliks_the_login_button() throws Throwable {
		driver.findElement(By.name("Submit")).click();
		System.out.println("The login button is clickable");
	   
	  
	}
	@Then("The login page is navigated to home page")
	public void the_login_page_is_navigated_to_home_page() throws Throwable {
		
		System.out.println("The page is successfully navigated ");
	    
	}




}
