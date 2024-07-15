package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class acitivity2 {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        //navigate to "https://dev.insurance.tekshool-students.com/"
        driver.get("https://dev.insurance.tekschool-students.com/");
        // maximize the browser
        driver.manage().window().maximize();
        // get title- this needs to be stored int String, to return the title
        String title = driver.getTitle();
        System.out.println(title);
        //quit browser
        driver.quit();
    }
}
