package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class FacebookLoginSteps {

    WebDriver driver;

    @Given("I launch Chrome Browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\FAHIM\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("I open facebook")
    public void i_open_facebook() {
        driver.get("https://www.facebook.com/");
    }

    @Then("I verify that logo present on page")
    public void i_verify_that_logo_present_on_page() {
        // Facebook logo XPath
        WebElement logo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
        Assert.assertEquals(true, logo.isDisplayed());
        
        if (logo.isDisplayed()) {
            System.out.println("Logo is displayed — Test Passed.");
        } else {
            System.out.println("Logo is NOT displayed — Test Failed.");
        }
    }

    @And("close Browser")
    public void close_browser() {
        driver.quit();
    }
}
