package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

public class ExplicitWait extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://35.175.58.98/synchronization-explicit-wait.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url,browser);

       /* As the button takes some time to be clickable
          I will wait until it is clickable using explicit wait */
        WebElement enableBtnBtn = driver.findElement(By.xpath("//button[@id='enable_button']"));
        enableBtnBtn.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));

        // Wait is over, then the following lines will be executed
        WebElement enableBtn = driver.findElement(By.xpath("//button[text()='Button']"));
        enableBtn.click();

        // Click to alert button so alert appears
        WebElement alertBtn = driver.findElement(By.xpath("//button[@id='show_alert']"));
        alertBtn.click();

        // I need to wait for alert to be present
        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();
    }
}
