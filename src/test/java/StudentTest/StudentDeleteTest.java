package StudentTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Random;

public class StudentDeleteTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Set up the Chrome driver
        System.setProperty("webdriver.chrome.driver", "/Users/cuongnguyen-oceansmart/Downloads/chromedriver_mac_arm64/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://localhost:8081/students");
    }

    @Test
    public void testDeleteButton() {
        // Find one delete button and click it
        List<WebElement> deleteButtons = driver.findElements(By.xpath("//a[@class='btn btn-danger' and text()='Delete'] | /html/body/div/table/tbody/tr/td[4]/a[2]"));
        int randomIndex = new Random().nextInt(deleteButtons.size());
        System.out.println(randomIndex);
        WebElement randomDeleteButton = deleteButtons.get(randomIndex);

        WebElement firstName = driver.findElement(By.xpath("/html/body/div/table/tbody/tr["  +  (randomIndex+1)  +  "]/td[1]"));
        System.out.println(firstName.getText());
        randomDeleteButton.click();

        //Assert
            //store deletButtons.size() before and then compare them to after deleting
    }

    @After
    public void tearDown() {
        // Quit the driver
        driver.quit();
    }
}
