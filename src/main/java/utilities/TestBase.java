package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestBase {

	@BeforeClass
    public void classLevelSetup() {
		Driver.getDriver();;
    }

    @AfterClass
    public void teardown() {
        Driver.closeDriver();
    }
	
}
