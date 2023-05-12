package teachertest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;
import teachertest.drive.Driver;
import teachertest.service.TeacherService;
import teachertest.service.impl.TeacherServiceImpl;

import static org.junit.Assert.*;

public class TestSeleniumForTeacher {
    Driver driver;
    TeacherService teacherService;

    @Before
    public void setup(){
        driver.setUp();
    }

    @After
    public void tearDown(){
        driver.tearDown();
    }
}