package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[3]/a")
    private WebElement instructorsButton;

    @FindBy (xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement emailField;

    @FindBy (xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitButton;

    @FindBy (xpath = "//*[@id=\"instructors\"]/div/h2")
    private WebElement instructorHeader;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement hybridSection;

    @FindBy (xpath = "file:///Users/apple/Desktop/Testing-Env/routes/hybrid.html")
    private WebElement hybridPage;

    @FindBy (xpath = "/html/body/a")
    private WebElement returnButton;

    @FindBy (xpath = "/html/body/section[3]/div/div/div[2]/div/div/h3")
    private WebElement hybridHeader;

    public MainPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickOnInstructorButton(){
        this.instructorsButton.click();
    }

    public void clickOnEmailField(){
        this.emailField.click();
    }

    public void inputEmailAddress(String string){
        this.emailField.sendKeys(string);
    }

    public void clickOnSubmitButton(){
        this.submitButton.click();
    }

    public String takenToInstructorArea(){
        return this.instructorHeader.getText();
    }

    public void clickOnReadMoreButtonOnHibridSection(){
        this.hybridSection.click();
    }

    public String takenToHibridPage(){
        return this.hybridPage.getText();
    }

    public void clickOnReturnButtonHybridSection(){
        this.returnButton.click();
    }

    public WebElement getHybridHeader() {
        return this.hybridHeader;
    }
}
