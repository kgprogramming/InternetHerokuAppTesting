package pages.TheInternetHookUpWithAvailableExamples;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import pages.TheInternetHookUpWithAvailableExamples.StatusCodes.Page200;


public class StatusCodePage extends MainMethods {
    private final By button200=By.xpath("//a[@href='status_codes/200']");
    private final By button301=By.xpath("//a[@href='status_codes/301']");
    private final By button404=By.xpath("//a[@href='status_codes/404']");
    private final By button500=By.xpath("//a[@href='status_codes/500']");
    private final By text=By.xpath("//p");
    private final By buttonBack=By.xpath("//a[@href='status_codes']");
    public Page200 clickOnButton200(){
        click(button200);
        test.log(LogStatus.INFO, "Button [200] is clicked");
        return new Page200();
    }
    public StatusCodePage clickOnButton301(){
        click(button301);
        test.log(LogStatus.INFO, "Button [301] is clicked");
        return this;
    }
    public StatusCodePage clickOnButton404(){
        click(button404);
        test.log(LogStatus.INFO, "Button [404] is clicked");
        return this;
    }
    public StatusCodePage clickOnButton500(){
        click(button500);
        test.log(LogStatus.INFO, "Button [500] is clicked");
        return this;
    }
    public Homepage goingToHomepage(){
        getDriver().navigate().to("http://the-internet.herokuapp.com/");
        return new Homepage();
    }


}
