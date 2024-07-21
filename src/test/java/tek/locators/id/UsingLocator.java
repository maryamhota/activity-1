package tek.locators.id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLocator {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        // this method slows down the browsers
        Thread.sleep(3000);// we need to throw an exception to bypass the error
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        // we use the By method to locate the elements, when you import the by it wil give us all the locator options
        // By is a class
        // locate the element
        By searchInputLocator = By.id("SearchInput");
        // find the element
        WebElement searchInputElement = driver.findElement(searchInputLocator);
        // perform the action
        searchInputElement.sendKeys("TV");

        // for every element we take 3 steps

        By searchBtnLocator = By.id("searchBtn");// we store it in the BY element and name it something
        // we ask driver to find it by passing the name we gave above
        // this will return an element so, we store it in a web element
        WebElement searchBtnElement = driver.findElement(searchBtnLocator);
        // then we call the element search and use the .click method
        searchBtnElement.click();

    }
}
