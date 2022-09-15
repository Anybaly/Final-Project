package PageObjects;

import org.example.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy (xpath = "//*[@id=\"navmenu\"]/ul/li[3]/a")
    private WebElement instructorsButton;

    @FindBy (xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement emailField;

    @FindBy (xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitButton;

    @FindBy (xpath = "//*[@id=\"instructors\"]/div/h2")
    private WebElement instructorsHeader;

    @FindBy (xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement hybridSection;

    @FindBy (xpath = "file:///Users/apple/Desktop/Testing-Env/routes/hybrid.html")
    private WebElement hybridPage;

    @FindBy (xpath = "/html/body/a")
    private WebElement returnButton;

    @FindBy (xpath = "/html/body/section[3]/div/div/div[2]/div/div/h3")
    private WebElement hybridHeader;

    @FindBy (xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement virtualSection;

    @FindBy (xpath = "file:///Users/apple/Desktop/Testing-Env/routes/virtual.html")
    private WebElement virtualPage;

    @FindBy (xpath = "/html/body/section[3]/div/div/div[1]/div/div/h3")
    private WebElement virtualHeader;

    @FindBy (xpath = "//*[@id=\"navmenu\"]/ul/li[1]/a")
    private WebElement whatYouLearnLink;

    @FindBy (xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")
    private WebElement readMoreButtonFromTheLearnTheFundamentals;

    @FindBy (xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/h2")
    private WebElement fundamentalsPageHeader;

    @FindBy (xpath = "//*[@id=\"navmenu\"]/ul/li[2]/a")
    private WebElement questionsLink;

    @FindBy (xpath = "//*[@id=\"questions\"]/div/h2")
    private WebElement questionSectionHeader;

    @FindBy (xpath = "//*[@id=\"questions\"]/div[1]/h3/button")
    private WebElement institutionQuestionsButton;

    @FindBy (xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement enrollmentButton;

    @FindBy (xpath = "//*[@id=\"instructors\"]/div/div/div[4]/div/div/a[3]/i")
    private WebElement saraSmithInstagramLink;

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

    public String takenToInstructorArea() {
        return this.instructorsHeader.getText();
    }

    public void clickOnReadMoreButtonOnHybridSection() {
        this.hybridSection.click();
    }

    public String takenToHybridPage() {
        return this.hybridPage.getText();
    }

    public void clickOnReturnButtonHybridSection() {
        this.returnButton.click();
    }

    public WebElement getHybridHeader() {
        return this.hybridHeader;
    }

    public WebElement getVirtualHeader(){
        return this.virtualHeader;
    }

    public void clickOnReadMoreButtonOnVirtualSection(){
        this.virtualSection.click();
    }

    public void clickOnWhatYouLearnLink(){
        this.whatYouLearnLink.click();
    }

    public void clickOnReadMoreButtonFromTheLearnTheFundamentals(){
        this.readMoreButtonFromTheLearnTheFundamentals.click();
    }

    public WebElement getFundamentalsPageHeader(){
        return this.fundamentalsPageHeader;
    }

    public void clickOnQuestionsLink(){
        this.questionsLink.click();
    }

    public String getQuestionsHeader() {
        return this.questionSectionHeader.getText();
    }

    public void clickOnInstitutionQuestionButton(){
        this.institutionQuestionsButton.click();
    }

    public boolean isCollapsed() {
        //return question.findElement(By.cssSelector("collapsed"));
        // TODO Contact Andrei to fix this
        return true;
    }

    public void clickOnEnrollmentButton() {
        this.enrollmentButton.click();
    }

    public void clickOnSaraSmithInstagramPage() {
        this.saraSmithInstagramLink.click();
    }
}
