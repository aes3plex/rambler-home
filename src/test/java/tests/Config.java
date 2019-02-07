package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * SetUp & TearDown methods
 */
public class Config {
    public static WebDriver driver;
    private static final String ENDPOINT = "https://www.rambler.ru/";

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\eva\\Desktop\\Yandex\\Selenium\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get(ENDPOINT);
        System.out.println("Driver has been installed");
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
        System.out.println("Driver has been closed");
    }
}
