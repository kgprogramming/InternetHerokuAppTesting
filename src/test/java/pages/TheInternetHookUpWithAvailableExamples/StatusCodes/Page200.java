package pages.TheInternetHookUpWithAvailableExamples.StatusCodes;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import pages.TheInternetHookUpWithAvailableExamples.StatusCodePage;

public class Page200 extends MainMethods {
    private final By text=By.xpath("//p");
    private final By buttonBack=By.xpath("//a[@href='/status_codes']");

    public Page200 verifyTextOnPages1(){
        click(text);
        test.log(LogStatus.INFO, "Paragraph is visible");
        return this;
    }
    public StatusCodePage clickOnButtonBack(){
getDriver().navigate().to("http://the-internet.herokuapp.com/status_codes");
        test.log(LogStatus.INFO, "Button [click here] is clicked");
        return new StatusCodePage();}

}
