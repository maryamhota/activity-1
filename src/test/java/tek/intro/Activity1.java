package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    public static void main(String[] args) {
        //Open Chrome Browser
        //Navigate to facebook.com
        //Push activity to repository
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");

    }
}
