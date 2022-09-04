package hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class hooksstepdefinition {
	public static WebDriver driver;
	
    
	@Given("User is on the home page")
	public void user_is_on_the_home_page() {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com/login");
		 
		 System.out.println("The drive opened successfully");
	}
	@When("user enters the username as {string}")
	public void user_enters_the_username_as(String username) {
	    driver.findElement(By.id("Email")).sendKeys("dsfmf@gmail.com");
	    System.out.println("Username entered successfully");
	    
	}
	@Then("proceed to next action of entering password")
	public void proceed_to_next_action_of_entering_password() {
	    System.out.println("Passwrod should be entered");
	}
   
	
    @After("@tag3")
	@Given("User is on the demowebshop home page")
	public void user_is_on_the_demowebshop_home_page() {
	   System.out.println("The password box is accesible");
		
	}
	@When("user enters the passwrod as {string}")
	public void user_enters_the_passwrod_as(String password) {
	    driver.findElement(By.id("Password")).sendKeys("Kalai@123");
		
	}
	@Then("Clicking login button for navigating")
	public void clicking_login_button_for_navigating() {
	   System.out.println("Password entered successfully ");
	}

    @Before("@tag2")
	@Given("User entered the password and username")
	public void user_entered_the_password_and_username() {
	   System.out.println("The username and password entered successfully");
	}
	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
	   driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
	}
	
	@Then("Page is navigated")
	public void page_is_navigated() {
	    System.out.println("The page is successfully navigated to home page");
	   
	}
    





}
