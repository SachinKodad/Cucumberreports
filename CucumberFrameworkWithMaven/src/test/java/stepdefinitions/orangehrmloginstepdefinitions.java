package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orangehrmloginstepdefinitions 
{
	WebDriver driver;
	
	@Before
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","S:\\ATJAN22SELENIUMTESTNGSETUP\\chromedriver\\chromedriver101\\chromedriver.exe");
	    driver = new ChromeDriver();
	}
	
	@Given("user navigates to orange hrm")
	public void user_navigates_to_orange_hrm() 
	{
		
	    driver.manage().window().maximize();
	 	driver.get("https://opensource-demo.orangehrmlive.com");        
	}

	@When("user validates all login  controls are visible")
	public void user_validates_all_login_controls_are_visible()
	{
	    System.out.println("All controls are visible");
	}

	

	@Then("Application should display login  successful")
	public void application_should_display_login_successful() 
	{
	    System.out.println("Login successfull");
	}

	
	@Then("Application should display login  Unsuccessful")
	public void application_should_display_login_unsuccessful() 
	{
	    System.out.println("Login unsuccessfull");
	}
	
	@Then("Click on login button")
	public void click_on_login_button() 
	{
		driver.findElement(By.className("button")).click();
	}
	
	@Then("user enters correct username {string}")
	public void user_enters_correct_username(String string)
	{
		
		driver.findElement(By.id("txtUsername")).sendKeys(string);
	}
	    

	@Then("user enters correct password {string}")
	public void user_enters_correct_password(String string)
	{
		driver.findElement(By.id("txtPassword")).sendKeys(string);  
	}

	@Then("user enters Incorrect username {string}")
	public void user_enters_incorrect_username(String string)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(string); 
	}

	@Then("user enters Incorrect password {string}")
	public void user_enters_incorrect_password(String string) 
	{
		driver.findElement(By.id("txtPassword")).sendKeys(string); 
	}

	
	@After
	public void teardown()
	{
		
		driver.close();
	}


}
