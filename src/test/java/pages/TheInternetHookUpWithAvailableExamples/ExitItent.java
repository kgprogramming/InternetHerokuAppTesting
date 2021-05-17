package pages.TheInternetHookUpWithAvailableExamples;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.interactions.Mouse;

import java.awt.*;

public class ExitItent extends MainMethods {
    private final By closeButton=By.xpath("//p[text()='Close']");

    public ExitItent goWithMouseOutViewPortAndClickClose() throws InterruptedException, AWTException {
        Thread.sleep(400);
        Robot robot = new Robot();
        robot.mouseMove(500,0);
        Thread.sleep(2000);
        click(closeButton);
        test.log(LogStatus.INFO, "Button [start] is clicked");
        return this;
    }

    public Homepage getBackToHomepage(){
        getDriver().navigate().back();
        return new Homepage();
    }
}
