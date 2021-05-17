package pages.TheInternetHookUpWithAvailableExamples;

import main.MainMethods;
import org.openqa.selenium.By;

public class Typos extends MainMethods {
    private final By textFromP=By.xpath("//p[2]");
    public Typos verifyThatTypoIsVisible(){
        String text1= getDriver().findElement(textFromP).getText();
        refreshPage();
        String text2=getDriver().findElement(textFromP).getText();
       if (text1.equals(text2)){
           System.out.println("Typo is not visible");
       }
       else {
           System.out.println("Typo is visible");
       }
        return this;
    }
    public Homepage getBackToHomepage(){
        getDriver().navigate().back();
        return new Homepage();
    }
}
