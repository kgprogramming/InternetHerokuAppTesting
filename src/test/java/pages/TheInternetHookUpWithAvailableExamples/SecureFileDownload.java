package pages.TheInternetHookUpWithAvailableExamples;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class SecureFileDownload extends MainMethods {
    private final By downloadLink=By.xpath("//a[2]");

    public SecureFileDownload typeTextForUsernameAndPAssword(){
        getDriver().get("http://admin:admin@the-internet.herokuapp.com/download_secure");
        test.log(LogStatus.INFO, "We login succesfully on download secure");
        return this;
    }
    public SecureFileDownload clickOnDownloadLike() throws InterruptedException{
        verifyThatElementIsVisible(downloadLink);
        click(downloadLink);
        Thread.sleep(1000);
        getLastModifiedFileName("A://firstProject//folder");
            test.log(LogStatus.INFO, "We download secure picture");
        return this;
    }
    public Homepage goingToHomepage(){
        getDriver().navigate().to("http://the-internet.herokuapp.com/");
        return new Homepage();
    }


}
