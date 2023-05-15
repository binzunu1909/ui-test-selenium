package student.student_add_test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateStudentPage extends BaseActions {

    public CreateStudentPage(WebDriver driver) {
        super(driver);
    }
    public void fillFirstName () {
        enterValue(StudentUI.INPUT_ID_FIRST_NAME, StudentUI.FIRST_NAME);
    }
    public void fillLastName () {
        enterValue(StudentUI.INPUT_ID_LAST_NAME, StudentUI.LAST_NAME);
    }
    public void fillEmail () {
       enterValue(StudentUI.INPUT_ID_EMAIL, StudentUI.EMAIL);
    }
    public void clickSubmit () {
        clickButton(StudentUI.BUTTON_CONTAINS_TYPE_SUBMIT);
    }
}
