package co.com.banistmo.util;

import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriver {

    public static ChromeDriver driver;

    public static ChromeDriver chrome(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/files/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.es/");
        SerenityWebdriverManager.inThisTestThread().setCurrentDriverTo(driver);
        return driver;
    }
}
