package student.student_add_test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateStudentPage extends BasePage {
    public CreateStudentPage(WebDriver driver) {
        super(driver);
    }
    public void fillFirstName (String firstName) {
        WebElement firstNameField = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstNameField.sendKeys(firstName);
    }
    public void fillLastName (String lastName) {
        WebElement lastNameField = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastNameField.sendKeys(lastName);
    }
    public void fillEmail (String email) {
        WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
        emailField.sendKeys(email);
    }
}
