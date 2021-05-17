package pages.TheInternetHookUpWithAvailableExamples.Frames;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import pages.TheInternetHookUpWithAvailableExamples.Homepage;

public class IFrames extends MainMethods {
    private final By iframeParagraph=By.xpath("//iframe[@id='mce_0_ifr']");
    private final By inputFieldForText=By.xpath("//body[@id='tinymce']");
    public IFrames typeOnIFrame(){
        switchToIFrame(iframeParagraph);
        type(inputFieldForText,"Petar Vulovic 042/2017 Testing");
        test.log(LogStatus.INFO, "Text is input in field");
        return this;
    }
    public Homepage getBackToHomepage(){
        getDriver().navigate().to("http://the-internet.herokuapp.com/");
        return new Homepage();
    }
}
