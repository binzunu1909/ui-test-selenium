package student.student_search_test.driver_setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverSetup implements WebDriverSetup {

    @Override
    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/cuongnguyen-oceansmart/Downloads/chromedriver_mac_arm64/chromedriver");
        return new ChromeDriver();
    }
}
