package Stepdefination;

import Utils.CommonFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends CommonFunctions {

    @Given("^When I'm on Home page \"([^\"]*)\"$")
    public void when_I_m_on_Home_page(String url) throws Throwable {
        driver.manage().window().maximize();
        driver.get(url);
        driver.findElement(By.xpath("//*[@id=\"cookie-consent-form\"]/div/div/div/button[2]")).click();

    }

    @When("^I click on sign in button$")
    public void i_click_on_sign_in_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"bhome\"]/div[2]/div/div/div/header/div/div/div[1]/div/ul/li[4]/a")).click();
        Thread.sleep(2000);
    }

    @When("^I enter valid email \"([^\"]*)\"$")
    public void i_enter_valid_email(String email) throws Throwable {
        driver.findElement(By.id("signin_email")).sendKeys(email);
        Thread.sleep(2000);
        
    }

    @When("^I enter valid password \"([^\"]*)\"$")
    public void i_enter_valid_password(String password) throws Throwable {
        driver.findElement(By.id("signin_password")).sendKeys(password);
        Thread.sleep(2000);
    }

    @When("^I click on signin$")
    public void i_click_on_signin() throws Throwable {
        driver.findElement(By.id("signin_submit")).click();

    }


    @Then("^i should get registered$")
    public void i_should_get_registered() throws Throwable {
        WebElement checkoutPageElement = driver.findElement(By.xpath("//*[@id=\"bhome\"]/div[2]/div/div/div/header/div/div/div[1]/div/ul/li[5]/a"));
        Assert.assertTrue(checkoutPageElement.isDisplayed());
        
    }
}
