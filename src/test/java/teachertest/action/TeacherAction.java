package teachertest.action;

import org.openqa.selenium.WebDriver;
import teachertest.drive.Driver;
import teachertest.entity.Teacher;
import teachertest.page.ui.NewTeacherUI;
import teachertest.page.ui.TeacherUI;

public class TeacherAction {
    private WebDriver webDriver;
    private Driver driver;
    private TeacherUI teacherUI;
    private NewTeacherUI newTeacherUI;

    public TeacherAction(WebDriver webDriver) {
        this.driver = new Driver(webDriver);
        this.teacherUI = new TeacherUI(this.driver.getWebDriver());
        this.newTeacherUI  = new NewTeacherUI(this.driver.getWebDriver());
    }

    public void addTeacher() throws InterruptedException {
        driver.navigateTo("http://localhost:8081/teachers");
        String expUrl =  driver.getURLCurrent();
        int originalNumber = teacherUI.numTeacher();

        teacherUI.clickAddTeacherButton();

        Teacher newTeacher = new Teacher("Hang","Nguyen","hang.nguyen@restaff.no");

        newTeacherUI.createNewTeacher(newTeacher);

        String actUrl =  driver.getURLCurrent();
        int nowNumber = teacherUI.numTeacher();

        driver.verifyElementInt(originalNumber,nowNumber);
        driver.verifyElementString(expUrl,actUrl);

        teacherUI.clickDeleteTeacherButton();
    }

    public void deleteTeacher() throws InterruptedException {

        int originalNumber = teacherUI.numTeacher();
        teacherUI.clickDeleteTeacherButton();
        int nowNumber = teacherUI.numTeacher();

        driver.verifyElementInt(originalNumber-1,nowNumber);
    }

}
