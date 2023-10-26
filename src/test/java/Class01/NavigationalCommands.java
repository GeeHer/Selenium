package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.google.com");
        // Maximize the window
        driver.manage().window().maximize();
        // Slow down the observe process
        Thread.sleep(2000);
        // Navigate to Facebook
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);
        // Go back
        driver.navigate().back();
        Thread.sleep(2000);
        // Go forward
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        // Close
        driver.close();
        // Also we can use quit()
    }
}
