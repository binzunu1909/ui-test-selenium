package student.student_add_test.actions;

import lombok.Builder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import student.student_add_test.page.BaseActions;

public class Find extends BaseActions {
    private String action;
    public Find(WebDriver driver) { super(driver); }

    public static FindBuilder element(String addStudentButton) {
        return new FindBuilder(addStudentButton);
    }
    public static class FindBuilder {
        private String addStudentButton;
        public FindBuilder(String addStudentButton) { this.addStudentButton = addStudentButton; }

        public void click() {
            findElementByXpath(addStudentButton).click();
        }
    }
}
