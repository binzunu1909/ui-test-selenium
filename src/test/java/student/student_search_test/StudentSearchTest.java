package student.student_search_test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import student.student_search_test.driver_setup.ChromeDriverSetup;
import student.student_search_test.driver_setup.WebDriverSetup;
import student.student_search_test.student_entity.Student;
import student.student_search_test.student_search_page.StudentSearchPage;

import java.util.List;

public class StudentSearchTest {
    private WebDriverSetup webDriverSetup;
    private WebDriver driver;

    @Before
    public void setUp() {
        // Set up the Chrome driver
        webDriverSetup = new ChromeDriverSetup();
        driver = webDriverSetup.getDriver();
    }

    @Test
    public void testSearchStudent() {
        // Navigate to the search student page
        driver.get("http://localhost:8081/students/search");

        // Enter a student first name into the search form
        StudentSearchPage searchPage = new StudentSearchPage(driver);
        searchPage.searchStudent("123");


        List<Student> results = searchPage.getSearchResults();
        Assert.assertFalse(results.isEmpty());

        for (Student student : results) {
            Assert.assertEquals(student.getFirstName(), "123");
            Assert.assertNotNull(student.getLastName());
            Assert.assertNotNull(student.getEmail());
        }
    }

    @After
    public void tearDown() {
        // Close the Chrome driver
        driver.quit();
    }
}
