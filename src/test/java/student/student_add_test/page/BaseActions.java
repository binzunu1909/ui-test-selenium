package student.student_add_test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseActions {
    public static WebDriver driver;
    public BaseActions(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement findElementByXpath(String element) {
        return driver.findElement(By.xpath(element));
    }
    public void navigatePage(String element) {
        driver.get(element);
    }

    public static void enterValue(String element, String value){
        findElementByXpath(element).sendKeys(value);
    }

    // Enter.theValue("abc").into(FIRST_NAME_FIELD)
    // Builder pattern... method chaining... fluent API

    public void clickElement(String element) {
        findElementByXpath(element).click();
    }
}
