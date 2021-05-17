package pages.TheInternetHookUpWithAvailableExamples;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class AddRemoveElements extends MainMethods {
    private final By addElementButton=By.xpath("//button");
    private final By buttonElement=By.xpath("//button[@class='added-manually']");
    public AddRemoveElements clickOnAddElementButton(){
        click(addElementButton);
        test.log(LogStatus.INFO, "Button [Add elements] is clicked");
        return this;
    }
    public AddRemoveElements verifyThatNewElementIsVisible(){
        verifyThatElementIsVisible(buttonElement);
        test.log(LogStatus.INFO, "Button [Delete] is visible");
        return this;
    }
    public AddRemoveElements clickOnDeleteElementButton(){
        click(buttonElement);
        test.log(LogStatus.INFO, "Button [Add elements] is clicked");
        return this;
    }
    public AddRemoveElements verifyThatNewElementIsNotVisibleAnymore(){
        verifyThatElementIsNotVisible(buttonElement);
        test.log(LogStatus.INFO, "Button [Delete] is visible");
        return this;
    }
    public Homepage getBackToHomepage(){
        getDriver().navigate().back();
        return new Homepage();
    }
}
