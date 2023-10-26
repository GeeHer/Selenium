package Class09;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.CommonMethods;

import java.io.File;
import java.io.IOException;

public class ScreenShot extends CommonMethods {
    public static void main(String[] args) throws IOException {
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        // Declare the instance
        TakesScreenshot ts = (TakesScreenshot) driver;

        // Take screen shot
        File ss = ts.getScreenshotAs(OutputType.FILE);

        // Then save on computer
        FileUtils.copyFile(ss,new File("C:\\Users\\User\\IdeaProjects\\syntaxSdetBatch17\\screenshot\\abc.png"));
    }
}
