package tests;

import io.qameta.allure.*;
import pageObjects.pages.HomePageObjects;
import pageObjects.pages.LoginPageObjects;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import utils.Listeners.TestListener;

//In order to eliminate attachment problem for Allure, you should add @Listener line.
@Listeners({ TestListener.class })
@Epic("Regression Tests")

public class LoginTests extends Base {


	@Test()
	public void ValidUserNameValidPassword () throws InterruptedException {  //InvalidUserNameInvalidPassword
		LoginPageObjects lP=new LoginPageObjects();
		HomePageObjects hP=new HomePageObjects();
		Driver.getDriver().navigate().to(ConfigurationReader.getProperty("url"));
		hP.signin.click();
		lP.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
		lP.submit.click();
		Thread.sleep(10000);
}
    
    



}