package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstepdefinitions
{
	
	public static WebDriver driver;
	
	@Before
	public void setup()
	{
System.setProperty("webdriver.chrome.driver","S:\\ATJAN22SELENIUMTESTNGSETUP\\chromedriver\\chromedriver101\\chromedriver.exe");
		
		//Initiate WebDriver Instance
		 driver = new ChromeDriver();	
	}
	
	
	@Given(":User is on sbi login")
	public void user_is_on_sbi_login()
	{
		

		//Maximize the browser
		driver.manage().window().maximize();
			
			
		driver.navigate().to("https://retail.onlinesbi.com/retail/login.htm");   
		
		
		
	}

	@When(":user click on proceed to login")
	public void user_click_on_proceed_to_login()
	{
		 driver.findElement(By.xpath("//div[@class='continue_btn']/child::a")).click();
	}

	@Then(":All controls on login page should be visible")
	public void all_controls_on_login_page_should_be_visible()
	{
		System.out.println("USer validated all controls are visible");  
	}

	@Then(":User enters username and password")
	public void user_enters_username_and_password() 
	{
		driver.findElement(By.id("username")).sendKeys("abc");
		driver.findElement(By.id("label2")).sendKeys("123");
	}

	@Then(": User clicks on login button")
	public void user_clicks_on_login_button() 
	{
		driver.findElement(By.id("Button2")).click();  
	}

	@Then(":Validate user is logged in")
	public void validate_user_is_logged_in()
	{
		 System.out.println("User logged in successfully");
	}

	@After
	public void teardown()
	{
		
		driver.quit();
	}
	
	
	

}
