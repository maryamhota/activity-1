package tek.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        Thread.sleep(3);
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        By SearchLocator = By.className("searchInput");

        WebElement SearchInput = driver.findElement(SearchLocator);
        SearchInput.sendKeys("Camera");

        // for every element we take 3 steps

        By searchBtnLocator = By.id("searchBtn");// we store it in the BY element and name it something
        // we ask driver to find it by passing the name we gave above
        // this will return an element so, we store it in a web element
        WebElement searchBtnElement = driver.findElement(searchBtnLocator);
        // then we call the element search and use the .click method
        searchBtnElement.click();

    }
}
