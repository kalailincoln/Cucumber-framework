package com.adactinproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinitionsadactin {
 public static WebDriver driver;
	

	@Given("User is on the login page")
	public void user_is_on_the_login_page() throws Throwable {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/index.php");
		 
				System.out.println("Adactin Login page opened");
	}
	@When("User enters the valid username as {string}")
	public void user_enters_the_valid_username_as(String user)  {
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("lincolnkalai");
	}
	@When("User enters the valid password as {string}")
	public void user_enters_the_valid_password_as(String pass)  {
	      WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Kalai@lincoln123");
	}
	@When("User clicks the login button")
	public void user_clicks_the_login_button()  {
		
		WebElement log = driver.findElement(By.id("login"));
		log.click();
	}
	@Then("The page is navigated to Adactin search hotel page")
	public void the_page_is_navigated_to_adactin_search_hotel_page() {
	    System.out.println("The page is navigated to search hotel page ");
	}

 
   
	@Given("User is on the search hotel page")
	public void user_is_on_the_search_hotel_page() {
	    
	}
	@When("Customer selects the location")
	public void customer_selects_the_location() throws NullPointerException, InterruptedException {
		Thread.sleep(2000);
		WebElement location = driver.findElement(By.xpath("(//select[@class='search_combobox'])[1]"));
		Select loc = new Select(location);
		loc.selectByVisibleText("Brisbane");
	}
	@When("Customer select the hotel type")
	public void customer_select_the_hotel_type()  {
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select hot = new Select(hotels);
		hot.selectByIndex(2);
	}
	@When("Customer select room type")
	public void customer_select_room_type() {
		WebElement roomtype = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select room = new Select(roomtype);
		room.selectByIndex(4);
	    
	}
	@When("Customer selects number of rooms")
	public void customer_selects_number_of_rooms() {
		WebElement noofrooms = driver.findElement(By.id("room_nos"));
		Select number = new Select(noofrooms);
		number.selectByValue("5");
	}
	@When("Customer selects the check-in and Check out date")
	public void customer_selects_the_check_in_and_check_out_date() {

	    WebElement checkin = driver.findElement(By.xpath("//input[@id='datepick_in']"));
	    checkin.sendKeys("11/07/2022");
	    WebElement checkout = driver.findElement(By.xpath("//input[contains(@name,'datepick_out')]"));
		checkout.sendKeys("12/07/2022");
	}
	@When("Customer selects the Adults per room")
	public void customer_selects_the_adults_per_room() {
		WebElement adults = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select ad = new Select(adults);
		ad.selectByValue("4");
		
	}
	@When("Customer selects the children per room")
	public void customer_selects_the_children_per_room() {
		WebElement childrens = driver.findElement(By.id("child_room"));
		Select childs = new Select(childrens);
		childs.selectByIndex(2);
		
	}
	@When("Search button is clicked")
	public void search_button_is_clicked() {
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
	}
	@Then("The page is navigated to Select Hotel with details")
	public void the_page_is_navigated_to_select_hotel_with_details() {
	   System.out.println("The page is navigated to select hotel page");
	}
	@Given("User is on the select hotel page")
	public void user_is_on_the_select_hotel_page() {
	    
	}
	@When("Customer clicks the select radio button")
	public void customer_clicks_the_select_radio_button()throws Throwable {
		WebElement radiobutton =  driver.findElement(By.id("radiobutton_0"));
		radiobutton.click();
	}
	@When("Customer clicks the continue button")
	public void customer_clicks_the_continue_button() throws Throwable{
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
		System.out.println("The continue button is clickable ");
	}
	@Then("The Book a Hotel page is visible")
	public void the_book_a_hotel_page_is_visible()throws Throwable {
	     System.out.println("The BOOK HOTEL page is visible ");
//	}
//
//	@Given("User is on the Book hotel page")
//	public void user_is_on_the_book_hotel_page()throws Throwable {
//	    
//	}
//	@When("Customer checks the details and Enter the first name as {string}")
//	public void customer_checks_the_details_and_enter_the_first_name_as(String first)throws Throwable {
//		WebElement firstname = driver.findElement(By.id("first_name"));
//		firstname.sendKeys("Kalaiarasan");
//	}
//	@When("Customer enters the last name {string}")
//	public void customer_enters_the_last_name(String last) throws Throwable{
//		WebElement lastname = driver.findElement(By.id("last_name"));
//		lastname.sendKeys("Sekar");
//	}
//	@When("Customer enters the billing address as {string}")
//	public void customer_enters_the_billing_address_as(String address) throws Throwable{
//		WebElement billaddress = driver.findElement(By.id("address"));
//		billaddress.sendKeys("190 PT KANNAN NAGAR VPM");
//	}
//	@When("Customer enters the credit card number as {string}")
//	public void customer_enters_the_credit_card_number_as(String credit) throws Throwable{
//		WebElement creditcardnum = driver.findElement(By.id("cc_num"));
//		creditcardnum.sendKeys("8765432112345678");
//	}
//		
//	@When("Customer selects the credit card Type")
//	public void customer_selects_the_credit_card_type() throws Throwable{
//		WebElement cardtype = driver.findElement(By.id("cc_type"));
//		Select cctype = new Select(cardtype);
//		cctype.selectByVisibleText("VISA");
//	}
//	@When("Customer selects the expiry date of credit card with Month and Year")
//	public void customer_selects_the_expiry_date_of_credit_card_with_month_and_year() throws Throwable{
//		WebElement ccexp = driver.findElement(By.id("cc_exp_month"));
//		Select expiry = new Select(ccexp);
//		expiry.selectByVisibleText("December");
//		
//		WebElement ccexpyear = driver.findElement(By.id("cc_exp_year"));
//		Select expyear = new Select(ccexpyear);
//		expyear.selectByVisibleText("2022");
//	}
//	@When("Customer Enters the CVV number")
//	public void customer_enters_the_cvv_number() throws Throwable{
//		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
//		cvv.sendKeys("556");
//	}
//	@When("Book now button is clicked")
//	public void book_now_button_is_clicked() throws Throwable{
//		WebElement booknow = driver.findElement(By.id("book_now"));
//		booknow.click();
//	}
//	@Then("The Processing message is displayed and page is navigated to booking confirmation")
//	public void the_processing_message_is_displayed_and_page_is_navigated_to_booking_confirmation() throws Throwable{
//	   System.out.println("The processing message is displayed and navigated to confirmation");
//	}
//
//	@Given("Booking confirmation is visible to the user")
//	public void booking_confirmation_is_visible_to_the_user() throws Throwable {
//	    System.out.println("Booking confirmation is visible to the user");
//	}
//	@When("Customer can verify all the details")
//	public void customer_can_verify_all_the_details() throws Throwable{
//		System.out.println("The details are able to be verified");
//	    
//	}
//	@When("Customer clicks the Logout button")
//	public void customer_clicks_the_logout_button() throws Throwable{
//	    driver.findElement(By.id("logout")).click();
//	}
//	@Then("The Adactin booking page succedfully logged out")
//	public void the_adactin_booking_page_succedfully_logged_out() throws Throwable{
//	   
//		System.out.println("The page is successfully logged out ");
//	}
//
//
//
//
//    
//
//
}
}


