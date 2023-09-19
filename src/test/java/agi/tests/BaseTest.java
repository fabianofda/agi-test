package agi.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {
    public static WebDriver driver;
    public static final String URL_BASE = "https://blogdoagi.com.br/";
    public static final String DRIVER = "src/test/java/agi/resource/chromedriver";

    @BeforeClass
    public static void inicializar() {
        System.setProperty("webdriver.chrome.driver", DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1600, 1024));
        driver.get(URL_BASE);
    }

    @AfterClass
    public static void finalizar(){
        driver.quit();
    }
    

}
