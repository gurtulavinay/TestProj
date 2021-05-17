package Stepdefination;

import Utils.CommonFunction;
import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Valuations extends CommonFunction {

    @Given("^When I'm on valuations page \"([^\"]*)\"$")
    public void when_I_m_on_valuations_page(String url) throws Throwable {
        driver.get(url);
        driver.manage().window().maximize();

    }

    @When("^I enter password \"([^\"]*)\"$")
    public void i_enter_password(String password) throws Throwable {
        driver.findElement(By.id("pwbox-6861")).sendKeys(password);

    }

    @When("^i click on enter$")
    public void i_click_on_enter() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"ajax-content-wrap\"]/div[2]/div/div/form/p[2]/input")).click();
        Thread.sleep(3000);
    }

    @When("^I scroll down the end$")
    public void i_scroll_down_the_end() throws Throwable {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2200)");
        Thread.sleep(3000);
    }

    @When("^I enter postcode \"([^\"]*)\"$")
    public void i_enter_postcode(String postcode) throws Throwable {
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        System.out.println("switch to iframe");
        driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys(postcode);
    }

    @When("^I click on find my address button$")
    public void i_click_on_find_my_address_button() throws Throwable {
        driver.findElement(By.id("btnFindAddress")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[5]/td[1]")).click();

    }

    @When("^I select property type$")
    public void i_select_property_type() throws Throwable {
        Select drpPropertyType = new Select(driver.findElement(By.name("propertyType")));
        drpPropertyType.selectByVisibleText("Bungalow");
        
    }

    @When("^i select property condition$")
    public void i_select_property_condition() throws Throwable {
        Select drpPropertyCondition = new Select(driver.findElement(By.name("condition")));
        drpPropertyCondition.selectByVisibleText("Good - recently redecorated");
        
    }
    @When("^I enter no of bedrooms \"([^\"]*)\"$")
    public void i_enter_no_of_bedrooms(String bedroom) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"bedrooms\"]")).sendKeys(bedroom);
        
    }

    @When("^I enter no of bathrooms \"([^\"]*)\"$")
    public void i_enter_no_of_bathrooms(String bathroom) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"bathrooms\"]")).sendKeys(bathroom);
        
    }

    @When("^I enter no of receptions \"([^\"]*)\"$")
    public void i_enter_no_of_receptions(String reception) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"receptions\"]")).sendKeys(reception);
        
    }

    @When("^I select valuations reason$")
    public void i_select_valuations_reason() throws Throwable {
        Select drpValuationReason = new Select(driver.findElement(By.xpath("//*[@id=\"valuationReason\"]")));
        drpValuationReason.selectByVisibleText("Within 3 months");

    }

    @When("^I click on next button$")
    public void i_click_on_next_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"form-total\"]/div[3]/ul/li[2]/a")).click();

    }
    @When("^i upload an images \"([^\"]*)\"$")
    public void i_upload_an_images(String image) throws Throwable {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        driver.findElement(By.id("image-label1")).click();
        WebElement chooseFile = driver.findElement(By.id("custom-input"));
        chooseFile.sendKeys(image);

        
    }

    @When("^I click on next$")
    public void i_click_on_next() throws Throwable {
        
    }

    @When("^I enter first name \"([^\"]*)\"$")
    public void i_enter_first_name(String arg1) throws Throwable {
        
    }

    @When("^I enter last name \"([^\"]*)\"$")
    public void i_enter_last_name(String arg1) throws Throwable {
        
    }

    @When("^I enter email \"([^\"]*)\"$")
    public void i_enter_email(String arg1) throws Throwable {
        
    }

    @When("^I enter mobile number \"([^\"]*)\"$")
    public void i_enter_mobile_number(String arg1) throws Throwable {
        
    }

    @When("^I select consent box$")
    public void i_select_consent_box() throws Throwable {
        
    }

    @Then("^I click on get valuations$")
    public void i_click_on_get_valuations() throws Throwable {
        
    }


}
