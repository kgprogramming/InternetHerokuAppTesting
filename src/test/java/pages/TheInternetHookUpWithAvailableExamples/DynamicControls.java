package pages.TheInternetHookUpWithAvailableExamples;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class DynamicControls extends MainMethods {
    private final By checkbox=By.xpath("//input[@type='checkbox']");
    private final By buttonRemove=By.xpath("//button[text()='Remove']");
    private final By textAfterRemove=By.xpath("//p[@id='message']");
    private final By inputDisabled=By.xpath("//input[@disabled]");
    private final By enableButton=By.xpath("//button[text()='Enable']");
    private final By enabledInputField=By.xpath("//input[@type='text']");
    public DynamicControls clickOnCheckBox(){
        click(checkbox);
        test.log(LogStatus.INFO, "Button [checkbox] is clicked");
        return this;
    }
    public DynamicControls clickOnRemoveButton(){
        click(buttonRemove);
        test.log(LogStatus.INFO, "Button [Remove] is clicked");
        return this;
    }
    public DynamicControls verifyThatYouRemoveCheckbox() throws InterruptedException {
        Thread.sleep(4000);
        verifyThatElementIsNotVisible(checkbox);
        test.log(LogStatus.INFO, "Button [checkbox] is not visible anymore");
        return this;
    }
    public DynamicControls verifyParagraphSuccessfully(){
        verifyThatElementIsVisible(textAfterRemove);
        test.log(LogStatus.INFO, "Paragraph [it's gone] is now visible");
        return this;
    }
    public DynamicControls verifyThatInputFieldIsDisabled(){
        verifyThatElementIsVisible(inputDisabled);
        test.log(LogStatus.INFO, "Input field is disabled");
        return this;
    }
    public DynamicControls clickOnEnableButton(){
        click(enableButton);
        test.log(LogStatus.INFO, "Button [Enable] is clicked");
        return this;
    }
    public DynamicControls verifYThatInputFieldIsNowEnabled() throws InterruptedException{
        Thread.sleep(4000);
        verifyThatElementIsVisible(enabledInputField);
        test.log(LogStatus.INFO, "Input field is now enabled");
        return this;
    }
    public DynamicControls typeInInputField(){
      type(enabledInputField,"petar tester");
        test.log(LogStatus.INFO, "[Petar tester] is typed in input field");
        return this;
    }
    public Homepage getBackToHomepage(){
        getDriver().navigate().to("http://the-internet.herokuapp.com/");
        return new Homepage();
    }
}
