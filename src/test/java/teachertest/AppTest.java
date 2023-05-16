package teachertest;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import teachertest.drive.Driver;
import teachertest.step.TeacherTestSteps;


public class AppTest extends TestCase {

    private WebDriver webDriver;
    private Driver driver = new Driver(webDriver);
    private TeacherTestSteps testSteps;

    @Before
    public void setUp() {
        driver.setUp();
        testSteps = new TeacherTestSteps(driver.getWebDriver());
    }

    @Test
    public void testAddTeacher() {
        testSteps.addTeacher();
    }

    @Test
    public void testSearchTeacher() {
        testSteps.searchTeacher();
    }

    @After
    public void tearDown() {
        driver.tearDown();
    }
}
