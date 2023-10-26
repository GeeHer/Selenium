package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/cssSelector.php");
        driver.manage().window().maximize();

        WebElement profileID = driver.findElement(By.cssSelector("input[id='profileID']"));
        profileID.sendKeys("GuillermoHerrera");

        WebElement profileName = driver.findElement(By.cssSelector("input#profileBox"));
        profileName.sendKeys("hello");

        WebElement feedBackJenny = driver.findElement(By.cssSelector("input[class='form-control feedbackBox1']"));
        feedBackJenny.sendKeys("website isn't working");

        WebElement feedBackRaj = driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedBackRaj.sendKeys("website is working");

        WebElement courseTopic = driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseTopic.sendKeys("selenium");

        WebElement advancedCSS = driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        advancedCSS.sendKeys("welcome");

        WebElement conclusionCSS = driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusionCSS.sendKeys("all is good");





    }
}
