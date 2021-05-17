package pages.TheInternetHookUpWithAvailableExamples;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class MultipleWindows extends MainMethods {
    private final By buttonNewWindow=By.xpath("//a[@href='/windows/new']");
    private final By text=By.xpath("//h3[text()='New Window']");

    public MultipleWindows clickOnButtonNewWindows(){
        click(buttonNewWindow);
        test.log(LogStatus.INFO, "Button [click here] is clicked");
        return this;
    }
    public MultipleWindows verifytextOnNewTab(){
        switchToTab(1);
verifyThatElementIsVisible(text);
test.log(LogStatus.INFO, "Title [new window] is visible");
        return this;
    }
    public Homepage closeTabAndGetBackToHomepage(){
       closeTabAndSwitchToMain(1,0);
       getDriver().navigate().back();
        return new Homepage();
    }
}

