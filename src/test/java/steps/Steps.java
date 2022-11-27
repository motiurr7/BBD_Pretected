package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {

	WebDriver driver;
	WebElement element;
	
	@Given("user navigate to homepageP")
	public void user_navigate_to_homepageP() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://www.pretected.com/");
		System.out.println("This is Given");
	}

	@Given("user select auto")
	public void user_select_auto() {
		element = driver.findElement(By.xpath("//img[@alt='Car Insurance']"));
		element.click();
		System.out.println("This is Given");
	}
	
	@Given("user select home")
	public void user_select_home() {
		element = driver.findElement(By.xpath("//img[@alt='Home Insurance']"));
		element.click();
		System.out.println("This is Given");
	}
	
	

	
	@Given("user input zipcode")
	public void user_input_zipcode() {
		element = driver.findElement(By.xpath("//form[@class='main-form']//div[@class='main-form__group main-form__group--zip']//input[@class='zip']"));
		element.sendKeys("11203");
		System.out.println("This is Given");
	}

	@Given("click get started")
	public void click_get_started() {
		element = driver.findElement(By.xpath("//form[@class='main-form']//div[@class='main-form__group']//button[@class='btn btn--big']"));
		element.click();
		System.out.println("This is When");
	}



	@Then("user will be in details")
	public void user_will_be_in_details() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Continue Pop Up");
	}


	
}
