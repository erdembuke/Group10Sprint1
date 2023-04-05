package Utilities;

import lombok.extern.java.Log;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WD {

    private static final ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    private static final ThreadLocal<String> threadBrowserName = new ThreadLocal<>();

    public static WebDriver getDriver() {
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language" , "EN");
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        if(threadBrowserName.get() == null){
            threadBrowserName.set("chrome");
        }

        if(threadDriver.get() == null){
            switch (threadBrowserName.get()){
                case "firefox":
                    threadDriver.set(new FirefoxDriver());
                    break;
                case "edge":
                    threadDriver.set(new EdgeDriver());
                    break;
                default:
                    threadDriver.set(new ChromeDriver());
            }

        }
        threadDriver.get().manage().window().maximize();
        return threadDriver.get();
    }

    public static void quitDriver() {
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        if (threadDriver.get() != null) {
            threadDriver.get().quit();
            WebDriver driver;
            driver = null;
            threadDriver.set(driver);
        }
    }

    public static void threadBrowserSet(String browserName){
        threadBrowserName.set(browserName);
    }

    public static String threadBrowserGet() {
        return threadBrowserName.get();
    }
}
