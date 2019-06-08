package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.BaseProperities;
import utils.CustomPath;

import java.io.File;
import java.io.IOException;

public class CustomScreenShot {



    public void makeScreenShot(WebDriver driver, String fileName){
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs((OutputType.FILE));

        try {
            FileUtils.copyFile(screenshot,new File(
                    new CustomPath().getProjectPath() + BaseProperities.SCREENSHOT_PATH + fileName + ".png"
            ));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
