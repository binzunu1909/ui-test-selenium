package teachertest.page;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;
@Getter
@Setter
public class Teacher {
    private WebDriver driver;
    @FindBy(className = "mb-3")
    private WebElement addTeacherButton;
    @FindBy(className = "button-search")
    private WebElement searchTeacherButton;
    @FindBy(className = "button-refesh")
    private WebElement refeshTeacherButton;
    @FindBy(className = "button-update")
    private WebElement updateTeacherButton;
    @FindBy(className = "button-delete")
    private WebElement deleteTeacherButton;
    @FindBy(name = "firstName")
    private WebElement teacherFirstNameInputSearch;
    @FindBy(xpath = "//a[@class='btn btn-danger' and text()='Delete'] | /html/body/div/table/tbody/tr/td[1]")
    private List<WebElement> firstNameList;

    public Teacher(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
