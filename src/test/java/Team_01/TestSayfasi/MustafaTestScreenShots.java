package Team_01.TestSayfasi;

import Team_01.Utilities.Driver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class MustafaTestScreenShots {

    @Test
    public void screenshots() throws IOException {

        Driver.getDriver().get("https://www.amazon.com");
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File(".\\photo.png"));


    }
}
