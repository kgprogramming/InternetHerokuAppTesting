package pages.TheInternetHookUpWithAvailableExamples;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class DropDown extends MainMethods {
    private final By optionInSection=By.xpath("//option[text()='Option 2']");
    private final By select=By.xpath("//select[@id='dropdown']");
    private final By verifyOptionInSelect=By.xpath("//select[@id='dropdown']//option[text()='Option 2']");
    public DropDown clickOnSelect(){
        click(select);
        test.log(LogStatus.INFO, "Dropdown is clicked");
        return this;
    }
    public DropDown clickOnOptionInDropdown(){
        click(optionInSection);
        test.log(LogStatus.INFO, "Option from dropdown is clicked");
        return this;
    }
    public DropDown verifyThatYouSelectOption2InDropDown(){
        verifyThatElementIsVisible(verifyOptionInSelect);
        test.log(LogStatus.INFO, "Option 2 from dropdown is visible");
        getDriver().navigate().back();
        return this;
    }
public Homepage getBackToHomepage(){
    getDriver().navigate().to("http://the-internet.herokuapp.com/");
    return new Homepage();
}

}
