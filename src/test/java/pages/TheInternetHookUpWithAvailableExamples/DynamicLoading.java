package pages.TheInternetHookUpWithAvailableExamples;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class DynamicLoading extends MainMethods {
    private final By buttonExample1=By.xpath("//a[@href='/dynamic_loading/1']");
    private final By buttonExample2=By.xpath("//a[@href='/dynamic_loading/2']");
    private final By buttonStart=By.xpath("//button");
    private final By textAfterStartButton=By.xpath("//h4[text()='Hello World!']");
    public DynamicLoading clickOnButtonExample1(){
        click(buttonExample1);
        test.log(LogStatus.INFO, "Button example 1 is clicked");
        return this;
    }
    public DynamicLoading verifyThatTittleHelloWorldIsNotPresenting(){
        verifyThatElementIsNotVisible(textAfterStartButton);
        test.log(LogStatus.INFO, "Tittle [Hello world!] is not visible");
        return this;
    }
    public DynamicLoading clickOnStartButton(){
        click(buttonStart);
        test.log(LogStatus.INFO, "Button [start] is clicked");
        return this;
    }
    public DynamicLoading verifyTextAfterClickButtonStart() throws InterruptedException {
        Thread.sleep(5000);
        verifyThatElementIsVisible(textAfterStartButton);
        test.log(LogStatus.INFO, "Tittle [Hello world!] is now visible");
        return this;
    }
    public DynamicLoading getBackToPreviousPage(){
        getDriver().navigate().back();
        return this;
    }
    public DynamicLoading clickOnButtonExample2(){
        click(buttonExample2);
        test.log(LogStatus.INFO, "Button example 2 is clicked");
        return this;
    }
    public Homepage getBackToHomepage(){
            getDriver().navigate().to("http://the-internet.herokuapp.com/");
        return new Homepage();}
}
