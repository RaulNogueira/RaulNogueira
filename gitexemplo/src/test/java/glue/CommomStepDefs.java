
package glue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import environment.ConfigProperties;
import io.cucumber.java.en.*;
import pageObjects.ObjectProperties;

public class CommomStepDefs {
	WebDriver driver = null;
	public String windowBefore;
	
	@Given("browser is open")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to(ConfigProperties.property.getProperty("AppURL"));
		driver.manage().window().maximize();
		
	}

	@When("user needs to autenticate")
	public void login() throws InterruptedException {
	   inputText(ConfigProperties.property.getProperty("User"), "LoginPage.txtEmail");
	   Thread.sleep(1500);
	   inputText(ConfigProperties.property.getProperty("Password"), "LoginPage.txtPassword");
	}

	@Then("^user types \"(.*?)\" on \"(.*)\"$")
	public void inputText(String texto,String caminho) {
	   WebElement webElement = driver.findElement(By.xpath(ObjectProperties.getElementProperty(caminho)));
	   webElement.sendKeys(texto);
	}
	
	@Then("^user clear the text Area \"(.*)\"$")
	public void clearInputText(String caminho) {
	   WebElement webElement = driver.findElement(By.xpath(ObjectProperties.getElementProperty(caminho)));
	   webElement.clear();
	}

	@Given("^user click on \"(.*)\"$")
	public void click(String caminho) {
		WebElement webElement = driver.findElement(By.xpath(ObjectProperties.getElementProperty(caminho)));
		webElement.click();
	}
	
	@And("user wait 2 seconds$")
	public void waitSeconds() throws InterruptedException {
		 Thread.sleep(3000);
	}
	
	@And("user switch to new window and save window")
	public void SwitchToNextWindow() throws InterruptedException {
		 String windowHandleBefore = driver.getWindowHandle();
		 
		 for(String winHandle : driver.getWindowHandles()) {
			 driver.switchTo().window(winHandle);
		 }
		 Thread.sleep(1500);
		 
		 windowBefore = windowHandleBefore;
	}
	
	@And("^user return to the last window")
	public void returnToLastWindow() throws InterruptedException {
		 driver.switchTo().window(windowBefore);
	}
	
	@Then("^user closes the browser$")
	public void userClosesBrowser() {
		driver.quit();
	}
}
