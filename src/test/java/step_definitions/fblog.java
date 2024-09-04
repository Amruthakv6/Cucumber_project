package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class fblog { 
	WebDriver driver;
	@Given("User on the user facebook login page")
	public void user_on_the_user_facebook_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\dell\\\\Desktop\\\\Automation\\\\chromedriver-win64\\\\chromedriver.exe");
	   driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com");
	    
	}

	@When("user enters valid email address or phone number")
	public void user_enters_valid_email_address_or_phone_number() {
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("amrutha@1224");
	} 

	@When("User enters a valid password")
	public void user_enters_a_valid_password() {
		WebElement password = driver.findElement(By.xpath("//*[starts-with(@name, 'pass')]"));
		password.sendKeys("123467");
	}

	@Then("User clicks the submit button and the user login should be successfull")
	public void user_clicks_the_submit_button_and_the_user_login_should_be_successfull() {
		WebElement logins = driver.findElement(By.xpath("//*[starts-with(@type, 'submit' )]"));
		logins.click();
		
	    
	}




}
