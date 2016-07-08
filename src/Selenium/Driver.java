package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by phuc.nguyen on 7/6/2016.
 */
public class Driver {
    public static WebDriver Instance;
    public static String baseAddress = "";

    static {
        Instance = new ChromeDriver();
        turnOnWait();
    }

    public static void close() {
        Instance.close();
    }

    public static void turnOnWait() {
        Instance.manage().timeouts();
    }

    public static void turnOffWait() {
        Instance.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

    }
}
