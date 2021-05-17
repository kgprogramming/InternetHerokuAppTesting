package pages.TheInternetHookUpWithAvailableExamples;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class DigestAuth extends MainMethods {
    private final By paragraphOnBasicAuth=By.xpath("//p");

    public DigestAuth typeTextInInput2(){
        getDriver().get("http://admin:admin@the-internet.herokuapp.com/digest_auth");
        verifyThatElementIsVisible(paragraphOnBasicAuth);
        test.log(LogStatus.INFO, "We login successfully on digest auth");
        return this;
    }
    public Homepage getBackToHomepage(){
        getDriver().navigate().to("http://the-internet.herokuapp.com/");
        return new Homepage();
    }

}
