package pageObjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utilities.Driver;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;

public class LoginPageObjects  {

    public LoginPageObjects(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
	@FindBy(xpath="//input[@id='login-username']")
	public static WebElement email;
	
	@FindBy(xpath="password")
	public WebElement password;

	@FindBy(xpath="//input[@id='login-signin']")
	public WebElement submit;
	
	
    public LoginPageObjects login(String username, String password) throws InterruptedException {
    	
//    	PageFactory.initElements(Driver.getDriver(), LoginPageObjects.class);
    	Thread.sleep(5000);
    	BrowserUtils.highlightElement(email).sendKeys(username);
    	//BrowserUtils.highlightElement(email).sendKeys(password);
        return this;
    }
    
    //Click Method
    public void click(By elementLocation) {
        Driver.getDriver().findElement(elementLocation).click();
    }

    //Write Text
    public void writeText(By elementLocation, String text) {
    	Driver.getDriver().findElement(elementLocation).sendKeys(text);
    }

    //Read Text
    public String readText(By elementLocation) {
        return Driver.getDriver().findElement(elementLocation).getText();
    }


    //Verify Username Condition
    public LoginPageObjects verifyLoginUserName(String expectedText) {
  
    	BrowserUtils.waitForVisibility(errorMessageUsernameXpath, 20);
        Assert.assertEquals(errorMessageUsernameXpath, expectedText);
        return this;
    }

//    //Verify Password Condition
//    public LoginPageObjects verifyLoginPassword(String expectedText) {
//        waitVisibility(errorMessagePasswordXpath);
//        Assert.assertEquals(readText(errorMessagePasswordXpath), expectedText);
//        return this;
//    }
    
    /**Web Elements*/
    By userNameId = By.id("email");
    By passwordId = By.id("password");
    By loginButtonId = By.id("loginButton");
    By errorMessageUsernameXpath = By.xpath("//*[@id=\"loginForm\"]/div[1]/div/div");
    By errorMessagePasswordXpath = By.xpath("//*[@id=\"loginForm\"]/div[2]/div/div ");
}
