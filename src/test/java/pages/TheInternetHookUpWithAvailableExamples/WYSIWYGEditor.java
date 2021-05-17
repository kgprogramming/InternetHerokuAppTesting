package pages.TheInternetHookUpWithAvailableExamples;

import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class WYSIWYGEditor extends MainMethods {
    private final By iframe=By.xpath("//iframe[@id='mce_0_ifr']");
    private final By paragraph=By.xpath("//p");
    public WYSIWYGEditor typeTextOnWYSIWYGEditor(){
        switchToIFrame(iframe);
        getDriver().findElement(paragraph).sendKeys( Keys.CONTROL+"A");
        getDriver().findElement(paragraph).sendKeys(Keys.CONTROL +"X");
        type(paragraph,"Petar tester 042/2017");
        String textFromIframe=getDriver().findElement(paragraph).getText();
        System.out.println(textFromIframe);
        return this;
    }
    public Homepage getBackToHomepage(){
        getDriver().navigate().back();
        return new Homepage();
    }
}
