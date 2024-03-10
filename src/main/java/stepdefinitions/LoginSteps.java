package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    private WebDriver driver;
   public void login() {
       //System.setProperty("webdriver.chrome.driver", "src/main/resources/driverChrome/Google Chrome for Testing.app" +

       driver = new ChromeDriver();
       driver.get("https://www.google.com");
   }

}