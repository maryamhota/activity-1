package tek.crossbrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBroswsingHandling {

    public static void main(String[] args) {
        String browserType = "chrome";

        // to use interface, we need to create object of the webdriver, but not instantiate it
        WebDriver driver;

        if (browserType.equals("chrome")) { // if driver is chrome, create an object of chrome driver
            driver = new ChromeDriver();
        } else if (browserType.equals("edge")) {
            driver = new EdgeDriver();
        } else if (browserType.equals("firefox")) {
            driver = new FirefoxDriver();
        } else {
            // throwing a run time exception
            throw new RuntimeException("Wrong driver");
        }
        driver.get("https://google.com");

    }
}
