package student.student_add_test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import student.student_add_test.page.CreateStudentPage;
import student.student_add_test.page.StudentPage;
import student.student_add_test.page.StudentUI;
import student.student_add_test.webdriver.ChromeDriverSetup;
import student.student_add_test.webdriver.WebDriverSetup;
import student.student_search_test.student_entity.Student;

import java.util.ArrayList;

public class StudentAddTest {
    private WebDriverSetup webDriverSetup;
    private WebDriver driver;
    private StudentPage studentPage;
    private CreateStudentPage createStudentPage;
    private Student student;

    @Before
    public void setUp() {
        student = new Student("Jack", "Jill", "Billy@gill.com");
        webDriverSetup = new ChromeDriverSetup();
        driver = webDriverSetup.getDriver();
        studentPage = new StudentPage(driver);
        createStudentPage = new CreateStudentPage(driver);
    }
    @Test
    public void testAddStudent() {
        studentPage.navigateStudent(StudentUI.STUDENT_PAGE_URL);
        studentPage.clickAddStudent(StudentUI.ADD_STUDENT_BUTTON);
        createStudentPage.fillFirstName(StudentUI.INPUT_ID_FIRST_NAME, student.getFirstName());
        createStudentPage.fillLastName(StudentUI.INPUT_ID_LAST_NAME, student.getLastName());
        createStudentPage.fillEmail(StudentUI.INPUT_ID_EMAIL, student.getEmail());
        createStudentPage.clickSubmit(StudentUI.SUBMIT_BUTTON);
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
