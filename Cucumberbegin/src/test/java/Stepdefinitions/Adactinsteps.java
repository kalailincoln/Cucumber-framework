package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactinsteps {
	WebDriver driver;

	
	@Given("User is on the login page")
	public void user_is_on_the_login_page() throws Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Cucumberbegin\\Driverfile\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://adactinhotelapp.com/");
		System.out.println("The user is on the login page ");
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("User enters the valid username as {string}")
	public void user_enters_the_valid_username_as(String username1) throws Throwable {
		driver.findElement(By.id("username")).sendKeys("lincolnkalai");
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("User enters the valid password as {string}")
	public void user_enters_the_valid_password_as(String string) throws Throwable {
		driver.findElement(By.id("password")).sendKeys("Kalai@lincoln123");
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("User clicks the login button")
	public void user_clicks_the_login_button() throws Throwable{
		driver.findElement(By.id("login")).click();
		System.out.println("The login button is clicked");
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("The page is navigated to Adactin search hotel page")
	public void the_page_is_navigated_to_adactin_search_hotel_page() throws Throwable {
		System.out.println("Successfully navigated");
	    // Write code here that turns the phrase above into concrete actions
	    
	}



}
