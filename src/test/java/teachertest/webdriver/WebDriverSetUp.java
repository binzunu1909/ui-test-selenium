package teachertest.webdriver;

import org.openqa.selenium.WebDriver;

public interface WebDriverSetUp{
    WebDriver getWebDriver();
    void setUp();
    void tearDown();

}
