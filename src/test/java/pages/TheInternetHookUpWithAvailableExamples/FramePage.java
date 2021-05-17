package pages.TheInternetHookUpWithAvailableExamples;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import pages.TheInternetHookUpWithAvailableExamples.Frames.IFrames;
import pages.TheInternetHookUpWithAvailableExamples.Frames.NestedFrames;

public class FramePage extends MainMethods {
    private final By nestedFrames=By.xpath("//a[@href='/nested_frames']");
    private final By iframesPage=By.xpath("//a[@href='/iframe']");
    public NestedFrames clickOnNestedFramesPage() {
        click(nestedFrames);
        test.log(LogStatus.INFO, "Page [nested frames] is clicked");
        return new NestedFrames();
    }
    public IFrames clickOnIFramesPage() {
    click(iframesPage);
    test.log(LogStatus.INFO, "Page [iframes] is clicked");
    return new IFrames();
    }
    public Homepage getBackOnHomepage(){
        getDriver().navigate().back();
        return new Homepage();
    }
}
