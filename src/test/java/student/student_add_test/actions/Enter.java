package student.student_add_test.actions;

import org.openqa.selenium.WebDriver;
import student.student_add_test.page.BaseActions;

public class Enter extends BaseActions {
    public Enter(WebDriver driver) {
        super(driver);
    }

    public static EnterBuilder theValue(String firstName) {
        return new EnterBuilder(firstName);
    }

    public static class EnterBuilder {

        private String firstName;
        public EnterBuilder(String firstName) {
            this.firstName = firstName;
        }


        public EnterBuilder and() {
            // TODO ;;;;;'
            return this;
        }

        public EnterBuilder so(String dd) {
            //TODO:
            return this;
        }

        public void into(String element) {
            enterValue(element, firstName);
        }
    }
}
