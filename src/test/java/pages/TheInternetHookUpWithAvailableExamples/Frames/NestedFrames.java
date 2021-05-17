package pages.TheInternetHookUpWithAvailableExamples.Frames;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.TheInternetHookUpWithAvailableExamples.FramePage;
import pages.TheInternetHookUpWithAvailableExamples.Homepage;

public class NestedFrames extends MainMethods {
    private final By frameLeft=By.xpath("//frame[@src='/frame_left']");
    private final By frameTop=By.xpath("//frame[@src='/frame_top']");

    private final By frameBottom=By.xpath("//frame[@src='/frame_bottom']");
    private By textLeftFrame = By.tagName("body");
    private By textBottomFrame = By.tagName("body");

    public NestedFrames switchToLeftFrame(){
switchToIFrame(frameTop);
switchToIFrame(frameLeft);
        test.log(LogStatus.INFO, "Switch to left iframe");
        return this;
    }
    public NestedFrames  getTextInside_LeftFrame(){
        switchToLeftFrame();
        String resultText = getDriver().findElement(textLeftFrame).getText();
        switchToTopFrameSinceLeftFrame();
        System.out.println("Text from left iframe " +resultText);
        test.log(LogStatus.INFO, " "+resultText);
        switchToTopFrameSinceLeftFrame();

        return this;
    }
    public NestedFrames switchToBottomFrame(){
        switchToIFrame(frameBottom);
        return this;
    }
    public NestedFrames getTextInside_BottomFrame(){
        switchToBottomFrame();
        String resultText = getDriver().findElement(textBottomFrame).getText();
        System.out.println("Text from bottom iframe " +resultText);
        test.log(LogStatus.INFO, " "+resultText);
        switchTo_TopFrameSinceBottomFrame();
    return this;
    }
    private void switchToTopFrameSinceLeftFrame(){
        getDriver().switchTo().parentFrame();
        getDriver().switchTo().parentFrame();
    }

    private void switchTo_TopFrameSinceBottomFrame(){
        getDriver().switchTo().parentFrame();
    }

    public FramePage getBack(){
        getDriver().navigate().back();
        return new FramePage();
    }
    public Homepage getBackToHomepage(){
        getDriver().navigate().to("http://the-internet.herokuapp.com/");
        return new Homepage();
    }

}
