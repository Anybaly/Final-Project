package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformation {

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement contactInformationHeader;

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement emailField;

    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement phoneField;

    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement countryField;

    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement cityField;

    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement postCodeField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement nextButton;

    public ContactInformation(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setEmailField(String string) {
        emailField.sendKeys(string);
    }

    public void setPhoneField(String string) {
        phoneField.sendKeys(string);
    }

    public void setCountryField(String string) {
        countryField.sendKeys(string);
    }

    public void setCityField(String string) {
        cityField.sendKeys(string);
    }

    public void setPostCodeField(String string) {
        postCodeField.sendKeys(string);
    }

    public void clickOnNextButton() {
        nextButton.click();
    }

    public String getContactInformationHeader() {
        return this.contactInformationHeader.getText();
    }

    public WebElement getNextButton() {
        return this.nextButton;
    }
}
