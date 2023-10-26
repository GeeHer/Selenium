package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

        WebElement radioBtnMale = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
        radioBtnMale.click();

        boolean status = radioBtnMale.isSelected();
        if(status){
            System.out.println("the radio button male was selected");
        }
        else {
            System.out.println("the radio button male was not selected");
        }

        boolean btnEnableStatus = radioBtnMale.isEnabled();
        System.out.println("the male radio button is enabled "+ btnEnableStatus);

        boolean btnDisplayedStatus = radioBtnMale.isDisplayed();
        System.out.println("the male radio button is displayed "+ btnDisplayedStatus);

        List<WebElement> ageRanges = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        for(WebElement ageRange:ageRanges){
            String option = ageRange.getAttribute("value");
            if(option.equals("5 - 15")){
                ageRange.click();
            }
        }



    }


}
