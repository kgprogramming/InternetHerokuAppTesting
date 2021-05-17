package pages.TheInternetHookUpWithAvailableExamples;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class InputNumbers extends MainMethods {
    private final By input=By.xpath("//input");
    public InputNumbers typeNumberInInputField(){
        type(input,"3");
        for (int i=0; i<5; i++){
            getDriver().findElement(input).sendKeys(Keys.ARROW_UP);
            String textFromINput =getDriver().findElement(input).getText();
            System.out.println(""+textFromINput);
        }

        test.log(LogStatus.INFO, "Input number is typed");
        return this;
    }
    public Homepage getBackToHomepage(){
        getDriver().navigate().back();
        return new Homepage();
    }
}
