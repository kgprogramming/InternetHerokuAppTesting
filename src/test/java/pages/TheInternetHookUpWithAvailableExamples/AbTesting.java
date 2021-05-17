package pages.TheInternetHookUpWithAvailableExamples;

import main.MainMethods;
import org.openqa.selenium.By;

public class AbTesting extends MainMethods {
private final By text=By.xpath("//p");
public AbTesting verifyThatTextIsVisible(){
    verifyThatElementIsVisible(text);
    return this;
}
    public Homepage getBackToHomepage(){
        getDriver().navigate().back();
        return new Homepage();
    }
}
