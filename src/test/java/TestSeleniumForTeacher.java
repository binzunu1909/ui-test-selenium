import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;
import static org.junit.Assert.*;

public class TestSeleniumForTeacher {
    WebDriver driver;
    WebDriverManager webDriverManager;

    @Before
    public void testBefore(){
        webDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("Browser is running....");
    }

    @Test
    public void checkClickableAddTeacher(){
        driver.navigate().to("http://localhost:8081/teachers");
        WebElement element = driver.findElement(By.className("mb-3"));
        element.click();
        String urlExp = "http://localhost:8081/teachers/new";
        String urlAct = driver.getCurrentUrl();
        assertEquals(urlExp, urlAct);
    }

    @Test
    public void addTeacher(){
        driver.navigate().to("http://localhost:8081/teachers/new");
        WebElement element1 = driver.findElement(By.id("firstName"));
        element1.sendKeys("Hang");
        WebElement element2 = driver.findElement(By.id("lastName"));
        element2.sendKeys("Nguyen");
        WebElement element3 = driver.findElement(By.id("email"));
        element3.sendKeys("hang.nguyen@restaff.no");
        WebElement element4 = driver.findElement(By.className("btn"));
        element4.click();
        WebElement element5 = driver.findElement(By.xpath("/html/body/div/table/tbody/tr[3]/td[1]"));
        WebElement element6 = driver.findElement(By.xpath("/html/body/div/table/tbody/tr[3]/td[2]"));
        WebElement element7 = driver.findElement(By.xpath("/html/body/div/table/tbody/tr[3]/td[3]"));
        String urlExp1 = "Hang";
        String urlAct1 = element5.getText();
        String urlExp2 = "Nguyen";
        String urlAct2 = element6.getText();
        String urlExp3 = "hang.nguyen@restaff.no";
        String urlAct3 = element7.getText();
        assertEquals(urlExp1, urlAct1);
        assertEquals(urlExp2, urlAct2);
        assertEquals(urlExp3, urlAct3);
    }

    @Test()
    public void checkClickableUpdateTeacher(){
        driver.navigate().to("http://localhost:8081/teachers");
        WebElement element = driver.findElement(By.xpath("/html/body/div/table/tbody/tr[1]/td[4]/a[1]"));
        element.click();
        String urlExp = "http://localhost:8081/teachers/edit/1";
        String urlAct = driver.getCurrentUrl();
        assertEquals(urlExp, urlAct);
    }

    @Test
    public void updateTeacher() throws InterruptedException {
        driver.navigate().to("http://localhost:8081/teachers/edit/1");
        WebElement element = driver.findElement(By.name("email"));
        element.clear();
        element.sendKeys("cuong.nguyen@gmail.com");
        WebElement element1 = driver.findElement(By.className("btn"));
        element1.click();
        WebElement element2 = driver.findElement(By.xpath("/html/body/div/table/tbody/tr[1]/td[3]"));
        String urlExp1 = "cuong.nguyen@gmail.com";
        String urlAct1 = element2.getText();
        assertEquals(urlExp1, urlAct1);
    }

    @Test
    public void deleteTeacher() throws InterruptedException {
        Thread.sleep(2000);
        driver.navigate().to("http://localhost:8081/teachers");
        WebElement element = driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[4]/a[2]"));
        element.click();
        WebElement element1 = driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[1]"));
        String urlExp1 = "Jacob";
        String urlAct1 = element1.getText();
        assertFalse(urlAct1.equals(urlExp1));
    }
//
//    @Test
//    public void searchTeacher(){
//
//    }

    @After
    public void tearDown(){
        driver.quit();
        System.out.println("Browser is stopping");
    }

}