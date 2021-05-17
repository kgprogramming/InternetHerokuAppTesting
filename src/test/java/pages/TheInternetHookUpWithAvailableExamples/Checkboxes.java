package pages.TheInternetHookUpWithAvailableExamples;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class Checkboxes extends MainMethods {
private final By checkbox1=By.xpath("//input[@type='checkbox'][1]");
    private final By checkbox2=By.xpath("//input[@type='checkbox'][2]");
private final By checkbox1IsClicked=By.xpath("//input[@type='checkbox' and @checked='']");
    public Checkboxes clickOnChechbox1()
    {
        click(checkbox1);
        test.log(LogStatus.INFO, "Button [checkbox 1] is clicked");
        return this;
    }
    public Checkboxes clickOnChechbox2()
    {
        click(checkbox2);
        test.log(LogStatus.INFO, "Button [checkbox 2] is clicked");
        return this;
    }
    public Checkboxes verifyThathChecbox1IsChecked(){
        verifyThatElementIsVisible(checkbox1IsClicked);
        test.log(LogStatus.INFO, "Button [checkbox 1] is checked");
        return this;
    }
    public Checkboxes verifyThatCheckbox2IsUnChecked(){
        verifyThatElementIsVisible(checkbox2);
        test.log(LogStatus.INFO, "Button [checkbox 2] is unchecked");
        return this;
    }
    public Homepage getBackToHomepage(){
        getDriver().navigate().back();
        return new Homepage();
    }
}
