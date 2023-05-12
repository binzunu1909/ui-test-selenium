package teachertest.page.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import teachertest.page.action.TeacherAction;

import java.util.List;

public class TeacherPage implements TeacherAction {
    private WebDriver driver;

    @FindBy(className = "button-add")
    public static WebElement addTeacherButton;

    @FindBy(className = "button-search")
    public static WebElement searchTeacherButton;

    @FindBy(className = "button-refesh")
    public static WebElement refeshTeacherButton;

    @FindBy(className = "button-update")
    public static WebElement updateTeacherButton;

    @FindBy(className = "button-delete")
    public static WebElement deleteTeacherButton;

    @FindBy(className = "td-firstName")
    public static WebElement firstNameText;

    @FindBy(className = "td-lastName")
    public static WebElement lastNameText;

    @FindBy(className = "td-email")
    public static WebElement emailText;

    @FindBy(name = "firstName")
    public static WebElement teacherFirstNameInputSearch;

    @FindBy(xpath = "//a[@class='btn btn-danger' and text()='Delete'] | /html/body/div/table/tbody/tr/td[1]")
    public static List<WebElement> firstNameList;

    public TeacherPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Override
    public void clickAddTeacherButton() {
        addTeacherButton.click();
    }

    @Override
    public void clickUpdateTeacherButton() {
        updateTeacherButton.click();
    }

    @Override
    public void clickDeleteTeacherButton() {
        deleteTeacherButton.click();
    }

    @Override
    public void clickSearchTeacherButton() {
        searchTeacherButton.click();
    }

    @Override
    public void clickRefeshTeacherButton() {
        refeshTeacherButton.click();
    }

    @Override
    public String getFirstNameText() {
        return firstNameText.getText();
    }

    @Override
    public String getLastNameText() {
        return lastNameText.getText();
    }

    @Override
    public String getEmailText() {
        return emailText.getText();
    }

    @Override
    public void sendKeyTeacherFirstNameInputSearch(String s) {
        teacherFirstNameInputSearch.sendKeys(s);
    }

    @Override
    public int numTeacher() {
       return firstNameList.size();
    }
}
