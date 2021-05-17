package pages.TheInternetHookUpWithAvailableExamples.StatusCodes;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import pages.TheInternetHookUpWithAvailableExamples.Homepage;
import pages.TheInternetHookUpWithAvailableExamples.StatusCodePage;

public class Page500 extends MainMethods {
    private final By text=By.xpath("//p");
    private final By buttonBack=By.xpath("//a[@href='/status_codes']");

    public Page500 verifyTextOnPages4(){
        click(text);
        test.log(LogStatus.INFO, "Paragraph is visible");
        return this;
    }
    public StatusCodePage clickOnButtonBack(){
        click(buttonBack);
        test.log(LogStatus.INFO, "Button [click here] is clicked");
        return new StatusCodePage();}

}
