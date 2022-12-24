package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;

    @Before
    public void setUp() {
        // инициализация WebDriverManager
        WebDriverManager.chromedriver().setup();
        // создали драйвер для браузера Chrome
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        // Закрой браузер
        driver.quit();
    }
}