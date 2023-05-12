package StudentTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudentSearchTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Set up the Chrome driver
        System.setProperty("webdriver.chrome.driver", "/Users/cuongnguyen-oceansmart/Downloads/chromedriver_mac_arm64/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testSearchStudent() {
        // Navigate to the search student page
        driver.get("http://localhost:8081/students/search");

        // Enter a student first name into the search form
        WebElement searchField = driver.findElement(By.name("firstName"));
        searchField.sendKeys("123");

        // Click the search button
        WebElement searchButton = driver.findElement(By.cssSelector("button[type='submit']"));
        searchButton.click();

        // Verify that the search results table contains at least one row with the student's first name, last name, and email
        WebElement firstNameCell = driver.findElement(By.xpath("//table/tbody/tr/td[1]"));
        WebElement lastNameCell = driver.findElement(By.xpath("//table/tbody/tr/td[2]"));
        WebElement emailCell = driver.findElement(By.xpath("//table/tbody/tr/td[3]"));

        Assert.assertEquals(firstNameCell.getText(), "123");
        Assert.assertNotNull(lastNameCell.getText());
        Assert.assertNotNull(emailCell.getText());
    }

    @After
    public void tearDown() {
        // Close the Chrome driver
        driver.quit();
    }
}
