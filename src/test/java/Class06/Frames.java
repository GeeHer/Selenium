package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {
    public static void main(String[] args) {
        // Make the instance
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/handle-iframe.php");
        driver.manage().window().maximize();

        // Write down the topic
        // Switch to the iframe
        driver.switchTo().frame(0);
        WebElement topic = driver.findElement(By.xpath("input[@name='Topic']"));
        topic.sendKeys("Hello");

        // Click on checkbox using the name or ID
        driver.switchTo().frame("checkboxIframe");
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

        // Switch to default
        driver.switchTo().defaultContent();

        WebElement frameX = driver.findElement(By.xpath("//iframe[@name='dropdown-iframe']"));
        driver.switchTo().frame(frameX);

        WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel = new Select(animals);
        sel.selectByVisibleText("Baby Cat");



    }
}
