package pages.TheInternetHookUpWithAvailableExamples;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage extends MainMethods {
    private final By textFromImage1=By.xpath("//div[@class='figcaption']//h5[text()='name: user1']");
    private final By textFromImage2=By.xpath("//div[@class='figcaption']//h5[text()='name: user2']");
    private final By textFromImage3=By.xpath("//div[@class='figcaption']//h5[text()='name: user3']");
    Actions hoverAction = new Actions(getDriver());

    public HoversPage hoverOnImageOne(){
        WebElement picOne=getDriver().findElement(By.xpath("//div[@id='content']//descendant::div[@class='figure'][1]"));
        hoverAction.moveToElement(picOne).build().perform();
        verifyThatElementIsVisible(textFromImage1);
        test.log(LogStatus.INFO, "Image one is hover over");
        return this;
    }

    public HoversPage hoverOnImageTwo(){
        WebElement picTwo=getDriver().findElement(By.xpath("//div[@id='content']//descendant::div[@class='figure'][2]"));
        hoverAction.moveToElement(picTwo).build().perform();
        verifyThatElementIsVisible(textFromImage2);
        test.log(LogStatus.INFO, "Image two is hover over");
        return this;
    }

    public HoversPage hoverOnImageThree(){
        WebElement picThree=getDriver().findElement(By.xpath("//div[@id='content']//descendant::div[@class='figure'][3]"));
        hoverAction.moveToElement(picThree).build().perform();
        verifyThatElementIsVisible(textFromImage3);
        test.log(LogStatus.INFO, "Image three is hover over");
        return this;
    }
    public Homepage getBackToHome(){
       getDriver().navigate().back();
        return new Homepage();
    }
}
