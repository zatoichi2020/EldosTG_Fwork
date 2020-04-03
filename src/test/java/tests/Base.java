package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utilities.Driver;

public class Base extends Driver {
    
	WebDriver driver = Driver.getDriver();;
	WebDriverWait wait= new WebDriverWait(driver, 20);
	
	@BeforeClass
    public void classLevelSetup() {
		driver = this.driver;
    }

    @BeforeMethod
    public void methodLevelSetup() {

    }

    @AfterClass
    public void teardown() {
        Driver.closeDriver();
    }
    

    

}
//    driver.get(ConfigurationReader.getProperty("url"));
//    BrowserUtils.highlightElement(BrowserUtils.waitForVisibility(HomepageObjects.Demo, timer)).click();
//    BrowserUtils.highlightElement(BrowserUtils.waitForVisibility(loginPage.email, timer)).sendKeys(manager.getDataList().get(0).get("Manager UserName"));
//    BrowserUtils.highlightElement(BrowserUtils.waitForVisibility(loginPage.password, timer)).sendKeys(manager.getDataList().get(0).get("Manager Password"));
//    BrowserUtils.highlightElement(BrowserUtils.waitForVisibility(loginPage.loginBtn, timer)).click();
//    wait.until(ExpectedConditions.titleContains("Inbox"));
//    BrowserUtils.highlightElement(BrowserUtils.waitForVisibility(purchasePage.purchases, timer)).click();
//    wait.until(ExpectedConditions.titleContains("Requests "));