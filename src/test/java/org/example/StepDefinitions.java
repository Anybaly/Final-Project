package org.example;

import PageObjects.MainPage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {
    private final WebDriver driver = new ChromeDriver();
    private MainPage mainPage;

    public StepDefinitions() {
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
    }

    @Given("I am on the main page of the website")
    public void i_am_on_the_main_page_of_the_website() {
        driver.get("file:///Users/apple/Desktop/Testing-Env/index.html#");
    }

    @When("I click the button Instructors on the top of the page")
    public void i_click_the_button_on_the_top_of_the_page() {
        mainPage.clickOnInstructorButton();
    }

    @Then("I am taken to the instructors area")
    public void i_am_taken_to_the_instructors_area() {
        Assert.assertEquals("Our Instructors", mainPage.takenToInstructorArea());
    }

    @When("I click the email input field")
    public void i_click_the_email_input_field() {
        mainPage.clickOnEmailField();
        
    }

    @When("I input the email address {string}")
    public void i_input_the_email_address(String string) {
        mainPage.inputEmailAddress(string);
    }

    @When("I click the Submit button")
    public void i_click_the_submit_button() {
        mainPage.clickOnSubmitButton();
    }

    @Then("A pop-up should appear informing me I have been signed up for the newsletter.")
    public void a_pop_up_should_appear_informing_me_i_have_been_signed_up_for_the_newsletter() {
       driver.switchTo().alert().accept();
    }

    @When("I click the read more button on the hybrid section")
    public void i_click_the_read_more_button_on_the_hybrid_section() {
        Utils.scrollToElement(driver, mainPage.getHybridHeader() );
        mainPage.clickOnReadMoreButtonOnHibridSection();
    }

    @Then("I am taken to the {string} page")
    public void i_am_taken_to_the_page(String string) {
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith(string));
   }
    @Then("I click the return button")
    public void i_click_the_return_button() {
        mainPage.clickOnReturnButtonHybridSection();
    }
    @Then("I am taken on the main page of the website")
    public void i_am_taken_on_the_main_page_of_the_website() {
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith("software testing course"));
    }

    @Then("the border of the input field should become red and no pop-up should appear")
    public void the_border_of_the_input_field_should_become_red_and_no_pop_up_should_appear() {
        Assert.assertTrue(driver.getPageSource().contains("error"));
    }

    @After
    public void closeBrowser(Scenario scenario){
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "name");
        }
        driver.quit();
    }
}


