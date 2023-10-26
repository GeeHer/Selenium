package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookExample {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();


        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("moazzamsadiq94@gmail.com");

        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("abracadabra");

        WebElement loginBtn = driver.findElement(By.name("login"));
        loginBtn.click();


    }
}
