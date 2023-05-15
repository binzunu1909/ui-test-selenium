package teachertest;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import teachertest.drive.Driver;
import teachertest.service.TeacherService;
import teachertest.service.impl.TeacherServiceImpl;


public class AppTest extends TestCase {

    private WebDriver webDriver;
    private Driver driver = new Driver(webDriver);
    private TeacherService teacherService;
don
    @Before
    public void setUp() {
        driver.setUp();
        teacherService = new TeacherServiceImpl(driver.getWebDriver());
    }

    @Test
    public void testAddTeacher() throws InterruptedException {
        teacherService.addTeacher();
    }

//    @Test
//    public void testDeleteTeacher() throws InterruptedException {
//        teacherService.deleteTeacher();
//    }

    @After
    public void tearDown() {
        driver.tearDown();
    }
}
