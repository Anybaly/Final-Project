package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseOption {

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/h3")
    private WebElement courseOptionsHeader;

    public CourseOption(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getCourseOptionsHeader() {
        return this.courseOptionsHeader.getText();
    }
}
