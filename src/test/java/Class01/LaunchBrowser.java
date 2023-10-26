package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        // Declare the instance of WebDriver Class
        WebDriver driver = new ChromeDriver();

        // Use the driver.get() method
        driver.get("https://www.google.com");

        // Maximize your window
        driver.manage().window().maximize();

        // Get the URL of the website
        String currentURL = driver.getCurrentUrl();
        System.out.println("The current URL is "+currentURL);

        // Get the title
        String title = driver.getTitle();
        System.out.println("The title of this page is "+title);

        // Added a wait for 2 seconds to slow the closing of the window
        Thread.sleep(2000);

        // Close the browser
        driver.quit();

    }
}
