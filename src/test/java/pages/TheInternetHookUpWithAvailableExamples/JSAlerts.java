package pages.TheInternetHookUpWithAvailableExamples;

import main.MainMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;


public class JSAlerts extends MainMethods {
private final By buttonForJSAlerts= By.xpath("//div[@class='example']//ul//li[1]//button");
    private final By buttonForConfirmAlerts= By.xpath("//div[@class='example']//ul//li[2]//button");
    private final By buttonForPromptAlerts= By.xpath("//div[@class='example']//ul//li[3]//button");
    private final By resultText=By.xpath("//p[@id='result']");

    public JSAlerts clickOnFirtsButtonAlerts(){
        click(buttonForJSAlerts);
       String text= getDriver().switchTo().alert().getText();
        System.out.println(text);
        getDriver().switchTo().alert().accept();
        return this;
    }
    public JSAlerts verifyResultText(){
        verifyThatElementIsVisible(resultText);
        String result=getDriver().findElement(resultText).getText();
        System.out.println(result);
        return this;
    }
    public JSAlerts clickOnConfirmButtonAlerts(){
        click(buttonForConfirmAlerts);
        String text= getDriver().switchTo().alert().getText();
        System.out.println(text);
        getDriver().switchTo().alert().accept();
        return this;
    }
    public JSAlerts clickOnPromptAlertButton(){
        click(buttonForPromptAlerts);
        String text= getDriver().switchTo().alert().getText();
        System.out.println(text);
        Alert promptAlert  = getDriver().switchTo().alert();
        promptAlert.sendKeys("Petar tester");
        promptAlert.accept();
        return this;
    }
    public Homepage backToHomepage(){
        getDriver().navigate().back();
        return new Homepage();
    }
}
