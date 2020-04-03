package pageObjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;



import utilities.*;
import io.qameta.allure.Step;

public class HomePageObjects extends Driver {
 
    public HomePageObjects(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    
	@FindBy(id="header-signin-link")
	public WebElement signin;
	
	@FindBy(id="email")
	public WebElement email;
	
	@FindBy(id="password")
	public WebElement password;

	@FindBy(css="button[type=\"Submit\"]")
	public WebElement submit;

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

//    //Wait
//    public void waitVisibility(By by){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
//    }
}
