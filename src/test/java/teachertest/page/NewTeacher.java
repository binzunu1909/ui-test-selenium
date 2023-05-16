package teachertest.page;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
@Getter
@Setter
public class NewTeacher {
    private WebDriver driver;
    @FindBy(name = "firstName")
    private WebElement teacherFirstNameField;
    @FindBy(name = "lastName")
    private WebElement teacherLastNameField;
    @FindBy(name = "email")
    private WebElement teacherEmailField;
    @FindBy(className = "btn-primary")
    private WebElement submitButton;

    public NewTeacher(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
