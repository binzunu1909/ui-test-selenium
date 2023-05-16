package student.student_add_test;

import lombok.Getter;
import lombok.Setter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import student.student_add_test.actions.Enter;
import student.student_add_test.actions.Find;
import student.student_add_test.page.CreateStudentPage;
import student.student_add_test.page.StudentPage;
import student.student_add_test.page.StudentUI;
import student.student_add_test.webdriver.ChromeDriverSetup;
import student.student_add_test.webdriver.WebDriverSetup;
import student.student_add_test.entity.Student;

@Getter
@Setter
public class StudentAddTest {
    private WebDriverSetup webDriverSetup;
    private WebDriver driver;
    private StudentPage studentPage;
    private CreateStudentPage createStudentPage;
    private Student student;
    private Enter enter;

    @Before
    public void setUp() {
        student = new Student("Builder", "method", "build=me@gmail.com");
        webDriverSetup = new ChromeDriverSetup();
        driver = webDriverSetup.getDriver();
        studentPage = new StudentPage(driver);
        createStudentPage = new CreateStudentPage(driver);
    }
    @Test
    public void testAddStudent() {
        studentPage.navigateStudent(StudentUI.STUDENT_PAGE_URL);


        Find.element(StudentUI.ADD_STUDENT_BUTTON).click();
        Enter.theValue(student.getFirstName()).into(StudentUI.INPUT_ID_FIRST_NAME);
        /*Click.On("");
        Tap.On("");
        Select.option("car").into("serlectobox");
        Drag.element("d").to("dd");*/

        createStudentPage.fillLastName(StudentUI.INPUT_ID_LAST_NAME, student.getLastName());
        createStudentPage.fillEmail(StudentUI.INPUT_ID_EMAIL, student.getEmail());
        createStudentPage.clickSubmit(StudentUI.SUBMIT_BUTTON);
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
