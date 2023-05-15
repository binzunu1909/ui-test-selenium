package teachertest.drive;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import teachertest.webdriver.WebDriverAction;
import teachertest.webdriver.WebDriverSetUp;
import teachertest.webdriver.WebDriverVerify;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Driver implements WebDriverSetUp, WebDriverAction, WebDriverVerify {

    private WebDriver webDriver;
    private WebDriverManager  webDriverManager;

    public Driver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @Override
    public WebDriver getWebDriver() {
        return webDriver;
    }

    @Override
    public void setUp() {
        webDriverManager.chromedriver().setup();
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
        assertNotEquals(exp, actual);
    }
}
