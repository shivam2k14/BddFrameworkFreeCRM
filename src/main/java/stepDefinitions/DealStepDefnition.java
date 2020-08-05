package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealStepDefnition {
	
	 WebDriver driver;
//	 
//		
//	 @Given("^user is already on Login Page$")
//	 public void user_already_on_login_page(){ 
//		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ShivamMaurya\\Documents\\IBM_TESTING\\latestSeleniumSoftware\\chromedriver.exe");
//		 
//		 driver = new ChromeDriver();
//	     driver.get("https://www.freecrm.com/index.html"); 
//	 
//	 }
//	 
//	 
//	 @When("^title of login page is Free CRM$")
// 	 public void title_of_login_page_is_free_CRM(){
//   String title = driver.getTitle();
//	 System.out.println(title);
//	 Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);
//	 }
//	 
//	 @Then("^user enters username and password$")
//   public void user_enters_username_and_password(DataTable credentials){
//		 List<List<String>> data = credentials.raw();
//		 driver.manage().window().maximize();
//		 driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")).click();
//		 try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	 driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
//	 driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//	 }
//	
//	 @Then("^user clicks on login button$")
//	 public void user_clicks_on_login_button() {
//	 WebElement loginBtn =
//	 driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));
//	 JavascriptExecutor js = (JavascriptExecutor)driver;
//	 js.executeScript("arguments[0].click();", loginBtn);
//	 }
//	
//	 @SuppressWarnings("deprecation")
//	@Then("^user is on home page$")
//	 public void user_is_on_hopme_page(){
//		 String title = driver.getTitle();
//		 System.out.println("Home Page title ::"+ title);
//		 Assert.assertEquals("Cogmento CRM", title);
//		 }
//	 
//	 @Then("^user moves to new deal page$")
//	 public void user_moves_to_new_contact_page() throws InterruptedException {
//		 Thread.sleep(3000);
//		Actions action = new Actions(driver);
//		
//		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[5]/span"))).click().build().perform();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[3]/button")).click();
//		
//		}
//	 
//	 @Then("^user enters deal details$")
//	 public void user_enters_contacts_details(DataTable dealData){
//		 List<List<String>> dealValues =  dealData.raw();
//		 driver.findElement(By.name("title")).sendKeys(dealValues.get(0).get(0));
//		 driver.findElement(By.name("amount")).sendKeys(dealValues.get(0).get(1));
//		 driver.findElement(By.name("probability")).sendKeys(dealValues.get(0).get(2));
//		 driver.findElement(By.name("commission")).sendKeys(dealValues.get(0).get(3));
//		 
//		 driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")).click();
//	 }
//	 
//	 @Then("^Close the browser$")
//	 public void close_the_browser(){
//		 driver.quit();
//	 }
//	

}


