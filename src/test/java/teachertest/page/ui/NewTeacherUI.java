package teachertest.page.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import teachertest.entity.Teacher;

public class NewTeacherUI{
    private WebDriver driver;
    @FindBy(name = "firstName")
    private WebElement teacherFirstNameField;
    @FindBy(name = "lastName")
    private WebElement teacherLastNameField;
    @FindBy(name = "email")
    private WebElement teacherEmailField;
    @FindBy(className = "btn-primary")
    private WebElement submitButton;

    public NewTeacherUI(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void sendKeyFirstName(String s) {
        teacherFirstNameField.sendKeys(s);
    }


    public void sendKeyLastName(String s) {
        teacherLastNameField.sendKeys(s);
    }


    public void sendKeyEmail(String s) {
        teacherEmailField.sendKeys(s);
    }


    public void clickSubmitNewButton() {
        submitButton.click();
    }


    public void createNewTeacher(Teacher newTeacher) {

        sendKeyFirstName(newTeacher.getFirstName());
        sendKeyLastName(newTeacher.getLastName());
        sendKeyEmail(newTeacher.getEmail());

        clickSubmitNewButton();
    }


}
