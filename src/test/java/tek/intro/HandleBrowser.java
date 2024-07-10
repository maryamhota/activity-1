package tek.intro;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowser {
    public static void main(String[] args) {
        // opens chrome browser
        ChromeDriver chromeDriver = new ChromeDriver();
        // to maximize the browser
        chromeDriver.manage().window().maximize();
        //Navigates to a URL
        chromeDriver.get("https://google.com");
        // to close a browser entirely
        chromeDriver.quit();
        //this method returns a string, so we store it in string data type
        // this is used in automation to validate if the title of a page is correct
        String title = chromeDriver.getTitle();
        System.out.println(title);




    }
}
