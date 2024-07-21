package tek.locators.other;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(3);
        driver.findElement(By.className("q")).sendKeys("Tekschool");
        driver.findElement(By.className("Fgvgjc")).click();


    }
}
