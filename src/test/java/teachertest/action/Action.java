package teachertest.action;

import org.openqa.selenium.WebDriver;
import teachertest.page.Teacher;
import teachertest.page.NewTeacher;
import teachertest.entity.Model;

public class Action {
    private WebDriver driver;
    private Teacher teacher;
    private NewTeacher newTeacher;

    public Action(WebDriver driver) {
        this.driver = driver;
        this.teacher = new Teacher(driver);
        this.newTeacher = new NewTeacher(driver);
    }

    public Action clickAddButton() {
        teacher.getAddTeacherButton().click();
        return this;
    }
    public Action clickUpdateButton() {
        teacher.getUpdateTeacherButton().click();
        return this;
    }
    public Action clickDeleteButton() {
        teacher.getDeleteTeacherButton().click();
        return this;
    }
    public Action clickSearchButton() {
        teacher.getSearchTeacherButton().click();
        return this;
    }
    public Action clickRefeshButton() {
        teacher.getRefeshTeacherButton().click();
        return this;
    }
    public Action sendKeyInputSearch(String s) {
        teacher.getTeacherFirstNameInputSearch().sendKeys(s);
        return this;
    }
    public int countObjects() {
        return teacher.getFirstNameList().size();
    }
    public Action sendKeyFirstName(String s) {
        newTeacher.getTeacherFirstNameField().sendKeys(s);
        return this;
    }
    public Action sendKeyLastName(String s) {
        newTeacher.getTeacherLastNameField().sendKeys(s);
        return this;
    }
    public Action sendKeyEmail(String s) {
        newTeacher.getTeacherEmailField().sendKeys(s);
        return this;
    }
    public Action clickSubmitNewButton() {
        newTeacher.getSubmitButton().click();
        return this;
    }
    public Action createNewObject(Model newTeacher) {
        sendKeyFirstName(newTeacher.getFirstName());
        sendKeyLastName(newTeacher.getLastName());
        sendKeyEmail(newTeacher.getEmail());
        clickSubmitNewButton();
        return this;
    }
}
