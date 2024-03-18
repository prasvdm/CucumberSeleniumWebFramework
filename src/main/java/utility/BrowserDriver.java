package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {
    public static WebDriver driver;
    public ChromeOptions options;

    public BrowserDriver() {
        this.driver = driver;
        /* bove 115 chrome version system.setproperty is not required as the new feature auto detect chrome
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"src/main/resources/" +
                "chromedriver.exe");*/
        this.driver = new ChromeDriver();
    }

    public void close() {
        this.driver.close();
    }
}
