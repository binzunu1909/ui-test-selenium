package teachertest;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import teachertest.drive.Driver;
import teachertest.action.TeacherAction;


public class AppTest extends TestCase {

    private WebDriver webDriver;
    private Driver driver = new Driver(webDriver);
    private TeacherAction teacherService;

    @Before
    public void setUp() {
        driver.setUp();
        teacherService = new TeacherAction(driver.getWebDriver());
    }

    @Test
    public void testAddTeacher() throws InterruptedException {
        teacherService.addTeacher();
    }

    @After
    public void tearDown() {
        driver.tearDown();
    }
}
