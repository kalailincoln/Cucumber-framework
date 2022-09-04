package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Examplekeyword {
	WebDriver driver;
	

	@Given("Adactin login page is opened")
	public void adactin_login_page_is_opened() throws Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Cucumberbegin\\Driverfile\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://adactinhotelapp.com/index.php");
		  System.out.println("The Adactin login page was opened");
	    
	}
	@When("User enters the valid and invalid {string} and {string}")
	public void user_enters_the_valid_and_invalid_and(String Userid , String Password) throws Throwable{
		
				driver.findElement(By.name("username")).sendKeys(Userid);
		driver.findElement(By.name("password")).sendKeys(Password);
		
		System.out.println("The userid and password entered successfully");
	    
	}
	@When("User clicked the login button")
	public void user_clicked_the_login_button() throws Throwable {
		
		driver.findElement(By.id("login")).click();
		System.out.println("The login button is clickable and clicked");
	    
	}
	@Then("The page will navigate to search hotel")
	public void the_page_will_navigate_to_search_hotel() throws Throwable{
	  System.out.println("The page is succ");
	}




}
