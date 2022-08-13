package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSeleniumBasics {


	public static void main(String[] args) {
		//To add driver to the code
		WebDriverManager.chromedriver().setup();
		//Open a browser
		ChromeDriver driver = new ChromeDriver();
		//To Launch the URL
		driver.get("http://leaftaps.com/opentaps");
		//To maximize the browser
		driver.manage().window().maximize();
		//To close thr browser
		//driver.close();
		System.out.println("The browser is launched successfully");
		//To Enter the username
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		//To Enter Password
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		//To login
		WebElement elementLoginbutton = driver.findElement(By.className("decorativeSubmit"));
		elementLoginbutton.click();
		//To verify Login
		WebElement welcomeMessage = driver.findElement(By.tagName("h2"));
		String text = welcomeMessage.getText();
		System.out.println(text);
		//To click on the crm link
		WebElement elementClickcrmsfa = driver.findElement(By.linkText("CRM/SFA"));
		elementClickcrmsfa.click();
		WebElement elementClickleads = driver.findElement(By.linkText("Leads"));
		elementClickleads.click();
		WebElement elementCreateleads = driver.findElement(By.linkText("Create Lead"));
		elementCreateleads.click();
		WebElement elementCompanyname = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyname.sendKeys("Testleaf");
		WebElement elementFirstname = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstname.sendKeys("Manick");
		WebElement elementLastname = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastname.sendKeys("Venkat");
		WebElement elementSourcedd = driver.findElement(By.id("createLeadForm_dataSourceId"));
		elementSourcedd.sendKeys("Direct Mail");
		WebElement elementIndustrydd = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd = new Select (elementIndustrydd);
		dd.selectByIndex(3);
		WebElement elementOwnershipdd = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dd1 = new Select (elementOwnershipdd);
		dd1.selectByVisibleText("Partnership");
		WebElement elementMarketingcampdd = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd2 = new Select (elementMarketingcampdd);
		dd2.selectByValue("CATRQ_AUTOMOBILE");
		//Entering department name
		WebElement elementDeptname = driver.findElement(By.name("departmentName"));
		elementDeptname.sendKeys("Information Technology");
		//Entering description
		WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
		elementDescription.sendKeys("The Company is well known for its Quality and Success");
		//Entering Email
		WebElement elementEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementEmail.sendKeys("manickandanvenkat@gmail.com");
		//Selecting state from Dropdown
		WebElement elementState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd3 = new Select (elementState);
		dd3.selectByVisibleText("New York");
		//Create the form
		WebElement elementCreatebutton = driver.findElement(By.name("submitButton"));
		elementCreatebutton.click();
		//Getting title
		String titlepage = driver.getTitle();
		System.out.println("The title of the page is: "+titlepage);
		//Duplicate button
		WebElement elementDuplicatebutton = driver.findElement(By.linkText("Duplicate Lead"));
		elementDuplicatebutton.click();
		//Clearing and entering values
		WebElement elementCompanynamenew = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanynamenew.clear();
		elementCompanynamenew.sendKeys("Test Leaf Move Ahead");
		WebElement elementFirstnamenew = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstnamenew.clear();
		elementFirstnamenew.sendKeys("Manickandan");
		WebElement elementCreatebuttonagain = driver.findElement(By.name("submitButton"));
		elementCreatebuttonagain.click();
		//Getting title
		String titlepageagain = driver.getTitle();
		System.out.println("The title of the page after new Flow is: "+titlepageagain);
		

	}

}
