package teachertest.service.impl;

import org.openqa.selenium.WebDriver;
import teachertest.drive.Driver;
import teachertest.entity.Teacher;
import teachertest.page.ui.NewTeacherUI;
import teachertest.page.ui.TeacherUI;
import teachertest.service.TeacherService;

public class TeacherServiceImpl implements TeacherService {
    private WebDriver webDriver;
    private Driver driver;
    private TeacherUI teacherUI;
    private NewTeacherUI newTeacherUI;

    public TeacherServiceImpl(WebDriver webDriver) {
        this.driver = new Driver(webDriver);
        this.teacherUI = new TeacherUI(this.driver.getWebDriver());
        this.newTeacherUI  = new NewTeacherUI(this.driver.getWebDriver());
    }

    @Override
    public void addTeacher() throws InterruptedException {
        driver = this.driver;

        driver.navigateTo("http://localhost:8081/teachers");
        String expUrl =  driver.getURLCurrent();
        int originalNumber = teacherUI.numTeacher();

        teacherUI.clickAddTeacherButton();

        newTeacherUI.createNewTeacher("Hang","Nguyen","hang.nguyen@restaff.no");

        String actUrl =  driver.getURLCurrent();
        int nowNumber = teacherUI.numTeacher();

        driver.verifyElementInt(originalNumber,nowNumber);
        driver.verifyElementString(expUrl,actUrl);

        teacherUI.clickDeleteTeacherButton();
    }

    @Override
    public void deleteTeacher() throws InterruptedException {

        int originalNumber = teacherUI.numTeacher();
        teacherUI.clickDeleteTeacherButton();
        int nowNumber = teacherUI.numTeacher();

        driver.verifyElementInt(originalNumber-1,nowNumber);
    }

}
