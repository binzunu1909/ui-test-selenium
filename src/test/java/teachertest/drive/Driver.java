package teachertest.drive;

import teachertest.webdriver.WebDriverAction;
import teachertest.webdriver.WebDriverSetUp;
import teachertest.webdriver.WebDriverVerify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class Driver implements WebDriverSetUp, WebDriverAction, WebDriverVerify {

    WebDriver webDriver;
    @Override
    public WebDriver getWebDriver() {
        return webDriver;
    }

    @Override
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    @Override
    public void tearDown() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }

    @Override
    public void navigateTo(String url) {
        webDriver.navigate().to(url);
    }

    @Override
    public String getURLCurrent() {
        webDriver.getCurrentUrl();
        String url = webDriver.getCurrentUrl();
        return url;
    }

    @Override
    public void verifyElementString(String exp, String actual) {
        assertEquals(exp, actual);
    }

    @Override
    public void verifyElementInt(int exp, int actual) {
        assertEquals(exp, actual);
    }
}
