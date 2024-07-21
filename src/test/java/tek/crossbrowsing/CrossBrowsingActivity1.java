package tek.crossbrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Scanner;

public class CrossBrowsingActivity1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose browser, chrome, edge and firefox");
        String browserType = scanner.next();
        // web driver interface
        WebDriver driver;
        //if (browserType.equalsIgnoreCase("chrome")) {  We can use ignore case method to ignore the case sensitivity
        if (browserType.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserType.equals("edge")) ;
        driver = new EdgeDriver();
    }
}
