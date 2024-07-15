package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowser {
    public static void main(String[] args) {
        //Create an object of the driver to open the browser
        ChromeDriver chromeDriver = new ChromeDriver();
        //Navigate to the url
        chromeDriver.get("https://google.com");
        // String return of application
        String title = chromeDriver.getTitle();
        System.out.println();
        // to close browser
        chromeDriver.quit();


    }
}
