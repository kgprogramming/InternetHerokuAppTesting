package pages.TheInternetHookUpWithAvailableExamples;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class EntryAd extends MainMethods {
    private final By closeButton=By.xpath("//p[text()='Close']");
    private final By text=By.xpath("//p[text()='If closed, it will not appear on subsequent page loads.']");
    public EntryAd clickOnClose(){

        click(closeButton);
        test.log(LogStatus.INFO, "Drag [column a] and drop to [column b]");
        return this;
    }
    public EntryAd verifyTitle(){
        verifyThatElementIsVisible(text);
        test.log(LogStatus.INFO, "Drag [column a] and drop to [column b]");
        return this;
    }
    public Homepage getBackToHomepage(){
        getDriver().navigate().back();
        return new Homepage();
    }
}
