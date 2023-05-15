package student.student_add_test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import student.student_add_test.page.StudentPage;
import student.student_add_test.webdriver.ChromeDriverSetup;
import student.student_add_test.webdriver.WebDriverSetup;
import student.student_search_test.student_entity.Student;

public class StudentAddTest {
    private WebDriverSetup webDriverSetup;
    private WebDriver driver;
    private StudentPage studentPage;
    @Before
    public void setUp() {
        webDriverSetup = new ChromeDriverSetup();
        driver = webDriverSetup.getDriver();
        studentPage = new StudentPage(driver);
    }
    @Test
    public void testAddStudent() {
        studentPage.navigateStudent();
        studentPage.clickAddStudent();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
