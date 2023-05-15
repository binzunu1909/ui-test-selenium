package student.student_add_test.page;

import org.openqa.selenium.WebDriver;

public class CreateStudentPage extends BaseActions {

    public CreateStudentPage(WebDriver driver) {
        super(driver);
    }
    public void fillFirstName (String firstName, String element) {
        enterValue(firstName, element);
    }
    public void fillLastName (String lastName, String element) {
        enterValue(lastName, element);
    }
    public void fillEmail (String email, String element) {
       enterValue(email, element);
    }
    public void clickSubmit (String submitBtnElement) {
        clickElement(submitBtnElement);
    }
}
