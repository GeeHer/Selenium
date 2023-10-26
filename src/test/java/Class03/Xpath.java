package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/Xpath.php");
        driver.manage().window().maximize();
        WebElement textBox1 = driver.findElement(By.xpath("//input[@id='title']"));
        textBox1.sendKeys("batch16");
        WebElement textBox2 = driver.findElement(By.xpath("//input[@name='title']"));
        textBox2.sendKeys("batch17");
        WebElement question1 = driver.findElement(By.xpath("//input[contains(@name,'security')]"));
        question1.sendKeys("whats the color of the sun?");

        WebElement theMagicalText = driver.findElement(By.xpath("//label[contains(text(),'Lorem']"));
        System.out.println(theMagicalText.getText());

        WebElement textBoxAPI = driver.findElement(By.xpath("//input[starts-with(@id,'api')]"));
        textBoxAPI.sendKeys("abracadabra");

        WebElement email1 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        email1.sendKeys("hello1@gmail.com");

        WebElement email2 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        email2.sendKeys("cancione@gmail.com");

        WebElement email3 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        email3.sendKeys("welcome@gmail.com");

        WebElement field1 = driver.findElement(By.xpath("//input[@data-detail= 'one' and @name = 'customField']"));
        field1.sendKeys("cat");

        WebElement field2 = driver.findElement(By.xpath("//input[@data-detail= 'two' and @name = 'customField']"));
        field2.sendKeys("dog");


    }
}
