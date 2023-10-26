package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&ifkv=AYZoVhd0Gao0nqqTQ_KUXINYg1jlN278-9P4iUoZJr-T3oo5iC4G1rjvJytN5-Dq0Qn6lDXO0Z2H&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1711289459%3A1696468154007587&theme=glif");
        driver.manage().window().maximize();

        // Click on Help
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
        // Click on Privacy
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();

        // Task1: Get the window handle of the main page i.e. gmail.com and print it out on the console
        String gmailHandle = driver.getWindowHandle();
        System.out.println(gmailHandle);

        // Task2: Switch the focus of your webDriver to the privacy window
        // Get all the handles and get the desired one

        // Loop through all the handles
        Set<String> allHandles = driver.getWindowHandles();
        for(String handle:allHandles){
            // Switch to the first handle in list
            driver.switchTo().window(handle);
            // Get the title of the window on which the focus is
            String title = driver.getTitle();
            // Check
            if(title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google")){
                break;
            }
        }
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }
}