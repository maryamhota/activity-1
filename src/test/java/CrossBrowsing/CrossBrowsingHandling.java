package CrossBrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class CrossBrowsingHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose browser chrome, firefox");
        String browserType = scanner.next();

        WebDriver driver;
        if(browserType.equals("Chrome")){
            driver = new ChromeDriver();
        }else if (browserType.equals("firefox")){
            driver = new FirefoxDriver();
        }else if (browserType.equals("edge")){
            driver = new EdgeDriver();
        }else{
            throw new RuntimeException("Wrong driver");
        }
    }
}
