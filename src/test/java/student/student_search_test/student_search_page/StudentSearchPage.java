package student.student_search_test.student_search_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import student.student_search_test.student_entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentSearchPage {
    private WebDriver driver;
    public StudentSearchPage(WebDriver driver) {
        this.driver = driver;
    }
    public void searchStudent (String firstName) {
        WebElement searchField = driver.findElement(By.name("firstName"));
        searchField.sendKeys(firstName);

        WebElement searchButton = driver.findElement(By.cssSelector("button[type='submit']"));
        searchButton.click();
    }
    public List<Student> getSearchResults() {
        List<Student> results = new ArrayList<>();
        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));

        for (WebElement row : rows) {
            WebElement firstNameCell = row.findElement(By.xpath("./td[1]"));
            WebElement lastNameCell = row.findElement(By.xpath("./td[2]"));
            WebElement emailCell = row.findElement(By.xpath("./td[3]"));

            Student student = new Student();
            student.setFirstName(firstNameCell.getText());
            student.setLastName(lastNameCell.getText());
            student.setEmail(emailCell.getText());

            results.add(student);
        }
        return results;
    }
}
