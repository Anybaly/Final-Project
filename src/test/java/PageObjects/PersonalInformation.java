package PageObjects;

import org.example.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInformation {

    @FindBy (xpath = "//*[@id=\"firstName\"]")
    private WebElement firstNameField;

    @FindBy (xpath = "//*[@id=\"lastName\"]")
    private WebElement lastNameField;

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement usernameField;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement confirmPasswordField;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement nextButton;

    public PersonalInformation(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void setFirstNameField(String string) {
        this.firstNameField.sendKeys(string);
    }

    public void setLastNameField(String string) {
        this.lastNameField.sendKeys(string);
    }

    public void setUsernameField(String string) {
        this.usernameField.sendKeys(string);
    }

    public void setPasswordField(String string) {
        this.passwordField.sendKeys(string);
    }

    public void setConfirmPasswordField(String string) {
        this.confirmPasswordField.sendKeys(string);
    }

    public void clickOnNextButton() {
        this.nextButton.click();
    }

    public WebElement getNextButton() {
        return this.nextButton;
    }

    public void fillInPersonalInformationValidData(WebDriver driver) {
        this.firstNameField.sendKeys("Test");
        this.lastNameField.sendKeys("Test");
        this.usernameField.sendKeys("Test");
        this.passwordField.sendKeys("Test");
        this.confirmPasswordField.sendKeys("Test");
        Utils.scrollToElement(driver, nextButton);
        this.nextButton.click();
    }

}
