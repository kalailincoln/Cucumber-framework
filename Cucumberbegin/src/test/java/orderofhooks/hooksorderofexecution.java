package orderofhooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class hooksorderofexecution {
	public static WebDriver driver;

    @After(order = 4)
	@Given("Demoweb shopping page is opened")
	public void demoweb_shopping_page_is_opened() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com/login");
		   WebElement email = driver.findElement(By.id("Email"));
			email.sendKeys("dsfmf@gmail.com");
			WebElement password = driver.findElement(By.id("Password"));
			password.sendKeys("Kalai@123");
			driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	        System.out.println("The demowebshop HOME page is oepned");
	}
    @After(order = 1)
	@When("user selects the Books option")
	public void user_selects_the_books_option() {
		driver.findElement(By.linkText("Books")).click();
	    System.out.println("Books option selected");
	}
    
	@After(order = 2)
	@When("User selects the computers option")
	public void user_selects_the_computers_option() {
		driver.findElement(By.linkText("Computers")).click();
		System.out.println("Computer option selected");
	}
	@After(order = 3)
	@When("User clicks the Electronics")
	public void user_clicks_the_electronics() {
		driver.findElement(By.linkText("Electronics")).click();
		System.out.println("Electronics options selected");
	}
    
//	@When("User clicks the search button")
//	public void user_clicks_the_search_button() {
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		System.out.println("User clicks the search button");
//	}



}