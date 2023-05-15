package student.student_add_test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StudentPage extends BaseActions {

    public StudentPage(WebDriver driver) {
        super(driver);
    }
    public void navigateStudent(String studentPageURL) {
        navigatePage(studentPageURL);
    }
    public void clickAddStudent (String addStudentBtnElement) {
        clickElement(addStudentBtnElement);
    }
}
