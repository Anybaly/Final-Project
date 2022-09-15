package org.example;

import PageObjects.ContactInformation;
import PageObjects.CourseOption;
import PageObjects.MainPage;
import PageObjects.PersonalInformation;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
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
    private PersonalInformation personalInformation;
    private ContactInformation contactInformation;
    private CourseOption courseOption;

    public StepDefinitions() {
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        personalInformation = new PersonalInformation(driver);
        contactInformation = new ContactInformation(driver);
        courseOption = new CourseOption(driver);
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
        mainPage.clickOnReadMoreButtonOnHybridSection();
    }

    @Then("I am taken to the {string} page")
    public void i_am_taken_to_the_page(String string) {
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith(string));
    }
    @When("I click the return button")
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

    @Given("I am on the main page of the website")
    public void iAmOnTheFirstPageOfTheWebsite() {
        driver.get("file:///Users/apple/Desktop/Testing-Env/index.html#");
    }

    @When("I click the read more button on the virtual section")
    public void iClickTheReadMoreButtonOnTheVirtualSection() {
        Utils.scrollToElement(driver, mainPage.getVirtualHeader());
        mainPage.clickOnReadMoreButtonOnVirtualSection();
    }

    @Then("I am taken to the virtual page")
    public void iAmTakenToTheVirtualPage() {
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith("virtual"));
    }

    @When("I click the what you'll learn link")
    public void iClickTheWhatYouLlLearnLink() {
        mainPage.clickOnWhatYouLearnLink();
    }

    @And("I click the read more button from the learn the fundamentals area")
    public void iClickTheReadMoreButtonFromTheLearnTheFundamentalsArea() {
        Utils.scrollToElement(driver, mainPage.getFundamentalsPageHeader());
        mainPage.clickOnReadMoreButtonFromTheLearnTheFundamentals();
    }

    @Then("I will be redirected to the fundamentals page")
    public void iWillBeRedirectedToTheFundamentalsPage() {
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith("fundamentals"));
    }

    @When("I click on questions link")
    public void iClickOnQuestionsLink() {
        mainPage.clickOnQuestionsLink();
    }

    @When("I click on start the enrollment button")
    public void i_click_on_start_the_enrollment_button() {
        mainPage.clickOnEnrollmentButton();
    }
    @Then("I will be redirected to register page")
    public void i_will_be_redirected_to_register_page() {
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith("software testing | enrollment"));
    }

    @When("I click the where is your institution located button")
    public void i_click_the_where_is_your_institution_located_button() {
        mainPage.clickOnInstitutionQuestionButton();
    }
    @Then("the information of the location of the institution appears")
    public void the_information_of_the_location_of_the_institution_appears() {
        Assert.assertTrue(mainPage.isCollapsed());
    }
    @Then("I will be redirected to the frequently asked questions area")
    public void i_will_be_redirected_to_the_frequently_asked_questions_area() {
        Assert.assertEquals("Frequently Asked Questions", mainPage.getQuestionsHeader());
    }

    @And("I click on Sara Smith Instagram page")
    public void iClickOnSaraSmithInstagramPage() {
        mainPage.clickOnSaraSmithInstagramPage();
    }

    @Then("I will be redirected to her Instagram page")
    public void iWillBeRedirectedToHerInstagramPage() {
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith("instagram"));
    }

    @After
    public void closeBrowser(Scenario scenario){
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "name");
        }
        driver.quit();
    }

    @Given("I am on the Personal information section from the Enrollment Page")
    public void iAmOnThePersonalInformationSectionFromTheEnrollmentPage() {
        driver.get("file:///Users/apple/Desktop/Testing-Env/routes/enrollment.html");
    }

    @When("I enter informations in the other place holders")
    public void iEnterInformationsInTheOtherPlaceHolders() {

    }

    @And("I clicked the Next button")
    public void iClickedTheNextButton() {
        //personalPage.clickOnNextButton();
    }

    @When("I enter {string} as First Name")
    public void i_enter_as_first_name(String string) {
        personalInformation.setFirstNameField(string);
    }
    @When("{string} as Last Name")
    public void as_last_name(String string) {
        personalInformation.setLastNameField(string);
    }
    @When("{string} as Username")
    public void as_username(String string) {
        personalInformation.setUsernameField(string);
    }
    @When("{string} as Password")
    public void as_password(String string) {
        personalInformation.setPasswordField(string);
    }
    @When("{string} as Confirm Password")
    public void as_confirm_password(String string) {
        personalInformation.setConfirmPasswordField(string);
    }
    @When("I click on Next button")
    public void i_click_on_next_button() {
        Utils.scrollToElement(driver, personalInformation.getNextButton());
        personalInformation.clickOnNextButton();
    }
    @Then("I will be redirected to the Contact information step")
    public void i_will_be_redirected_to_the_contact_information_step() {
        Assert.assertEquals("Contact information", contactInformation.getContactInformationHeader());
    }

    @Given("I am on the Contact information page")
    public void i_am_on_the_contact_information_page() {
        driver.get("file:///Users/apple/Desktop/Testing-Env/routes/enrollment.html");
        personalInformation.fillInPersonalInformationValidData(driver);
    }
    @When("I enter {string} as email")
    public void i_enter_as_email(String string) {
        contactInformation.setEmailField(string);
    }
    @When("{string} as phone")
    public void as_phone(String string) {
        contactInformation.setPhoneField(string);
    }
    @When("{string} as country")
    public void as_country(String string) {
        contactInformation.setCountryField(string);
    }
    @When("{string} as city")
    public void as_city(String string) {
        contactInformation.setCityField(string);
    }
    @When("{string} as postcode")
    public void as_postcode(String string) {
        contactInformation.setPostCodeField(string);
    }
    @When("I click on Next button for Contact Information")
    public void i_click_on_next_button_for_contact_information() {
        Utils.scrollToElement(driver, contactInformation.getNextButton());
        contactInformation.clickOnNextButton();
    }
    @Then("I will be redirected to the Course option step")
    public void i_will_be_redirected_to_the_course_option_step() {
        Assert.assertEquals("Course options", courseOption.getCourseOptionsHeader());
    }


}


