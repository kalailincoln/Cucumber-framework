package randomutils;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class randomutilsdefinition {
	public static WebDriver driver;
		
	


	@Given("client opens the orange HRM login page")
	public void client_opens_the_orange_hrm_login_page() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 System.out.println("The login page opened");
	}
	@When("client enters the below valid username and password")
	public void client_enters_the_below_valid_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		String random = RandomStringUtils.randomAlphanumeric(5);
		List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);
		driver.findElement(By.id("txtUsername")).sendKeys(data.get(0).get("username") +random);
		driver.findElement(By.id("txtPassword")).sendKeys(data.get(0).get("Password"));
		System.out.println("Username and password entered");
		
	    
	}
	@When("client clicks the login button")
	public void client_clicks_the_login_button() {
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login is clicked");
	    
	}
	@Then("The HRM is navigated to Home page")
	public void the_hrm_is_navigated_to_home_page() {
		System.out.println("The page is successfully navigated");
	    
	}




}
