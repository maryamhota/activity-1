package tek.locators.other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");

        driver.manage().window().maximize();
        Thread.sleep(3);

        By signInLocator = By.id("signinLink"); // searching by id locator and store it in "By" object
        WebElement signInElement = driver.findElement(signInLocator); // returning webelement, we store it in webelement
        signInElement.click();// use the method we like it to perform

        By emailInputLocator = By.id("email");
        WebElement emailInputElement = driver.findElement(emailInputLocator);
        emailInputElement.sendKeys("mhotak.us@gmail.com");

        By passwordLocator = By.id("password");
        WebElement passwordElement = (WebElement) driver.findElements(passwordLocator);
        passwordElement.sendKeys("pass@word123");

        By logInBtn = By.id("loginBtn");
        WebElement logInBtnElement = driver.findElement(logInBtn);
        passwordElement.click();
    }
}
