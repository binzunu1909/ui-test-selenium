package student.student_add_test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StudentPage extends BasePage {
    public StudentPage(WebDriver driver) {
        super(driver);
    }
    public void navigateStudent() {
        driver.get("http://localhost:8081/students");
    }
    //click Add Student button
    public void clickAddStudent () {
        WebElement addStudentBtn = driver.findElement(By.xpath("//a[contains(@href, '/students/new')]"));
        addStudentBtn.click();
    }

}
