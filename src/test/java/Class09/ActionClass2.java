package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;

public class ActionClass2 extends CommonMethods {
    public static void main(String[] args) {
        String url="http://demo.guru99.com/test/simple_context_menu.html";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

        Actions action = new Actions(driver);
        action.contextClick(rightClick).perform();

//     draggable
       WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));

//     dropLocation
       WebElement dropLocation = driver.findElement(By.xpath("//div[@id='droppable']"));

//     action.dragAndDrop(draggable,dropLocation).perform();
//     whenever we are chaining more than 1 method in action class we have to use .build() at the end and then call . perform()
       action.clickAndHold(draggable).moveToElement(dropLocation).release().build().perform();
    }
}
