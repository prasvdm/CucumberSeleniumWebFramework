package pages;

import utility.BrowserDriver;

public class GmaiLoginPage extends BrowserDriver {
    public static String gmail = "https://mail.google.com/";
    public static void launch_Gmail(){
        driver.get(gmail);
    }
}
