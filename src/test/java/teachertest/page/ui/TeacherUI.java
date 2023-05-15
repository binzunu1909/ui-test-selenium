package teachertest.page.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public class TeacherUI {
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


    public TeacherUI(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAddTeacherButton() {
        addTeacherButton.click();
    }


    public void clickUpdateTeacherButton() {
        updateTeacherButton.click();
    }


    public void clickDeleteTeacherButton() {
        deleteTeacherButton.click();
    }


    public void clickSearchTeacherButton() {
        searchTeacherButton.click();
    }


    public void clickRefeshTeacherButton() {
        refeshTeacherButton.click();
    }

//    @Override
//    public String getFirstNameText() {
//        return firstNameText.getText();
//    }
//
//    @Override
//    public String getLastNameText() {
//        return lastNameText.getText();
//    }
//
//    @Override
//    public String getEmailText() {
//        return emailText.getText();
//    }


    public void sendKeyTeacherFirstNameInputSearch(String s) {
        teacherFirstNameInputSearch.sendKeys(s);
    }


    public int numTeacher() {
       return firstNameList.size();
    }
}
