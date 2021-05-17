package pages.TheInternetHookUpWithAvailableExamples;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class NotificationMessage extends MainMethods{
    private final By buttonClickHere=By.xpath("//a[@href='/notification_message']");
    private final By div=By.xpath("//div[@class='flash notice']");
public NotificationMessage getMessageFromDiv(){
    verifyThatElementIsVisible(div);
    String text=getDriver().findElement(div).getText();
    System.out.println("Text before clicking button"+text);
    click(buttonClickHere);
    String text1=getDriver().findElement(div).getText();
    if (text.equals(text1)){
        System.out.println("Text it's same");
    }
    else{
        System.out.println("Text notification after pressing button [click here is: "+ text1);
    }
    test.log(LogStatus.INFO, "Text from div is ");
    return this;
}
public NotificationMessage getBackToHomepageFromNotificationPage(){
  getDriver().navigate().to("http://the-internet.herokuapp.com/");

    return this;
}

}
