package teachertest.service.impl;

import teachertest.object.Teacher;
import teachertest.page.ui.NewTeacherUI;
import teachertest.page.ui.TeacherPage;
import teachertest.service.TeacherService;
import teachertest.drive.Driver;

public class TeacherServiceImpl implements TeacherService {
    private TeacherPage teacherPage;
    private NewTeacherUI newTeacherPage;
    private Driver driver;

    @Override
    public void clickableButtonAdd() {
        String exp = "http://localhost:8081/teachers/new";
        teacherPage.clickAddTeacherButton();

        driver.verifyElementString(exp,driver.getURLCurrent());
    }

    @Override
    public void clickableButtonUpdate() {
    }

    @Override
    public void clickableButtonDelete() {
        int originalNumber = teacherPage.numTeacher();
        teacherPage.clickDeleteTeacherButton();
        int nowNumber = teacherPage.numTeacher();

        driver.verifyElementInt(originalNumber,nowNumber);
    }

    @Override
    public void addTeacher() {
        String expUrl =  driver.getURLCurrent();
        int originalNumber = teacherPage.numTeacher();

        teacherPage.clickAddTeacherButton();

        Teacher teacher = new Teacher("Hang","Nguyen","hang.nguyen@restaff.no");

        newTeacherPage.sendKeyFirstName(teacher.getFirstName());
        newTeacherPage.sendKeyLastName(teacher.getLastName());
        newTeacherPage.sendKeyEmail(teacher.getEmail());
        newTeacherPage.clickSubmitNewButton();

        String actUrl =  driver.getURLCurrent();
        int nowNumber = teacherPage.numTeacher();

        driver.verifyElementInt(originalNumber,nowNumber);
        driver.verifyElementString(expUrl,actUrl);
    }

    @Override
    public void deleteTeacher() {
        addTeacher();

        int originalNumber = teacherPage.numTeacher();
        teacherPage.clickDeleteTeacherButton();
        int nowNumber = teacherPage.numTeacher();

        driver.verifyElementInt(originalNumber-1,nowNumber);
    }
}
