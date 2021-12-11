package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class St_def_GmailAuto {
	public static WebDriver driver;
	
	@Given("^I launch Gmail$")
	public void ilaunchGmail() throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\money heist\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		System.out.println("Launch Gmail");
		
	}
	@When("^I open Gmail Homepage$")
	public void iopenGmaileHomepage() throws Exception{
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("tautotest987@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("******");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(40000);
		System.out.println("I open Gmail Homepage");
		
	}
	@Then("^I verify that Compose button$")
	public void iverifythatComposebutton() throws Exception{
		System.out.println("compose button");
		driver.findElement(By.xpath("//div[contains(text(),'Compose')]")).click();
        Thread.sleep(5000);
				
	}
	@And("^I add To and Subject$")
	public void iaddToandSubject() throws Exception{
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("tamiz***@gmail.com");
        driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Incubyte");
        Thread.sleep(5000);
		System.out.println("Added TO Subject");
		
	}
	@And("^I add Content$")
	public void iaddContent() throws Exception{
		WebElement element = driver.findElement(By.xpath("//div[@role='textbox']"));
        element.sendKeys("Hi Team, \n Automation QA test for Incubyte. \n Thanks&Regards, \n Thamizhnilavan K");
        Thread.sleep(3000);
        
	}
	@Then("^I click send button$")
	public void iclicksendbutton() throws Exception
	{
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")).click();
		Thread.sleep(5000);
		System.out.println("Mail sent");
		driver.close();
		}
}
