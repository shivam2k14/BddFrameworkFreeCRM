package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {

	 WebDriver driver;
	 
	/*
	 @Given("^user is already on Login Page$")
 	 public void user_already_on_login_page(){ 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ShivamMaurya\\Documents\\IBM_TESTING\\latestSeleniumSoftware\\chromedriver.exe");
		 
		 driver = new ChromeDriver();
 	     driver.get("https://www.freecrm.com/index.html"); 
 	 
 	 }
	 
	 
	 @When("^title of login page is Free CRM$")
  	 public void title_of_login_page_is_free_CRM(){
    String title = driver.getTitle();
	 System.out.println(title);
	 Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);
	 }
	 
	 

//	
	 //hardcoded value
//	 @Then("^user enters username and password$")
//	 public void user_enters_username_and_password(){
//		 driver.manage().window().maximize();
//		 driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")).click();
//		 try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	 driver.findElement(By.name("email")).sendKeys("shivammauryauiet@gmail.com");
//	 driver.findElement(By.name("password")).sendKeys("Shivam@1423");
//	 }
	 

//	 //Reg Exp:
//	 //1. \"([^\"]*)\"
	 
//	 //2. \"(.*)\"
	 @Then("^user enters \"(.*)\" and \"(.*)\"$")
	 public void user_enters_username_and_password(String username, String password){
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")).click();
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 driver.findElement(By.name("email")).sendKeys(username);
	 driver.findElement(By.name("password")).sendKeys(password);
	 }
	
	 @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button() {
	 WebElement loginBtn =
	 driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click();", loginBtn);
	 }
	
	
	 @Then("^user is on home page$")
	 public void user_is_on_hopme_page(){
		 String title = driver.getTitle();
		 System.out.println("Home Page title ::"+ title);
		 Assert.assertEquals("Cogmento CRM", title);
		 }
	 
	 
	 @Then("^user moves to new contact page$")
	 public void user_moves_to_new_contact_page() throws InterruptedException {
		//driver.switchTo().frame("mainpanel");
		//
		//action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		//driver.switchTo().frame(2);
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[3]/span"))).click().build().perform();
		 //driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[3]/span")).click();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button/i")).click();
		
		}
	 
	 
	 @Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	 public void user_enters_contacts_details(String firstname, String lastname, String position){
		 driver.findElement(By.name("first_name")).sendKeys(firstname);
		 driver.findElement(By.name("last_name")).sendKeys(lastname);
		 driver.findElement(By.name("description")).sendKeys(position);
		 driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")).click();
	 }
	 
	 
	 
	 @Then("^close the browser$")
	 public void closeBroser()
	 {
		 driver.quit();
	 }
	*/
}
