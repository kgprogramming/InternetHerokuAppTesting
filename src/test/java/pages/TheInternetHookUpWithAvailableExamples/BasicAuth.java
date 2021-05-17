package pages.TheInternetHookUpWithAvailableExamples;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class BasicAuth extends MainMethods {
private final By paragraphOnBasicAuth=By.xpath("//p");
public BasicAuth typeTextInInput(){
    getDriver().get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
    verifyThatElementIsVisible(paragraphOnBasicAuth);
    test.log(LogStatus.INFO, "We login succesfully on basic auth");
    return this;
}public Homepage getBackToHomepage(){
    getDriver().navigate().to("http://the-internet.herokuapp.com/");
        return new Homepage();
    }

}
