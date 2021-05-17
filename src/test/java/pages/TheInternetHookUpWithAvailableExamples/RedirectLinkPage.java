package pages.TheInternetHookUpWithAvailableExamples;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class RedirectLinkPage extends MainMethods {
    private final By buttonRedirect=By.xpath("//a[@id='redirect']");
public StatusCodePage clickOnStatusCodePage(){
    click(buttonRedirect);

    test.log(LogStatus.INFO, "Click on button redirect page");
    return new StatusCodePage();
}
}
