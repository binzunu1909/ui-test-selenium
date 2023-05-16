package teachertest.step;

import org.openqa.selenium.WebDriver;
import teachertest.action.Action;
import teachertest.drive.Driver;
import teachertest.entity.Model;

public class TeacherTestSteps {
    private WebDriver webDriver;
    private Driver driver;
    private Action action;
    private Model object = new Model("Hang","Nguyen","hang.nguyen@restaff.no");
    public TeacherTestSteps(WebDriver webDriver) {
        this.driver = new Driver(webDriver);
        this.action = new Action(this.driver.getWebDriver());
    }

    public void addTeacher(){
        driver.navigateTo("http://localhost:8081/teachers");

        String expectUrl =  driver.getURLCurrent();
        int originalQuantityTeacher = action.countObjects();

        action.clickAddButton().createNewObject(object);

        String actuallyUrl =  driver.getURLCurrent();
        int nowQuantityTeacher = action.countObjects();

        driver.verifyElementInt(originalQuantityTeacher,nowQuantityTeacher);
        driver.verifyElementString(expectUrl,actuallyUrl);
    }

    public void deleteTeacher(){
        int originalNumber = action.countObjects();
        action.clickDeleteButton();
        int nowNumber = action.countObjects();

        driver.verifyElementInt(originalNumber-1,nowNumber);
    }

    public void searchTeacher(){
        driver.navigateTo("http://localhost:8081/teachers");

        action.sendKeyInputSearch(object.getFirstName()).clickSearchButton();
    }
}
