package teachertest.page.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import teachertest.page.action.NewTeacherAction;

public class NewTeacherUI implements NewTeacherAction {
    private WebDriver driver;
    @FindBy(name = "firstName")
    public static WebElement teacherFirstNameField;
    @FindBy(name = "lastName")
    public static WebElement teacherLastNameField;
    @FindBy(name = "email")
    public static WebElement teacherEmailField;
    @FindBy(className = "btn-primary")
    public static WebElement submitButton;

    public NewTeacherUI(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Override
    public void sendKeyFirstName(String s) {
        teacherFirstNameField.sendKeys(s);
    }

    @Override
    public void sendKeyLastName(String s) {
        teacherLastNameField.sendKeys(s);
    }

    @Override
    public void sendKeyEmail(String s) {
        teacherEmailField.sendKeys(s);
    }

    @Override
    public void clickSubmitNewButton() {
        submitButton.click();
    }
}
