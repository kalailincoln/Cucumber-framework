package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demowebshopstep {
	WebDriver driver;

	@Given("The demoweb login page is opened")
	public void the_demoweb_login_page_is_opened() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		System.out.println("The login page visible");

	}

	@When("Customer enters the {string} and {string}")
	public void customer_enters_the_and(String Email, String Password) {

		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(Password);

		System.out.println("Credentials entered");
	}

	@When("Customer clicks login button")
	public void customer_clicks_login_button() {

		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();

		System.out.println("Login clickable");

	}

	@Then("The page is navigated to home")
	public void the_page_is_navigated_to_home() {

		System.out.println("Successfully navigated");

	}

}
