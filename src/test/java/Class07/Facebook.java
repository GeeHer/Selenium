package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.time.Duration;

public class Facebook extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://facebook.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url,browser);


        WebElement createNewAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAccount.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("moazzam");
    }
}
