package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BrowserDriver;

public class GmaiLoginPage extends BrowserDriver {
    public static String gmail = "https://mail.google.com/";
    static By gmailBox = By.id("identifierId");

    static By errorText = By.xpath("//*[contains(text(),'Couldn’t')]");


    public static void launch_Gmail() {
        driver.get(gmail);
    }


    public static void enterGmail(String gmail) {

        WebElement gmailTextBox = driver.findElement(gmailBox);
        gmailTextBox.click();
        gmailTextBox.sendKeys(gmail);
        driver.findElement(By.id("identifierNext")).click();
    }

    public static String retrieveErrorMessage() {
        String error = driver.findElement(errorText).getText();
        return error;
    }
}