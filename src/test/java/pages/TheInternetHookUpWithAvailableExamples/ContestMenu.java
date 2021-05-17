package pages.TheInternetHookUpWithAvailableExamples;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ContestMenu extends MainMethods {
    private final By div=By.xpath("//div[@id='hot-spot']");
    private final By paragraph=By.xpath("//p[1]");
    public ContestMenu rightClickOnDiv(){
        Actions action = new Actions(getDriver());

        WebElement link = getDriver().findElement(div);
        action.contextClick(link).perform();

        return this;
    }
    public ContestMenu swicthToAlert(){
        String alertMessage=getDriver().switchTo().alert().getText();
        test.log(LogStatus.INFO, "[You selected yes] is visible"+alertMessage);
        getDriver().switchTo().alert().accept();
        return this;
    }

    public Homepage getBackToHomepage(){

        getDriver().navigate().to("http://the-internet.herokuapp.com/");

        return new Homepage();
    }
}
