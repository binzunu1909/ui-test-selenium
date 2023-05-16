package student.student_add_test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseActions {
    public WebDriver driver;
    public BaseActions(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findElementByXpath(String element) {
        return driver.findElement(By.xpath(element));
    }
    public void navigatePage(String element) {
        driver.get(element);
    }

    public void enterValue(String element, String value){
        findElementByXpath(element).sendKeys(value);
    }
    //

    // Enter.theValue("abc").into(FIRST_NAME_FIELD)
    // Builder pattern...

    public void clickElement(String element) {
        findElementByXpath(element).click();
    }
}
